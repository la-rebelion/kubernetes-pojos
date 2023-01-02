
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Photon Controller persistent disk resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "pdID"
})
@Generated("jsonschema2pojo")
public class PhotonPersistentDiskVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     * (Required)
     * 
     */
    @JsonProperty("pdID")
    @JsonPropertyDescription("pdID is the ID that identifies Photon Controller persistent disk")
    private String pdID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhotonPersistentDiskVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public PhotonPersistentDiskVolumeSource(PhotonPersistentDiskVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.pdID = source.pdID;
    }

    /**
     * 
     * @param pdID
     * @param fsType
     */
    public PhotonPersistentDiskVolumeSource(String fsType, String pdID) {
        super();
        this.fsType = fsType;
        this.pdID = pdID;
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
     * pdID is the ID that identifies Photon Controller persistent disk
     * (Required)
     * 
     */
    @JsonProperty("pdID")
    public String getPdID() {
        return pdID;
    }

    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     * (Required)
     * 
     */
    @JsonProperty("pdID")
    public void setPdID(String pdID) {
        this.pdID = pdID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhotonPersistentDiskVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("pdID");
        sb.append('=');
        sb.append(((this.pdID == null)?"<null>":this.pdID));
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
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.pdID == null)? 0 :this.pdID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhotonPersistentDiskVolumeSource) == false) {
            return false;
        }
        PhotonPersistentDiskVolumeSource rhs = ((PhotonPersistentDiskVolumeSource) other);
        return (((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType)))&&((this.pdID == rhs.pdID)||((this.pdID!= null)&&this.pdID.equals(rhs.pdID))));
    }

}
