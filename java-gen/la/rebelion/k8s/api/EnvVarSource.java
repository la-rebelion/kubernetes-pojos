
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMapKeyRef",
    "fieldRef",
    "resourceFieldRef",
    "secretKeyRef"
})
@Generated("jsonschema2pojo")
public class EnvVarSource {

    /**
     * Selects a key from a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("Selects a key from a ConfigMap.")
    private ConfigMapKeySelector configMapKeyRef;
    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    @JsonProperty("fieldRef")
    @JsonPropertyDescription("ObjectFieldSelector selects an APIVersioned field of an object.")
    private ObjectFieldSelector fieldRef;
    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    @JsonProperty("resourceFieldRef")
    @JsonPropertyDescription("ResourceFieldSelector represents container resources (cpu, memory) and their output format")
    private ResourceFieldSelector resourceFieldRef;
    /**
     * SecretKeySelector selects a key of a Secret.
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("SecretKeySelector selects a key of a Secret.")
    private SecretKeySelector secretKeyRef;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvVarSource() {
    }

    /**
     * 
     * @param source
     */
    public EnvVarSource(EnvVarSource source) {
        super();
        this.configMapKeyRef = source.configMapKeyRef;
        this.fieldRef = source.fieldRef;
        this.resourceFieldRef = source.resourceFieldRef;
        this.secretKeyRef = source.secretKeyRef;
    }

    /**
     * 
     * @param secretKeyRef
     * @param resourceFieldRef
     * @param configMapKeyRef
     * @param fieldRef
     */
    public EnvVarSource(ConfigMapKeySelector configMapKeyRef, ObjectFieldSelector fieldRef, ResourceFieldSelector resourceFieldRef, SecretKeySelector secretKeyRef) {
        super();
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * Selects a key from a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * Selects a key from a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
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

    /**
     * SecretKeySelector selects a key of a Secret.
     * 
     */
    @JsonProperty("secretKeyRef")
    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * SecretKeySelector selects a key of a Secret.
     * 
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvVarSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configMapKeyRef");
        sb.append('=');
        sb.append(((this.configMapKeyRef == null)?"<null>":this.configMapKeyRef));
        sb.append(',');
        sb.append("fieldRef");
        sb.append('=');
        sb.append(((this.fieldRef == null)?"<null>":this.fieldRef));
        sb.append(',');
        sb.append("resourceFieldRef");
        sb.append('=');
        sb.append(((this.resourceFieldRef == null)?"<null>":this.resourceFieldRef));
        sb.append(',');
        sb.append("secretKeyRef");
        sb.append('=');
        sb.append(((this.secretKeyRef == null)?"<null>":this.secretKeyRef));
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
        result = ((result* 31)+((this.secretKeyRef == null)? 0 :this.secretKeyRef.hashCode()));
        result = ((result* 31)+((this.configMapKeyRef == null)? 0 :this.configMapKeyRef.hashCode()));
        result = ((result* 31)+((this.fieldRef == null)? 0 :this.fieldRef.hashCode()));
        result = ((result* 31)+((this.resourceFieldRef == null)? 0 :this.resourceFieldRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvVarSource) == false) {
            return false;
        }
        EnvVarSource rhs = ((EnvVarSource) other);
        return (((((this.secretKeyRef == rhs.secretKeyRef)||((this.secretKeyRef!= null)&&this.secretKeyRef.equals(rhs.secretKeyRef)))&&((this.configMapKeyRef == rhs.configMapKeyRef)||((this.configMapKeyRef!= null)&&this.configMapKeyRef.equals(rhs.configMapKeyRef))))&&((this.fieldRef == rhs.fieldRef)||((this.fieldRef!= null)&&this.fieldRef.equals(rhs.fieldRef))))&&((this.resourceFieldRef == rhs.resourceFieldRef)||((this.resourceFieldRef!= null)&&this.resourceFieldRef.equals(rhs.resourceFieldRef))));
    }

}
