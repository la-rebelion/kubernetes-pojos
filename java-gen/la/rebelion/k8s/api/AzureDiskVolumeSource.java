
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cachingMode",
    "diskName",
    "diskURI",
    "fsType",
    "kind",
    "readOnly"
})
@Generated("jsonschema2pojo")
public class AzureDiskVolumeSource {

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     * 
     */
    @JsonProperty("cachingMode")
    @JsonPropertyDescription("cachingMode is the Host Caching mode: None, Read Only, Read Write.")
    private String cachingMode;
    /**
     * diskName is the Name of the data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskName")
    @JsonPropertyDescription("diskName is the Name of the data disk in the blob storage")
    private String diskName;
    /**
     * diskURI is the URI of data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskURI")
    @JsonPropertyDescription("diskURI is the URI of data disk in the blob storage")
    private String diskURI;
    /**
     * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
    private String kind;
    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AzureDiskVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public AzureDiskVolumeSource(AzureDiskVolumeSource source) {
        super();
        this.cachingMode = source.cachingMode;
        this.diskName = source.diskName;
        this.diskURI = source.diskURI;
        this.fsType = source.fsType;
        this.kind = source.kind;
        this.readOnly = source.readOnly;
    }

    /**
     * 
     * @param diskName
     * @param kind
     * @param readOnly
     * @param cachingMode
     * @param diskURI
     * @param fsType
     */
    public AzureDiskVolumeSource(String cachingMode, String diskName, String diskURI, String fsType, String kind, Boolean readOnly) {
        super();
        this.cachingMode = cachingMode;
        this.diskName = diskName;
        this.diskURI = diskURI;
        this.fsType = fsType;
        this.kind = kind;
        this.readOnly = readOnly;
    }

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     * 
     */
    @JsonProperty("cachingMode")
    public String getCachingMode() {
        return cachingMode;
    }

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     * 
     */
    @JsonProperty("cachingMode")
    public void setCachingMode(String cachingMode) {
        this.cachingMode = cachingMode;
    }

    /**
     * diskName is the Name of the data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskName")
    public String getDiskName() {
        return diskName;
    }

    /**
     * diskName is the Name of the data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskName")
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * diskURI is the URI of data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskURI")
    public String getDiskURI() {
        return diskURI;
    }

    /**
     * diskURI is the URI of data disk in the blob storage
     * (Required)
     * 
     */
    @JsonProperty("diskURI")
    public void setDiskURI(String diskURI) {
        this.diskURI = diskURI;
    }

    /**
     * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureDiskVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cachingMode");
        sb.append('=');
        sb.append(((this.cachingMode == null)?"<null>":this.cachingMode));
        sb.append(',');
        sb.append("diskName");
        sb.append('=');
        sb.append(((this.diskName == null)?"<null>":this.diskName));
        sb.append(',');
        sb.append("diskURI");
        sb.append('=');
        sb.append(((this.diskURI == null)?"<null>":this.diskURI));
        sb.append(',');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
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
        result = ((result* 31)+((this.diskName == null)? 0 :this.diskName.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.cachingMode == null)? 0 :this.cachingMode.hashCode()));
        result = ((result* 31)+((this.diskURI == null)? 0 :this.diskURI.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureDiskVolumeSource) == false) {
            return false;
        }
        AzureDiskVolumeSource rhs = ((AzureDiskVolumeSource) other);
        return (((((((this.diskName == rhs.diskName)||((this.diskName!= null)&&this.diskName.equals(rhs.diskName)))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.cachingMode == rhs.cachingMode)||((this.cachingMode!= null)&&this.cachingMode.equals(rhs.cachingMode))))&&((this.diskURI == rhs.diskURI)||((this.diskURI!= null)&&this.diskURI.equals(rhs.diskURI))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))));
    }

}
