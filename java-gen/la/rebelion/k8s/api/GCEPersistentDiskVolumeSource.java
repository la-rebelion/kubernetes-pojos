
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Persistent Disk resource in Google Compute Engine.
 * 
 * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "partition",
    "pdName",
    "readOnly"
})
@Generated("jsonschema2pojo")
public class GCEPersistentDiskVolumeSource {

    /**
     * fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    private String fsType;
    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("partition")
    @JsonPropertyDescription("partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    private Integer partition;
    /**
     * pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * (Required)
     * 
     */
    @JsonProperty("pdName")
    @JsonPropertyDescription("pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    private String pdName;
    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    private Boolean readOnly;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GCEPersistentDiskVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public GCEPersistentDiskVolumeSource(GCEPersistentDiskVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.partition = source.partition;
        this.pdName = source.pdName;
        this.readOnly = source.readOnly;
    }

    /**
     * 
     * @param partition
     * @param readOnly
     * @param pdName
     * @param fsType
     */
    public GCEPersistentDiskVolumeSource(String fsType, Integer partition, String pdName, Boolean readOnly) {
        super();
        this.fsType = fsType;
        this.partition = partition;
        this.pdName = pdName;
        this.readOnly = readOnly;
    }

    /**
     * fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("partition")
    public Integer getPartition() {
        return partition;
    }

    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("partition")
    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    /**
     * pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * (Required)
     * 
     */
    @JsonProperty("pdName")
    public String getPdName() {
        return pdName;
    }

    /**
     * pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * (Required)
     * 
     */
    @JsonProperty("pdName")
    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCEPersistentDiskVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("partition");
        sb.append('=');
        sb.append(((this.partition == null)?"<null>":this.partition));
        sb.append(',');
        sb.append("pdName");
        sb.append('=');
        sb.append(((this.pdName == null)?"<null>":this.pdName));
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
        result = ((result* 31)+((this.partition == null)? 0 :this.partition.hashCode()));
        result = ((result* 31)+((this.pdName == null)? 0 :this.pdName.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCEPersistentDiskVolumeSource) == false) {
            return false;
        }
        GCEPersistentDiskVolumeSource rhs = ((GCEPersistentDiskVolumeSource) other);
        return (((((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly)))&&((this.partition == rhs.partition)||((this.partition!= null)&&this.partition.equals(rhs.partition))))&&((this.pdName == rhs.pdName)||((this.pdName!= null)&&this.pdName.equals(rhs.pdName))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))));
    }

}
