
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "readOnly",
    "secretRef",
    "volumeID"
})
@Generated("jsonschema2pojo")
public class CinderVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    private String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    private Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    @JsonPropertyDescription("volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    private String volumeID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CinderVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public CinderVolumeSource(CinderVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.readOnly = source.readOnly;
        this.secretRef = source.secretRef;
        this.volumeID = source.volumeID;
    }

    /**
     * 
     * @param secretRef
     * @param volumeID
     * @param readOnly
     * @param fsType
     */
    public CinderVolumeSource(String fsType, Boolean readOnly, LocalObjectReference secretRef, String volumeID) {
        super();
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = volumeID;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CinderVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
        sb.append(',');
        sb.append("volumeID");
        sb.append('=');
        sb.append(((this.volumeID == null)?"<null>":this.volumeID));
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
        result = ((result* 31)+((this.volumeID == null)? 0 :this.volumeID.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CinderVolumeSource) == false) {
            return false;
        }
        CinderVolumeSource rhs = ((CinderVolumeSource) other);
        return (((((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef)))&&((this.volumeID == rhs.volumeID)||((this.volumeID!= null)&&this.volumeID.equals(rhs.volumeID))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))));
    }

}
