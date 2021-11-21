
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Dashboard2
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/Dashboard2Key.pdl.")
public class Dashboard2Key
    extends RecordTemplate
{

    private final static Dashboard2Key.Fields _fields = new Dashboard2Key.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Dashboard2*/@Aspect.name=\"dashboard2Key\"record Dashboard2Key{/**The name of the dashboard2 tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboard2Tool:string/**Unique id for the dashboard2. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboard2Id:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Dashboard2Tool = SCHEMA.getField("dashboard2Tool");
    private final static RecordDataSchema.Field FIELD_Dashboard2Id = SCHEMA.getField("dashboard2Id");

    public Dashboard2Key() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public Dashboard2Key(DataMap data) {
        super(data, SCHEMA);
    }

    public static Dashboard2Key.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for dashboard2Tool
     * 
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    public boolean hasDashboard2Tool() {
        return contains(FIELD_Dashboard2Tool);
    }

    /**
     * Remover for dashboard2Tool
     * 
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    public void removeDashboard2Tool() {
        remove(FIELD_Dashboard2Tool);
    }

    /**
     * Getter for dashboard2Tool
     * 
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    public String getDashboard2Tool(GetMode mode) {
        return obtainDirect(FIELD_Dashboard2Tool, String.class, mode);
    }

    /**
     * Getter for dashboard2Tool
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    @Nonnull
    public String getDashboard2Tool() {
        return obtainDirect(FIELD_Dashboard2Tool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboard2Tool
     * 
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    public Dashboard2Key setDashboard2Tool(String value, SetMode mode) {
        putDirect(FIELD_Dashboard2Tool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboard2Tool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Key.Fields#dashboard2Tool
     */
    public Dashboard2Key setDashboard2Tool(
        @Nonnull
        String value) {
        putDirect(FIELD_Dashboard2Tool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboard2Id
     * 
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    public boolean hasDashboard2Id() {
        return contains(FIELD_Dashboard2Id);
    }

    /**
     * Remover for dashboard2Id
     * 
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    public void removeDashboard2Id() {
        remove(FIELD_Dashboard2Id);
    }

    /**
     * Getter for dashboard2Id
     * 
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    public String getDashboard2Id(GetMode mode) {
        return obtainDirect(FIELD_Dashboard2Id, String.class, mode);
    }

    /**
     * Getter for dashboard2Id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    @Nonnull
    public String getDashboard2Id() {
        return obtainDirect(FIELD_Dashboard2Id, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboard2Id
     * 
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    public Dashboard2Key setDashboard2Id(String value, SetMode mode) {
        putDirect(FIELD_Dashboard2Id, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboard2Id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Dashboard2Key.Fields#dashboard2Id
     */
    public Dashboard2Key setDashboard2Id(
        @Nonnull
        String value) {
        putDirect(FIELD_Dashboard2Id, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Dashboard2Key clone()
        throws CloneNotSupportedException
    {
        return ((Dashboard2Key) super.clone());
    }

    @Override
    public Dashboard2Key copy()
        throws CloneNotSupportedException
    {
        return ((Dashboard2Key) super.copy());
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
         * The name of the dashboard2 tool such as looker, redash etc.
         * 
         */
        public PathSpec dashboard2Tool() {
            return new PathSpec(getPathComponents(), "dashboard2Tool");
        }

        /**
         * Unique id for the dashboard2. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'
         * 
         */
        public PathSpec dashboard2Id() {
            return new PathSpec(getPathComponents(), "dashboard2Id");
        }

    }

}
