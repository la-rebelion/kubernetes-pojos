
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "fieldPath"
})
@Generated("jsonschema2pojo")
public class ObjectFieldSelector {

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")
    private String apiVersion;
    /**
     * Path of the field to select in the specified API version.
     * (Required)
     * 
     */
    @JsonProperty("fieldPath")
    @JsonPropertyDescription("Path of the field to select in the specified API version.")
    private String fieldPath;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectFieldSelector() {
    }

    /**
     * 
     * @param source
     */
    public ObjectFieldSelector(ObjectFieldSelector source) {
        super();
        this.apiVersion = source.apiVersion;
        this.fieldPath = source.fieldPath;
    }

    /**
     * 
     * @param apiVersion
     * @param fieldPath
     */
    public ObjectFieldSelector(String apiVersion, String fieldPath) {
        super();
        this.apiVersion = apiVersion;
        this.fieldPath = fieldPath;
    }

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Path of the field to select in the specified API version.
     * (Required)
     * 
     */
    @JsonProperty("fieldPath")
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * Path of the field to select in the specified API version.
     * (Required)
     * 
     */
    @JsonProperty("fieldPath")
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObjectFieldSelector.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("fieldPath");
        sb.append('=');
        sb.append(((this.fieldPath == null)?"<null>":this.fieldPath));
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
        result = ((result* 31)+((this.fieldPath == null)? 0 :this.fieldPath.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectFieldSelector) == false) {
            return false;
        }
        ObjectFieldSelector rhs = ((ObjectFieldSelector) other);
        return (((this.fieldPath == rhs.fieldPath)||((this.fieldPath!= null)&&this.fieldPath.equals(rhs.fieldPath)))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))));
    }

}
