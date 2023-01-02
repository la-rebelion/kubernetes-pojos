
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "spec"
})
@Generated("jsonschema2pojo")
public class PersistentVolumeClaimTemplate {

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")
    private ObjectMeta metadata;
    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * (Required)
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
    private PersistentVolumeClaimSpec spec;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersistentVolumeClaimTemplate() {
    }

    /**
     * 
     * @param source
     */
    public PersistentVolumeClaimTemplate(PersistentVolumeClaimTemplate source) {
        super();
        this.metadata = source.metadata;
        this.spec = source.spec;
    }

    /**
     * 
     * @param metadata
     * @param spec
     */
    public PersistentVolumeClaimTemplate(ObjectMeta metadata, PersistentVolumeClaimSpec spec) {
        super();
        this.metadata = metadata;
        this.spec = spec;
    }

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersistentVolumeClaimTemplate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersistentVolumeClaimTemplate) == false) {
            return false;
        }
        PersistentVolumeClaimTemplate rhs = ((PersistentVolumeClaimTemplate) other);
        return (((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))));
    }

}
