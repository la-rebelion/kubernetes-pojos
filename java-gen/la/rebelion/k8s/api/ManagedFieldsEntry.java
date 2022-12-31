
package la.rebelion.k8s.api;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "fieldsType",
    "fieldsV1",
    "manager",
    "operation",
    "subresource",
    "time"
})
@Generated("jsonschema2pojo")
public class ManagedFieldsEntry {

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")
    private String apiVersion;
    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    @JsonProperty("fieldsType")
    @JsonPropertyDescription("FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")
    private String fieldsType;
    /**
     * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.
     * 
     * Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.
     * 
     * The exact format is defined in sigs.k8s.io/structured-merge-diff
     * 
     */
    @JsonProperty("fieldsV1")
    @JsonPropertyDescription("FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.\n\nEach key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.\n\nThe exact format is defined in sigs.k8s.io/structured-merge-diff")
    private FieldsV1 fieldsV1;
    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    @JsonProperty("manager")
    @JsonPropertyDescription("Manager is an identifier of the workflow managing these fields.")
    private String manager;
    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")
    private String operation;
    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    @JsonProperty("subresource")
    @JsonPropertyDescription("Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.")
    private String subresource;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("time")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date time;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ManagedFieldsEntry() {
    }

    /**
     * 
     * @param source
     */
    public ManagedFieldsEntry(ManagedFieldsEntry source) {
        super();
        this.apiVersion = source.apiVersion;
        this.fieldsType = source.fieldsType;
        this.fieldsV1 = source.fieldsV1;
        this.manager = source.manager;
        this.operation = source.operation;
        this.subresource = source.subresource;
        this.time = source.time;
    }

    /**
     * 
     * @param apiVersion
     * @param fieldsV1
     * @param manager
     * @param subresource
     * @param time
     * @param operation
     * @param fieldsType
     */
    public ManagedFieldsEntry(String apiVersion, String fieldsType, FieldsV1 fieldsV1, String manager, String operation, String subresource, Date time) {
        super();
        this.apiVersion = apiVersion;
        this.fieldsType = fieldsType;
        this.fieldsV1 = fieldsV1;
        this.manager = manager;
        this.operation = operation;
        this.subresource = subresource;
        this.time = time;
    }

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    @JsonProperty("fieldsType")
    public String getFieldsType() {
        return fieldsType;
    }

    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    @JsonProperty("fieldsType")
    public void setFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
    }

    /**
     * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.
     * 
     * Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.
     * 
     * The exact format is defined in sigs.k8s.io/structured-merge-diff
     * 
     */
    @JsonProperty("fieldsV1")
    public FieldsV1 getFieldsV1() {
        return fieldsV1;
    }

    /**
     * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.
     * 
     * Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.
     * 
     * The exact format is defined in sigs.k8s.io/structured-merge-diff
     * 
     */
    @JsonProperty("fieldsV1")
    public void setFieldsV1(FieldsV1 fieldsV1) {
        this.fieldsV1 = fieldsV1;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    @JsonProperty("manager")
    public String getManager() {
        return manager;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    @JsonProperty("manager")
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    @JsonProperty("subresource")
    public String getSubresource() {
        return subresource;
    }

    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    @JsonProperty("subresource")
    public void setSubresource(String subresource) {
        this.subresource = subresource;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("time")
    public Date getTime() {
        return time;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("time")
    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManagedFieldsEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("fieldsType");
        sb.append('=');
        sb.append(((this.fieldsType == null)?"<null>":this.fieldsType));
        sb.append(',');
        sb.append("fieldsV1");
        sb.append('=');
        sb.append(((this.fieldsV1 == null)?"<null>":this.fieldsV1));
        sb.append(',');
        sb.append("manager");
        sb.append('=');
        sb.append(((this.manager == null)?"<null>":this.manager));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("subresource");
        sb.append('=');
        sb.append(((this.subresource == null)?"<null>":this.subresource));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.fieldsV1 == null)? 0 :this.fieldsV1 .hashCode()));
        result = ((result* 31)+((this.manager == null)? 0 :this.manager.hashCode()));
        result = ((result* 31)+((this.subresource == null)? 0 :this.subresource.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.fieldsType == null)? 0 :this.fieldsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagedFieldsEntry) == false) {
            return false;
        }
        ManagedFieldsEntry rhs = ((ManagedFieldsEntry) other);
        return ((((((((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion)))&&((this.fieldsV1 == rhs.fieldsV1)||((this.fieldsV1 != null)&&this.fieldsV1 .equals(rhs.fieldsV1))))&&((this.manager == rhs.manager)||((this.manager!= null)&&this.manager.equals(rhs.manager))))&&((this.subresource == rhs.subresource)||((this.subresource!= null)&&this.subresource.equals(rhs.subresource))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.fieldsType == rhs.fieldsType)||((this.fieldsType!= null)&&this.fieldsType.equals(rhs.fieldsType))));
    }

}
