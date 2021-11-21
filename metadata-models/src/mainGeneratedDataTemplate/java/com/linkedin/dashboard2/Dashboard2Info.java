
package com.linkedin.dashboard2;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AccessLevel;
import com.linkedin.common.ChangeAuditStamps;
import com.linkedin.common.ChartUrnArray;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about a dashboard2
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dashboard2/Dashboard2Info.pdl.")
public class Dashboard2Info
    extends RecordTemplate
{

    private final static Dashboard2Info.Fields _fields = new Dashboard2Info.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dashboard2/**Information about a dashboard2*/@Aspect.name=\"dashboard2Info\"record Dashboard2Info includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the dashboard2*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the dashboard2*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:string/**Charts in a dashboard2*/@Relationship.`/*`={\"name\":\"Contains\",\"entityTypes\":[\"chart\"]}charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"chart\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Chart\",\"doc\":\"Standardized chart identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"chartId\",\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":236}typeref ChartUrn=string}]=[]/**Captures information about who created/last modified/deleted this dashboard2 and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the dashboard2. This could be used as an external link on DataHub to allow users access/view the dashboard2*/dashboard2Url:optional com.linkedin.common.Url/**Access level for the dashboard2*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this dashboard2 last refreshed*/lastRefreshed:optional com.linkedin.common.Time}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Charts = SCHEMA.getField("charts");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Dashboard2Url = SCHEMA.getField("dashboard2Url");
    private final static RecordDataSchema.Field FIELD_Access = SCHEMA.getField("access");
    private final static RecordDataSchema.Field FIELD_LastRefreshed = SCHEMA.getField("lastRefreshed");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public Dashboard2Info() {
        super(new DataMap(12, 0.75F), SCHEMA, 4);
    }

    public Dashboard2Info(DataMap data) {
        super(data, SCHEMA);
    }

    public static Dashboard2Info.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see Dashboard2Info.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see Dashboard2Info.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see Dashboard2Info.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Info.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see Dashboard2Info.Fields#customProperties
     */
    public Dashboard2Info setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#customProperties
     */
    public Dashboard2Info setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see Dashboard2Info.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see Dashboard2Info.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see Dashboard2Info.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Dashboard2Info.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see Dashboard2Info.Fields#externalUrl
     */
    public Dashboard2Info setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#externalUrl
     */
    public Dashboard2Info setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see Dashboard2Info.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see Dashboard2Info.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see Dashboard2Info.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Info.Fields#title
     */
    @Nonnull
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see Dashboard2Info.Fields#title
     */
    public Dashboard2Info setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#title
     */
    public Dashboard2Info setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see Dashboard2Info.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see Dashboard2Info.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see Dashboard2Info.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Info.Fields#description
     */
    @Nonnull
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see Dashboard2Info.Fields#description
     */
    public Dashboard2Info setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#description
     */
    public Dashboard2Info setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for charts
     * 
     * @see Dashboard2Info.Fields#charts
     */
    public boolean hasCharts() {
        return contains(FIELD_Charts);
    }

    /**
     * Remover for charts
     * 
     * @see Dashboard2Info.Fields#charts
     */
    public void removeCharts() {
        remove(FIELD_Charts);
    }

    /**
     * Getter for charts
     * 
     * @see Dashboard2Info.Fields#charts
     */
    public ChartUrnArray getCharts(GetMode mode) {
        return obtainWrapped(FIELD_Charts, ChartUrnArray.class, mode);
    }

    /**
     * Getter for charts
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Info.Fields#charts
     */
    @Nonnull
    public ChartUrnArray getCharts() {
        return obtainWrapped(FIELD_Charts, ChartUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for charts
     * 
     * @see Dashboard2Info.Fields#charts
     */
    public Dashboard2Info setCharts(ChartUrnArray value, SetMode mode) {
        putWrapped(FIELD_Charts, ChartUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for charts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#charts
     */
    public Dashboard2Info setCharts(
        @Nonnull
        ChartUrnArray value) {
        putWrapped(FIELD_Charts, ChartUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see Dashboard2Info.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see Dashboard2Info.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see Dashboard2Info.Fields#lastModified
     */
    public ChangeAuditStamps getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, ChangeAuditStamps.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Info.Fields#lastModified
     */
    @Nonnull
    public ChangeAuditStamps getLastModified() {
        return obtainWrapped(FIELD_LastModified, ChangeAuditStamps.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see Dashboard2Info.Fields#lastModified
     */
    public Dashboard2Info setLastModified(ChangeAuditStamps value, SetMode mode) {
        putWrapped(FIELD_LastModified, ChangeAuditStamps.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#lastModified
     */
    public Dashboard2Info setLastModified(
        @Nonnull
        ChangeAuditStamps value) {
        putWrapped(FIELD_LastModified, ChangeAuditStamps.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboard2Url
     * 
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    public boolean hasDashboard2Url() {
        return contains(FIELD_Dashboard2Url);
    }

    /**
     * Remover for dashboard2Url
     * 
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    public void removeDashboard2Url() {
        remove(FIELD_Dashboard2Url);
    }

    /**
     * Getter for dashboard2Url
     * 
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    public com.linkedin.common.url.Url getDashboard2Url(GetMode mode) {
        return obtainCustomType(FIELD_Dashboard2Url, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for dashboard2Url
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    @Nullable
    public com.linkedin.common.url.Url getDashboard2Url() {
        return obtainCustomType(FIELD_Dashboard2Url, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboard2Url
     * 
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    public Dashboard2Info setDashboard2Url(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_Dashboard2Url, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboard2Url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#dashboard2Url
     */
    public Dashboard2Info setDashboard2Url(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_Dashboard2Url, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for access
     * 
     * @see Dashboard2Info.Fields#access
     */
    public boolean hasAccess() {
        return contains(FIELD_Access);
    }

    /**
     * Remover for access
     * 
     * @see Dashboard2Info.Fields#access
     */
    public void removeAccess() {
        remove(FIELD_Access);
    }

    /**
     * Getter for access
     * 
     * @see Dashboard2Info.Fields#access
     */
    public AccessLevel getAccess(GetMode mode) {
        return obtainDirect(FIELD_Access, AccessLevel.class, mode);
    }

    /**
     * Getter for access
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Dashboard2Info.Fields#access
     */
    @Nullable
    public AccessLevel getAccess() {
        return obtainDirect(FIELD_Access, AccessLevel.class, GetMode.STRICT);
    }

    /**
     * Setter for access
     * 
     * @see Dashboard2Info.Fields#access
     */
    public Dashboard2Info setAccess(AccessLevel value, SetMode mode) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for access
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#access
     */
    public Dashboard2Info setAccess(
        @Nonnull
        AccessLevel value) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastRefreshed
     * 
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public boolean hasLastRefreshed() {
        return contains(FIELD_LastRefreshed);
    }

    /**
     * Remover for lastRefreshed
     * 
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public void removeLastRefreshed() {
        remove(FIELD_LastRefreshed);
    }

    /**
     * Getter for lastRefreshed
     * 
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public Long getLastRefreshed(GetMode mode) {
        return obtainDirect(FIELD_LastRefreshed, Long.class, mode);
    }

    /**
     * Getter for lastRefreshed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    @Nullable
    public Long getLastRefreshed() {
        return obtainDirect(FIELD_LastRefreshed, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public Dashboard2Info setLastRefreshed(Long value, SetMode mode) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public Dashboard2Info setLastRefreshed(
        @Nonnull
        Long value) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see Dashboard2Info.Fields#lastRefreshed
     */
    public Dashboard2Info setLastRefreshed(long value) {
        putDirect(FIELD_LastRefreshed, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Dashboard2Info clone()
        throws CloneNotSupportedException
    {
        return ((Dashboard2Info) super.clone());
    }

    @Override
    public Dashboard2Info copy()
        throws CloneNotSupportedException
    {
        return ((Dashboard2Info) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Title of the dashboard2
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Detailed description about the dashboard2
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Charts in a dashboard2
         * 
         */
        public PathSpec charts() {
            return new PathSpec(getPathComponents(), "charts");
        }

        /**
         * Charts in a dashboard2
         * 
         */
        public PathSpec charts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "charts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Captures information about who created/last modified/deleted this dashboard2 and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields lastModified() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "lastModified");
        }

        /**
         * URL for the dashboard2. This could be used as an external link on DataHub to allow users access/view the dashboard2
         * 
         */
        public PathSpec dashboard2Url() {
            return new PathSpec(getPathComponents(), "dashboard2Url");
        }

        /**
         * Access level for the dashboard2
         * 
         */
        public PathSpec access() {
            return new PathSpec(getPathComponents(), "access");
        }

        /**
         * The time when this dashboard2 last refreshed
         * 
         */
        public PathSpec lastRefreshed() {
            return new PathSpec(getPathComponents(), "lastRefreshed");
        }

    }

}
