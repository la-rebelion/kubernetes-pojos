
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "volumeClaimTemplate"
})
@Generated("jsonschema2pojo")
public class EphemeralVolumeSource {

    /**
     * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    @JsonPropertyDescription("PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.")
    private PersistentVolumeClaimTemplate volumeClaimTemplate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EphemeralVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public EphemeralVolumeSource(EphemeralVolumeSource source) {
        super();
        this.volumeClaimTemplate = source.volumeClaimTemplate;
    }

    /**
     * 
     * @param volumeClaimTemplate
     */
    public EphemeralVolumeSource(PersistentVolumeClaimTemplate volumeClaimTemplate) {
        super();
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    /**
     * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    public PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    /**
     * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    public void setVolumeClaimTemplate(PersistentVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EphemeralVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("volumeClaimTemplate");
        sb.append('=');
        sb.append(((this.volumeClaimTemplate == null)?"<null>":this.volumeClaimTemplate));
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
        result = ((result* 31)+((this.volumeClaimTemplate == null)? 0 :this.volumeClaimTemplate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EphemeralVolumeSource) == false) {
            return false;
        }
        EphemeralVolumeSource rhs = ((EphemeralVolumeSource) other);
        return ((this.volumeClaimTemplate == rhs.volumeClaimTemplate)||((this.volumeClaimTemplate!= null)&&this.volumeClaimTemplate.equals(rhs.volumeClaimTemplate)));
    }

}
