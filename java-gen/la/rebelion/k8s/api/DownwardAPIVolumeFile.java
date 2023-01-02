
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fieldRef",
    "mode",
    "path",
    "resourceFieldRef"
})
@Generated("jsonschema2pojo")
public class DownwardAPIVolumeFile {

    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    @JsonProperty("fieldRef")
    @JsonPropertyDescription("ObjectFieldSelector selects an APIVersioned field of an object.")
    private ObjectFieldSelector fieldRef;
    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    private Integer mode;
    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
    private String path;
    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    @JsonProperty("resourceFieldRef")
    @JsonPropertyDescription("ResourceFieldSelector represents container resources (cpu, memory) and their output format")
    private ResourceFieldSelector resourceFieldRef;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownwardAPIVolumeFile() {
    }

    /**
     * 
     * @param source
     */
    public DownwardAPIVolumeFile(DownwardAPIVolumeFile source) {
        super();
        this.fieldRef = source.fieldRef;
        this.mode = source.mode;
        this.path = source.path;
        this.resourceFieldRef = source.resourceFieldRef;
    }

    /**
     * 
     * @param mode
     * @param path
     * @param resourceFieldRef
     * @param fieldRef
     */
    public DownwardAPIVolumeFile(ObjectFieldSelector fieldRef, Integer mode, String path, ResourceFieldSelector resourceFieldRef) {
        super();
        this.fieldRef = fieldRef;
        this.mode = mode;
        this.path = path;
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    @JsonProperty("fieldRef")
    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("mode")
    public Integer getMode() {
        return mode;
    }

    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("mode")
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DownwardAPIVolumeFile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fieldRef");
        sb.append('=');
        sb.append(((this.fieldRef == null)?"<null>":this.fieldRef));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("resourceFieldRef");
        sb.append('=');
        sb.append(((this.resourceFieldRef == null)?"<null>":this.resourceFieldRef));
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
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.fieldRef == null)? 0 :this.fieldRef.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.resourceFieldRef == null)? 0 :this.resourceFieldRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownwardAPIVolumeFile) == false) {
            return false;
        }
        DownwardAPIVolumeFile rhs = ((DownwardAPIVolumeFile) other);
        return (((((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)))&&((this.fieldRef == rhs.fieldRef)||((this.fieldRef!= null)&&this.fieldRef.equals(rhs.fieldRef))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.resourceFieldRef == rhs.resourceFieldRef)||((this.resourceFieldRef!= null)&&this.resourceFieldRef.equals(rhs.resourceFieldRef))));
    }

}
