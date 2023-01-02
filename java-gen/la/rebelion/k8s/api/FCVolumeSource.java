
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "lun",
    "readOnly",
    "targetWWNs",
    "wwids"
})
@Generated("jsonschema2pojo")
public class FCVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    private String fsType;
    /**
     * lun is Optional: FC target lun number
     * 
     */
    @JsonProperty("lun")
    @JsonPropertyDescription("lun is Optional: FC target lun number")
    private Integer lun;
    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;
    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    @JsonProperty("targetWWNs")
    @JsonPropertyDescription("targetWWNs is Optional: FC target worldwide names (WWNs)")
    private List<String> targetWWNs = new ArrayList<String>();
    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    @JsonProperty("wwids")
    @JsonPropertyDescription("wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
    private List<String> wwids = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FCVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public FCVolumeSource(FCVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.lun = source.lun;
        this.readOnly = source.readOnly;
        this.targetWWNs = source.targetWWNs;
        this.wwids = source.wwids;
    }

    /**
     * 
     * @param lun
     * @param targetWWNs
     * @param readOnly
     * @param wwids
     * @param fsType
     */
    public FCVolumeSource(String fsType, Integer lun, Boolean readOnly, List<String> targetWWNs, List<String> wwids) {
        super();
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
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
     * lun is Optional: FC target lun number
     * 
     */
    @JsonProperty("lun")
    public Integer getLun() {
        return lun;
    }

    /**
     * lun is Optional: FC target lun number
     * 
     */
    @JsonProperty("lun")
    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    @JsonProperty("targetWWNs")
    public List<String> getTargetWWNs() {
        return targetWWNs;
    }

    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    @JsonProperty("targetWWNs")
    public void setTargetWWNs(List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    @JsonProperty("wwids")
    public List<String> getWwids() {
        return wwids;
    }

    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    @JsonProperty("wwids")
    public void setWwids(List<String> wwids) {
        this.wwids = wwids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FCVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("lun");
        sb.append('=');
        sb.append(((this.lun == null)?"<null>":this.lun));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("targetWWNs");
        sb.append('=');
        sb.append(((this.targetWWNs == null)?"<null>":this.targetWWNs));
        sb.append(',');
        sb.append("wwids");
        sb.append('=');
        sb.append(((this.wwids == null)?"<null>":this.wwids));
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
        result = ((result* 31)+((this.lun == null)? 0 :this.lun.hashCode()));
        result = ((result* 31)+((this.targetWWNs == null)? 0 :this.targetWWNs.hashCode()));
        result = ((result* 31)+((this.wwids == null)? 0 :this.wwids.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FCVolumeSource) == false) {
            return false;
        }
        FCVolumeSource rhs = ((FCVolumeSource) other);
        return ((((((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly)))&&((this.lun == rhs.lun)||((this.lun!= null)&&this.lun.equals(rhs.lun))))&&((this.targetWWNs == rhs.targetWWNs)||((this.targetWWNs!= null)&&this.targetWWNs.equals(rhs.targetWWNs))))&&((this.wwids == rhs.wwids)||((this.wwids!= null)&&this.wwids.equals(rhs.wwids))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))));
    }

}
