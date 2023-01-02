
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Persistent Disk resource in AWS.
 * 
 * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "partition",
    "readOnly",
    "volumeID"
})
@Generated("jsonschema2pojo")
public class AWSElasticBlockStoreVolumeSource {

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    private String fsType;
    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
     * 
     */
    @JsonProperty("partition")
    @JsonPropertyDescription("partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty).")
    private Integer partition;
    /**
     * readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    private Boolean readOnly;
    /**
     * volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    @JsonPropertyDescription("volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    private String volumeID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AWSElasticBlockStoreVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public AWSElasticBlockStoreVolumeSource(AWSElasticBlockStoreVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.partition = source.partition;
        this.readOnly = source.readOnly;
        this.volumeID = source.volumeID;
    }

    /**
     * 
     * @param partition
     * @param volumeID
     * @param readOnly
     * @param fsType
     */
    public AWSElasticBlockStoreVolumeSource(String fsType, Integer partition, Boolean readOnly, String volumeID) {
        super();
        this.fsType = fsType;
        this.partition = partition;
        this.readOnly = readOnly;
        this.volumeID = volumeID;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
     * 
     */
    @JsonProperty("partition")
    public Integer getPartition() {
        return partition;
    }

    /**
     * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
     * 
     */
    @JsonProperty("partition")
    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    /**
     * readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * (Required)
     * 
     */
    @JsonProperty("volumeID")
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
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
        sb.append(AWSElasticBlockStoreVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("partition");
        sb.append('=');
        sb.append(((this.partition == null)?"<null>":this.partition));
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
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.partition == null)? 0 :this.partition.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AWSElasticBlockStoreVolumeSource) == false) {
            return false;
        }
        AWSElasticBlockStoreVolumeSource rhs = ((AWSElasticBlockStoreVolumeSource) other);
        return (((((this.volumeID == rhs.volumeID)||((this.volumeID!= null)&&this.volumeID.equals(rhs.volumeID)))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.partition == rhs.partition)||((this.partition!= null)&&this.partition.equals(rhs.partition))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))));
    }

}
