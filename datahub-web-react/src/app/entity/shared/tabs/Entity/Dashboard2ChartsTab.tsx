import React from 'react';
import { useBaseEntity } from '../../EntityContext';
import { EntityType } from '../../../../../types.generated';
import { EntityList } from './components/EntityList';
import { useEntityRegistry } from '../../../../useEntityRegistry';

export const Dashboard2ChartsTab = () => {
    const entity = useBaseEntity() as any;
    const dashboard2 = entity && entity.dashboard2;
    const charts = dashboard2?.charts?.relationships.map((relationship) => relationship.entity);
    const entityRegistry = useEntityRegistry();
    const totalCharts = dashboard2?.charts?.total || 0;
    const title = `Contains ${totalCharts} ${
        totalCharts === 1
            ? entityRegistry.getEntityName(EntityType.Chart)
            : entityRegistry.getCollectionName(EntityType.Chart)
    }`;
    return <EntityList title={title} type={EntityType.Chart} entities={charts || []} />;
};
