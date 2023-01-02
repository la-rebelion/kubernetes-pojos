
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMapRef",
    "prefix",
    "secretRef"
})
@Generated("jsonschema2pojo")
public class EnvFromSource {

    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     * 
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("configMapRef")
    @JsonPropertyDescription("ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.\n\nThe contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.")
    private ConfigMapEnvSource configMapRef;
    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
    private String prefix;
    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     * 
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("SecretEnvSource selects a Secret to populate the environment variables with.\n\nThe contents of the target Secret's Data field will represent the key-value pairs as environment variables.")
    private SecretEnvSource secretRef;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvFromSource() {
    }

    /**
     * 
     * @param source
     */
    public EnvFromSource(EnvFromSource source) {
        super();
        this.configMapRef = source.configMapRef;
        this.prefix = source.prefix;
        this.secretRef = source.secretRef;
    }

    /**
     * 
     * @param configMapRef
     * @param prefix
     * @param secretRef
     */
    public EnvFromSource(ConfigMapEnvSource configMapRef, String prefix, SecretEnvSource secretRef) {
        super();
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     * 
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("configMapRef")
    public ConfigMapEnvSource getConfigMapRef() {
        return configMapRef;
    }

    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     * 
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("configMapRef")
    public void setConfigMapRef(ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     * 
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("secretRef")
    public SecretEnvSource getSecretRef() {
        return secretRef;
    }

    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     * 
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretEnvSource secretRef) {
        this.secretRef = secretRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvFromSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configMapRef");
        sb.append('=');
        sb.append(((this.configMapRef == null)?"<null>":this.configMapRef));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
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
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.configMapRef == null)? 0 :this.configMapRef.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvFromSource) == false) {
            return false;
        }
        EnvFromSource rhs = ((EnvFromSource) other);
        return ((((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef)))&&((this.configMapRef == rhs.configMapRef)||((this.configMapRef!= null)&&this.configMapRef.equals(rhs.configMapRef))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))));
    }

}
