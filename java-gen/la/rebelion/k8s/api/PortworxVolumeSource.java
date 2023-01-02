
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PortworxVolumeSource represents a Portworx volume resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "readOnly",
    "volumeID"
})
@Generated("jsonschema2pojo")
public class PortworxVolumeSource {

    /**
     * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;
    /**
     * volumeID uniquely identifies a Portworx volume
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    @JsonPropertyDescription("volumeID uniquely identifies a Portworx volume")
    private String volumeID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortworxVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public PortworxVolumeSource(PortworxVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.readOnly = source.readOnly;
        this.volumeID = source.volumeID;
    }

    /**
     * 
     * @param volumeID
     * @param readOnly
     * @param fsType
     */
    public PortworxVolumeSource(String fsType, Boolean readOnly, String volumeID) {
        super();
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.volumeID = volumeID;
    }

    /**
     * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
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
     * volumeID uniquely identifies a Portworx volume
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * volumeID uniquely identifies a Portworx volume
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
        sb.append(PortworxVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
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
        result = ((result* 31)+((this.volumeID == null)? 0 :this.volumeID.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortworxVolumeSource) == false) {
            return false;
        }
        PortworxVolumeSource rhs = ((PortworxVolumeSource) other);
        return ((((this.volumeID == rhs.volumeID)||((this.volumeID!= null)&&this.volumeID.equals(rhs.volumeID)))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))));
    }

}
