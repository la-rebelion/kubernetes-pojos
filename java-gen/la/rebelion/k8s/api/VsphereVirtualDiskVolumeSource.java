
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a vSphere volume resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "storagePolicyID",
    "storagePolicyName",
    "volumePath"
})
@Generated("jsonschema2pojo")
public class VsphereVirtualDiskVolumeSource {

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    @JsonProperty("storagePolicyID")
    @JsonPropertyDescription("storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
    private String storagePolicyID;
    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    @JsonProperty("storagePolicyName")
    @JsonPropertyDescription("storagePolicyName is the storage Policy Based Management (SPBM) profile name.")
    private String storagePolicyName;
    /**
     * volumePath is the path that identifies vSphere volume vmdk
     * (Required)
     * 
     */
    @JsonProperty("volumePath")
    @JsonPropertyDescription("volumePath is the path that identifies vSphere volume vmdk")
    private String volumePath;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VsphereVirtualDiskVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public VsphereVirtualDiskVolumeSource(VsphereVirtualDiskVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.storagePolicyID = source.storagePolicyID;
        this.storagePolicyName = source.storagePolicyName;
        this.volumePath = source.volumePath;
    }

    /**
     * 
     * @param storagePolicyName
     * @param storagePolicyID
     * @param volumePath
     * @param fsType
     */
    public VsphereVirtualDiskVolumeSource(String fsType, String storagePolicyID, String storagePolicyName, String volumePath) {
        super();
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = volumePath;
    }

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    @JsonProperty("storagePolicyID")
    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    @JsonProperty("storagePolicyID")
    public void setStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    @JsonProperty("storagePolicyName")
    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    @JsonProperty("storagePolicyName")
    public void setStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    /**
     * volumePath is the path that identifies vSphere volume vmdk
     * (Required)
     * 
     */
    @JsonProperty("volumePath")
    public String getVolumePath() {
        return volumePath;
    }

    /**
     * volumePath is the path that identifies vSphere volume vmdk
     * (Required)
     * 
     */
    @JsonProperty("volumePath")
    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VsphereVirtualDiskVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("storagePolicyID");
        sb.append('=');
        sb.append(((this.storagePolicyID == null)?"<null>":this.storagePolicyID));
        sb.append(',');
        sb.append("storagePolicyName");
        sb.append('=');
        sb.append(((this.storagePolicyName == null)?"<null>":this.storagePolicyName));
        sb.append(',');
        sb.append("volumePath");
        sb.append('=');
        sb.append(((this.volumePath == null)?"<null>":this.volumePath));
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
        result = ((result* 31)+((this.storagePolicyName == null)? 0 :this.storagePolicyName.hashCode()));
        result = ((result* 31)+((this.storagePolicyID == null)? 0 :this.storagePolicyID.hashCode()));
        result = ((result* 31)+((this.volumePath == null)? 0 :this.volumePath.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VsphereVirtualDiskVolumeSource) == false) {
            return false;
        }
        VsphereVirtualDiskVolumeSource rhs = ((VsphereVirtualDiskVolumeSource) other);
        return (((((this.storagePolicyName == rhs.storagePolicyName)||((this.storagePolicyName!= null)&&this.storagePolicyName.equals(rhs.storagePolicyName)))&&((this.storagePolicyID == rhs.storagePolicyID)||((this.storagePolicyID!= null)&&this.storagePolicyID.equals(rhs.storagePolicyID))))&&((this.volumePath == rhs.volumePath)||((this.volumePath!= null)&&this.volumePath.equals(rhs.volumePath))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))));
    }

}
