
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "name",
    "optional"
})
@Generated("jsonschema2pojo")
public class SecretKeySelector {

    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * (Required)
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("The key of the secret to select from.  Must be a valid secret key.")
    private String key;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    private String name;
    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Specify whether the Secret or its key must be defined")
    private Boolean optional;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecretKeySelector() {
    }

    /**
     * 
     * @param source
     */
    public SecretKeySelector(SecretKeySelector source) {
        super();
        this.key = source.key;
        this.name = source.name;
        this.optional = source.optional;
    }

    /**
     * 
     * @param name
     * @param optional
     * @param key
     */
    public SecretKeySelector(String key, String name, Boolean optional) {
        super();
        this.key = key;
        this.name = name;
        this.optional = optional;
    }

    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
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
     * Specify whether the Secret or its key must be defined
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecretKeySelector.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
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
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretKeySelector) == false) {
            return false;
        }
        SecretKeySelector rhs = ((SecretKeySelector) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))));
    }

}
