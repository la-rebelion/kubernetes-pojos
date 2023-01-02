
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
 * 
 * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "optional"
})
@Generated("jsonschema2pojo")
public class ConfigMapEnvSource {

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    private String name;
    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Specify whether the ConfigMap must be defined")
    private Boolean optional;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfigMapEnvSource() {
    }

    /**
     * 
     * @param source
     */
    public ConfigMapEnvSource(ConfigMapEnvSource source) {
        super();
        this.name = source.name;
        this.optional = source.optional;
    }

    /**
     * 
     * @param name
     * @param optional
     */
    public ConfigMapEnvSource(String name, Boolean optional) {
        super();
        this.name = name;
        this.optional = optional;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfigMapEnvSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigMapEnvSource) == false) {
            return false;
        }
        ConfigMapEnvSource rhs = ((ConfigMapEnvSource) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))));
    }

}
