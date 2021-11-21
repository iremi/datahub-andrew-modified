package com.linkedin.datahub.graphql.types.dashboard2;

import com.google.common.collect.ImmutableList;

import com.google.common.collect.ImmutableSet;
import com.linkedin.common.urn.CorpuserUrn;

import com.linkedin.common.urn.Urn;
import com.linkedin.data.template.StringArray;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.authorization.ConjunctivePrivilegeGroup;
import com.linkedin.datahub.graphql.authorization.DisjunctivePrivilegeGroup;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.authorization.PoliciesConfig;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.generated.AutoCompleteResults;
import com.linkedin.datahub.graphql.generated.BrowsePath;
import com.linkedin.datahub.graphql.generated.BrowseResults;
import com.linkedin.datahub.graphql.generated.Dashboard2;
import com.linkedin.datahub.graphql.generated.Dashboard2UpdateInput;
import com.linkedin.datahub.graphql.generated.EntityType;
import com.linkedin.datahub.graphql.generated.FacetFilterInput;
import com.linkedin.datahub.graphql.generated.SearchResults;
import com.linkedin.datahub.graphql.resolvers.ResolverUtils;
import com.linkedin.datahub.graphql.types.BrowsableEntityType;
import com.linkedin.datahub.graphql.types.MutableType;
import com.linkedin.datahub.graphql.types.SearchableEntityType;
import com.linkedin.datahub.graphql.types.dashboard2.mappers.Dashboard2SnapshotMapper;
import com.linkedin.datahub.graphql.types.dashboard2.mappers.Dashboard2UpdateInputSnapshotMapper;
import com.linkedin.datahub.graphql.types.mappers.AutoCompleteResultsMapper;
import com.linkedin.datahub.graphql.types.mappers.BrowsePathsMapper;
import com.linkedin.datahub.graphql.types.mappers.BrowseResultMapper;
import com.linkedin.datahub.graphql.types.mappers.UrnSearchResultsMapper;
import com.linkedin.entity.Entity;
import com.linkedin.metadata.extractor.AspectExtractor;
import com.linkedin.metadata.browse.BrowseResult;
import com.linkedin.metadata.query.AutoCompleteResult;
import com.linkedin.metadata.search.SearchResult;
import com.linkedin.metadata.snapshot.Dashboard2Snapshot;
import com.linkedin.metadata.snapshot.Snapshot;
import com.linkedin.r2.RemoteInvocationException;

import graphql.execution.DataFetcherResult;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.linkedin.datahub.graphql.Constants.BROWSE_PATH_DELIMITER;

public class Dashboard2Type implements SearchableEntityType<Dashboard2>, BrowsableEntityType<Dashboard2>, MutableType<Dashboard2UpdateInput> {

    private static final Set<String> FACET_FIELDS = ImmutableSet.of("access", "tool");

    private final EntityClient _entityClient;

    public Dashboard2Type(final EntityClient entityClient) {
        _entityClient = entityClient;
    }

    @Override
    public Class<Dashboard2UpdateInput> inputClass() {
        return Dashboard2UpdateInput.class;
    }

    @Override
    public EntityType type() {
        return EntityType.DASHBOARD2;
    }

    @Override
    public Class<Dashboard2> objectClass() {
        return Dashboard2.class;
    }

    @Override
    public List<DataFetcherResult<Dashboard2>> batchLoad(@Nonnull List<String> urns, @Nonnull QueryContext context) throws Exception {
        final List<Urn> dashboard2Urns = urns.stream()
                .map(this::getDashboard2Urn)
                .collect(Collectors.toList());

        try {
            final Map<Urn, Entity> dashboard2Map = _entityClient.batchGet(dashboard2Urns
                            .stream()
                            .filter(Objects::nonNull)
                            .collect(Collectors.toSet()),
                    context.getActor());

            final List<Entity> gmsResults = new ArrayList<>();
            for (Urn urn : dashboard2Urns) {
                gmsResults.add(dashboard2Map.getOrDefault(urn, null));
            }
            return gmsResults.stream()
                    .map(gmsDashboard2 -> gmsDashboard2 == null ? null
                            : DataFetcherResult.<Dashboard2>newResult()
                            .data(Dashboard2SnapshotMapper.map(gmsDashboard2.getValue().getDashboard2Snapshot()))
                            .localContext(AspectExtractor.extractAspects(gmsDashboard2.getValue().getDashboard2Snapshot()))
                            .build())
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Failed to batch load Dashboard2s", e);
        }
    }

    @Override
    public SearchResults search(@Nonnull String query,
                                @Nullable List<FacetFilterInput> filters,
                                int start,
                                int count,
                                @Nonnull QueryContext context) throws Exception {
        final Map<String, String> facetFilters = ResolverUtils.buildFacetFilters(filters, FACET_FIELDS);
        final SearchResult searchResult = _entityClient.search("dashboard2", query, facetFilters, start, count, context.getActor());
        return UrnSearchResultsMapper.map(searchResult);
    }

    @Override
    public AutoCompleteResults autoComplete(@Nonnull String query,
                                            @Nullable String field,
                                            @Nullable List<FacetFilterInput> filters,
                                            int limit,
                                            @Nonnull QueryContext context) throws Exception {
        final Map<String, String> facetFilters = ResolverUtils.buildFacetFilters(filters, FACET_FIELDS);
        final AutoCompleteResult result = _entityClient.autoComplete("dashboard2", query, facetFilters, limit, context.getActor());
        return AutoCompleteResultsMapper.map(result);
    }

    @Override
    public BrowseResults browse(@Nonnull List<String> path,
                                @Nullable List<FacetFilterInput> filters,
                                int start, int count,
                                @Nonnull QueryContext context) throws Exception {
        final Map<String, String> facetFilters = ResolverUtils.buildFacetFilters(filters, FACET_FIELDS);
        final String pathStr = path.size() > 0 ? BROWSE_PATH_DELIMITER + String.join(BROWSE_PATH_DELIMITER, path) : "";
        final BrowseResult result = _entityClient.browse(
                "dashboard2",
                pathStr,
                facetFilters,
                start,
                count,
                context.getActor());
        return BrowseResultMapper.map(result);
    }

    @Override
    public List<BrowsePath> browsePaths(@Nonnull String urn, @Nonnull QueryContext context) throws Exception {
        final StringArray result = _entityClient.getBrowsePaths(getDashboard2Urn(urn), context.getActor());
        return BrowsePathsMapper.map(result);
    }

    private com.linkedin.common.urn.Urn getDashboard2Urn(String urnStr) {
        try {
            return Urn.createFromString(urnStr);
        } catch (URISyntaxException e) {
            throw new RuntimeException(String.format("Failed to retrieve dashboard2 with urn %s, invalid urn", urnStr));
        }
    }

    @Override
    public Dashboard2 update(@Nonnull String urn, @Nonnull Dashboard2UpdateInput input, @Nonnull QueryContext context) throws Exception {
        if (isAuthorized(urn, input, context)) {
            final CorpuserUrn actor = CorpuserUrn.createFromString(context.getActor());
            final Dashboard2Snapshot partialDashboard2 = Dashboard2UpdateInputSnapshotMapper.map(input, actor);
            partialDashboard2.setUrn(Urn.createFromString(urn));
            final Snapshot snapshot = Snapshot.create(partialDashboard2);

            try {
                _entityClient.update(new com.linkedin.entity.Entity().setValue(snapshot), context.getActor());
            } catch (RemoteInvocationException e) {
                throw new RuntimeException(String.format("Failed to write entity with urn %s", urn), e);
            }

            return load(urn, context).getData();
        }
        throw new AuthorizationException("Unauthorized to perform this action. Please contact your DataHub administrator.");
    }

    private boolean isAuthorized(@Nonnull String urn, @Nonnull Dashboard2UpdateInput update, @Nonnull QueryContext context) {
        // Decide whether the current principal should be allowed to update the Dataset.
        final DisjunctivePrivilegeGroup orPrivilegeGroups = getAuthorizedPrivileges(update);
        return AuthorizationUtils.isAuthorized(
                context.getAuthorizer(),
                context.getActor(),
                PoliciesConfig.DASHBOARD_PRIVILEGES.getResourceType(),
                urn,
                orPrivilegeGroups);
    }

    private DisjunctivePrivilegeGroup getAuthorizedPrivileges(final Dashboard2UpdateInput updateInput) {

        final ConjunctivePrivilegeGroup allPrivilegesGroup = new ConjunctivePrivilegeGroup(ImmutableList.of(
                PoliciesConfig.EDIT_ENTITY_PRIVILEGE.getType()
        ));

        List<String> specificPrivileges = new ArrayList<>();
        if (updateInput.getOwnership() != null) {
            specificPrivileges.add(PoliciesConfig.EDIT_ENTITY_OWNERS_PRIVILEGE.getType());
        }
        if (updateInput.getEditableProperties() != null) {
            specificPrivileges.add(PoliciesConfig.EDIT_ENTITY_DOCS_PRIVILEGE.getType());
        }
        if (updateInput.getGlobalTags() != null) {
            specificPrivileges.add(PoliciesConfig.EDIT_ENTITY_TAGS_PRIVILEGE.getType());
        }
        final ConjunctivePrivilegeGroup specificPrivilegeGroup = new ConjunctivePrivilegeGroup(specificPrivileges);

        // If you either have all entity privileges, or have the specific privileges required, you are authorized.
        return new DisjunctivePrivilegeGroup(ImmutableList.of(
                allPrivilegesGroup,
                specificPrivilegeGroup
        ));
    }
}
