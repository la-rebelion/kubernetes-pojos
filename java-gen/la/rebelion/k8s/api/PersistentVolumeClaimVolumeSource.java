
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "claimName",
    "readOnly"
})
@Generated("jsonschema2pojo")
public class PersistentVolumeClaimVolumeSource {

    /**
     * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * (Required)
     * 
     */
    @JsonProperty("claimName")
    @JsonPropertyDescription("claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    private String claimName;
    /**
     * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly Will force the ReadOnly setting in VolumeMounts. Default false.")
    private Boolean readOnly;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersistentVolumeClaimVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public PersistentVolumeClaimVolumeSource(PersistentVolumeClaimVolumeSource source) {
        super();
        this.claimName = source.claimName;
        this.readOnly = source.readOnly;
    }

    /**
     * 
     * @param claimName
     * @param readOnly
     */
    public PersistentVolumeClaimVolumeSource(String claimName, Boolean readOnly) {
        super();
        this.claimName = claimName;
        this.readOnly = readOnly;
    }

    /**
     * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * (Required)
     * 
     */
    @JsonProperty("claimName")
    public String getClaimName() {
        return claimName;
    }

    /**
     * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * (Required)
     * 
     */
    @JsonProperty("claimName")
    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    /**
     * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersistentVolumeClaimVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claimName");
        sb.append('=');
        sb.append(((this.claimName == null)?"<null>":this.claimName));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
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
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.claimName == null)? 0 :this.claimName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersistentVolumeClaimVolumeSource) == false) {
            return false;
        }
        PersistentVolumeClaimVolumeSource rhs = ((PersistentVolumeClaimVolumeSource) other);
        return (((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly)))&&((this.claimName == rhs.claimName)||((this.claimName!= null)&&this.claimName.equals(rhs.claimName))));
    }

}
