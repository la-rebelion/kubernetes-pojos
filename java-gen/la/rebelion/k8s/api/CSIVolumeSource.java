
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a source location of a volume to mount, managed by an external CSI driver
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "driver",
    "fsType",
    "nodePublishSecretRef",
    "readOnly",
    "volumeAttributes"
})
@Generated("jsonschema2pojo")
public class CSIVolumeSource {

    /**
     * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    @JsonPropertyDescription("driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.")
    private String driver;
    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.")
    private String fsType;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference nodePublishSecretRef;
    /**
     * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).")
    private Boolean readOnly;
    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    @JsonPropertyDescription("volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.")
    private VolumeAttributes volumeAttributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CSIVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public CSIVolumeSource(CSIVolumeSource source) {
        super();
        this.driver = source.driver;
        this.fsType = source.fsType;
        this.nodePublishSecretRef = source.nodePublishSecretRef;
        this.readOnly = source.readOnly;
        this.volumeAttributes = source.volumeAttributes;
    }

    /**
     * 
     * @param driver
     * @param nodePublishSecretRef
     * @param readOnly
     * @param fsType
     * @param volumeAttributes
     */
    public CSIVolumeSource(String driver, String fsType, LocalObjectReference nodePublishSecretRef, Boolean readOnly, VolumeAttributes volumeAttributes) {
        super();
        this.driver = driver;
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    /**
     * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    public String getDriver() {
        return driver;
    }

    /**
     * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public LocalObjectReference getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public void setNodePublishSecretRef(LocalObjectReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    /**
     * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    public VolumeAttributes getVolumeAttributes() {
        return volumeAttributes;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    public void setVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CSIVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null)?"<null>":this.driver));
        sb.append(',');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("nodePublishSecretRef");
        sb.append('=');
        sb.append(((this.nodePublishSecretRef == null)?"<null>":this.nodePublishSecretRef));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("volumeAttributes");
        sb.append('=');
        sb.append(((this.volumeAttributes == null)?"<null>":this.volumeAttributes));
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
        result = ((result* 31)+((this.driver == null)? 0 :this.driver.hashCode()));
        result = ((result* 31)+((this.nodePublishSecretRef == null)? 0 :this.nodePublishSecretRef.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.volumeAttributes == null)? 0 :this.volumeAttributes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CSIVolumeSource) == false) {
            return false;
        }
        CSIVolumeSource rhs = ((CSIVolumeSource) other);
        return ((((((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly)))&&((this.driver == rhs.driver)||((this.driver!= null)&&this.driver.equals(rhs.driver))))&&((this.nodePublishSecretRef == rhs.nodePublishSecretRef)||((this.nodePublishSecretRef!= null)&&this.nodePublishSecretRef.equals(rhs.nodePublishSecretRef))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.volumeAttributes == rhs.volumeAttributes)||((this.volumeAttributes!= null)&&this.volumeAttributes.equals(rhs.volumeAttributes))));
    }

}
