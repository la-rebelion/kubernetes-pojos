
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "readOnly",
    "secretRef",
    "volumeName",
    "volumeNamespace"
})
@Generated("jsonschema2pojo")
public class StorageOSVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @JsonProperty("volumeName")
    @JsonPropertyDescription("volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
    private String volumeName;
    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @JsonProperty("volumeNamespace")
    @JsonPropertyDescription("volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
    private String volumeNamespace;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StorageOSVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public StorageOSVolumeSource(StorageOSVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.readOnly = source.readOnly;
        this.secretRef = source.secretRef;
        this.volumeName = source.volumeName;
        this.volumeNamespace = source.volumeNamespace;
    }

    /**
     * 
     * @param volumeNamespace
     * @param volumeName
     * @param secretRef
     * @param readOnly
     * @param fsType
     */
    public StorageOSVolumeSource(String fsType, Boolean readOnly, LocalObjectReference secretRef, String volumeName, String volumeNamespace) {
        super();
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
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
     * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @JsonProperty("volumeName")
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @JsonProperty("volumeName")
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @JsonProperty("volumeNamespace")
    public String getVolumeNamespace() {
        return volumeNamespace;
    }

    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @JsonProperty("volumeNamespace")
    public void setVolumeNamespace(String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageOSVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("volumeName");
        sb.append('=');
        sb.append(((this.volumeName == null)?"<null>":this.volumeName));
        sb.append(',');
        sb.append("volumeNamespace");
        sb.append('=');
        sb.append(((this.volumeNamespace == null)?"<null>":this.volumeNamespace));
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
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.volumeNamespace == null)? 0 :this.volumeNamespace.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.volumeName == null)? 0 :this.volumeName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageOSVolumeSource) == false) {
            return false;
        }
        StorageOSVolumeSource rhs = ((StorageOSVolumeSource) other);
        return ((((((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef)))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.volumeNamespace == rhs.volumeNamespace)||((this.volumeNamespace!= null)&&this.volumeNamespace.equals(rhs.volumeNamespace))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.volumeName == rhs.volumeName)||((this.volumeName!= null)&&this.volumeName.equals(rhs.volumeName))));
    }

}
