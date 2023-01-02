
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Adapts a Secret into a volume.
 * 
 * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defaultMode",
    "items",
    "optional",
    "secretName"
})
@Generated("jsonschema2pojo")
public class SecretVolumeSource {

    /**
     * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    @JsonPropertyDescription("defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    private Integer defaultMode;
    /**
     * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
    private List<KeyToPath> items = new ArrayList<KeyToPath>();
    /**
     * optional field specify whether the Secret or its keys must be defined
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("optional field specify whether the Secret or its keys must be defined")
    private Boolean optional;
    /**
     * secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @JsonProperty("secretName")
    @JsonPropertyDescription("secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    private String secretName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecretVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public SecretVolumeSource(SecretVolumeSource source) {
        super();
        this.defaultMode = source.defaultMode;
        this.items = source.items;
        this.optional = source.optional;
        this.secretName = source.secretName;
    }

    /**
     * 
     * @param secretName
     * @param defaultMode
     * @param optional
     * @param items
     */
    public SecretVolumeSource(Integer defaultMode, List<KeyToPath> items, Boolean optional, String secretName) {
        super();
        this.defaultMode = defaultMode;
        this.items = items;
        this.optional = optional;
        this.secretName = secretName;
    }

    /**
     * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public Integer getDefaultMode() {
        return defaultMode;
    }

    /**
     * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    @JsonProperty("items")
    public List<KeyToPath> getItems() {
        return items;
    }

    /**
     * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    @JsonProperty("items")
    public void setItems(List<KeyToPath> items) {
        this.items = items;
    }

    /**
     * optional field specify whether the Secret or its keys must be defined
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * optional field specify whether the Secret or its keys must be defined
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @JsonProperty("secretName")
    public String getSecretName() {
        return secretName;
    }

    /**
     * secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @JsonProperty("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecretVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaultMode");
        sb.append('=');
        sb.append(((this.defaultMode == null)?"<null>":this.defaultMode));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
        sb.append(',');
        sb.append("secretName");
        sb.append('=');
        sb.append(((this.secretName == null)?"<null>":this.secretName));
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
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        result = ((result* 31)+((this.secretName == null)? 0 :this.secretName.hashCode()));
        result = ((result* 31)+((this.defaultMode == null)? 0 :this.defaultMode.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretVolumeSource) == false) {
            return false;
        }
        SecretVolumeSource rhs = ((SecretVolumeSource) other);
        return (((((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.secretName == rhs.secretName)||((this.secretName!= null)&&this.secretName.equals(rhs.secretName))))&&((this.defaultMode == rhs.defaultMode)||((this.defaultMode!= null)&&this.defaultMode.equals(rhs.defaultMode))))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))));
    }

}
