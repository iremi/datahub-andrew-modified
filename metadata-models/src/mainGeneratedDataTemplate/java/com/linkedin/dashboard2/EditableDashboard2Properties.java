
package com.linkedin.dashboard2;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Stores editable changes made to properties. This separates changes made from
 * ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dashboard2/EditableDashboard2Properties.pdl.")
public class EditableDashboard2Properties
    extends RecordTemplate
{

    private final static EditableDashboard2Properties.Fields _fields = new EditableDashboard2Properties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dashboard2/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDashboard2Properties\"record EditableDashboard2Properties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Edited documentation of the dashboard2*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\"}description:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public EditableDashboard2Properties() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
    }

    public EditableDashboard2Properties(DataMap data) {
        super(data, SCHEMA);
    }

    public static EditableDashboard2Properties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for created
     * 
     * @see EditableDashboard2Properties.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see EditableDashboard2Properties.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see EditableDashboard2Properties.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableDashboard2Properties.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see EditableDashboard2Properties.Fields#created
     */
    public EditableDashboard2Properties setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDashboard2Properties.Fields#created
     */
    public EditableDashboard2Properties setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    public AuditStamp getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    public EditableDashboard2Properties setLastModified(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDashboard2Properties.Fields#lastModified
     */
    public EditableDashboard2Properties setLastModified(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see EditableDashboard2Properties.Fields#deleted
     */
    public boolean hasDeleted() {
        return contains(FIELD_Deleted);
    }

    /**
     * Remover for deleted
     * 
     * @see EditableDashboard2Properties.Fields#deleted
     */
    public void removeDeleted() {
        remove(FIELD_Deleted);
    }

    /**
     * Getter for deleted
     * 
     * @see EditableDashboard2Properties.Fields#deleted
     */
    public AuditStamp getDeleted(GetMode mode) {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, mode);
    }

    /**
     * Getter for deleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableDashboard2Properties.Fields#deleted
     */
    @Nullable
    public AuditStamp getDeleted() {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for deleted
     * 
     * @see EditableDashboard2Properties.Fields#deleted
     */
    public EditableDashboard2Properties setDeleted(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for deleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDashboard2Properties.Fields#deleted
     */
    public EditableDashboard2Properties setDeleted(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableDashboard2Properties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see EditableDashboard2Properties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see EditableDashboard2Properties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableDashboard2Properties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see EditableDashboard2Properties.Fields#description
     */
    public EditableDashboard2Properties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDashboard2Properties.Fields#description
     */
    public EditableDashboard2Properties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EditableDashboard2Properties clone()
        throws CloneNotSupportedException
    {
        return ((EditableDashboard2Properties) super.clone());
    }

    @Override
    public EditableDashboard2Properties copy()
        throws CloneNotSupportedException
    {
        return ((EditableDashboard2Properties) super.copy());
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
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields deleted() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "deleted");
        }

        /**
         * Edited documentation of the dashboard2
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

}
