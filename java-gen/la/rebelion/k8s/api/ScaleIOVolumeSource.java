
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "gateway",
    "protectionDomain",
    "readOnly",
    "secretRef",
    "sslEnabled",
    "storageMode",
    "storagePool",
    "system",
    "volumeName"
})
@Generated("jsonschema2pojo")
public class ScaleIOVolumeSource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\".")
    private String fsType;
    /**
     * gateway is the host address of the ScaleIO API Gateway.
     * (Required)
     * 
     */
    @JsonProperty("gateway")
    @JsonPropertyDescription("gateway is the host address of the ScaleIO API Gateway.")
    private String gateway;
    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @JsonProperty("protectionDomain")
    @JsonPropertyDescription("protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.")
    private String protectionDomain;
    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * (Required)
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    @JsonProperty("sslEnabled")
    @JsonPropertyDescription("sslEnabled Flag enable/disable SSL communication with Gateway, default false")
    private Boolean sslEnabled;
    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @JsonProperty("storageMode")
    @JsonPropertyDescription("storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
    private String storageMode;
    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @JsonProperty("storagePool")
    @JsonPropertyDescription("storagePool is the ScaleIO Storage Pool associated with the protection domain.")
    private String storagePool;
    /**
     * system is the name of the storage system as configured in ScaleIO.
     * (Required)
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("system is the name of the storage system as configured in ScaleIO.")
    private String system;
    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @JsonProperty("volumeName")
    @JsonPropertyDescription("volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.")
    private String volumeName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScaleIOVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public ScaleIOVolumeSource(ScaleIOVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.gateway = source.gateway;
        this.protectionDomain = source.protectionDomain;
        this.readOnly = source.readOnly;
        this.secretRef = source.secretRef;
        this.sslEnabled = source.sslEnabled;
        this.storageMode = source.storageMode;
        this.storagePool = source.storagePool;
        this.system = source.system;
        this.volumeName = source.volumeName;
    }

    /**
     * 
     * @param system
     * @param protectionDomain
     * @param sslEnabled
     * @param storageMode
     * @param volumeName
     * @param secretRef
     * @param readOnly
     * @param fsType
     * @param storagePool
     * @param gateway
     */
    public ScaleIOVolumeSource(String fsType, String gateway, String protectionDomain, Boolean readOnly, LocalObjectReference secretRef, Boolean sslEnabled, String storageMode, String storagePool, String system, String volumeName) {
        super();
        this.fsType = fsType;
        this.gateway = gateway;
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = system;
        this.volumeName = volumeName;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * gateway is the host address of the ScaleIO API Gateway.
     * (Required)
     * 
     */
    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    /**
     * gateway is the host address of the ScaleIO API Gateway.
     * (Required)
     * 
     */
    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @JsonProperty("protectionDomain")
    public String getProtectionDomain() {
        return protectionDomain;
    }

    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @JsonProperty("protectionDomain")
    public void setProtectionDomain(String protectionDomain) {
        this.protectionDomain = protectionDomain;
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

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * (Required)
     * 
     */
    @JsonProperty("secretRef")
    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * (Required)
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    @JsonProperty("sslEnabled")
    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    /**
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false
     * 
     */
    @JsonProperty("sslEnabled")
    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @JsonProperty("storageMode")
    public String getStorageMode() {
        return storageMode;
    }

    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @JsonProperty("storageMode")
    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @JsonProperty("storagePool")
    public String getStoragePool() {
        return storagePool;
    }

    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @JsonProperty("storagePool")
    public void setStoragePool(String storagePool) {
        this.storagePool = storagePool;
    }

    /**
     * system is the name of the storage system as configured in ScaleIO.
     * (Required)
     * 
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * system is the name of the storage system as configured in ScaleIO.
     * (Required)
     * 
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @JsonProperty("volumeName")
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @JsonProperty("volumeName")
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScaleIOVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("gateway");
        sb.append('=');
        sb.append(((this.gateway == null)?"<null>":this.gateway));
        sb.append(',');
        sb.append("protectionDomain");
        sb.append('=');
        sb.append(((this.protectionDomain == null)?"<null>":this.protectionDomain));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
        sb.append(',');
        sb.append("sslEnabled");
        sb.append('=');
        sb.append(((this.sslEnabled == null)?"<null>":this.sslEnabled));
        sb.append(',');
        sb.append("storageMode");
        sb.append('=');
        sb.append(((this.storageMode == null)?"<null>":this.storageMode));
        sb.append(',');
        sb.append("storagePool");
        sb.append('=');
        sb.append(((this.storagePool == null)?"<null>":this.storagePool));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("volumeName");
        sb.append('=');
        sb.append(((this.volumeName == null)?"<null>":this.volumeName));
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
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.protectionDomain == null)? 0 :this.protectionDomain.hashCode()));
        result = ((result* 31)+((this.sslEnabled == null)? 0 :this.sslEnabled.hashCode()));
        result = ((result* 31)+((this.storageMode == null)? 0 :this.storageMode.hashCode()));
        result = ((result* 31)+((this.volumeName == null)? 0 :this.volumeName.hashCode()));
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.storagePool == null)? 0 :this.storagePool.hashCode()));
        result = ((result* 31)+((this.gateway == null)? 0 :this.gateway.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScaleIOVolumeSource) == false) {
            return false;
        }
        ScaleIOVolumeSource rhs = ((ScaleIOVolumeSource) other);
        return (((((((((((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system)))&&((this.protectionDomain == rhs.protectionDomain)||((this.protectionDomain!= null)&&this.protectionDomain.equals(rhs.protectionDomain))))&&((this.sslEnabled == rhs.sslEnabled)||((this.sslEnabled!= null)&&this.sslEnabled.equals(rhs.sslEnabled))))&&((this.storageMode == rhs.storageMode)||((this.storageMode!= null)&&this.storageMode.equals(rhs.storageMode))))&&((this.volumeName == rhs.volumeName)||((this.volumeName!= null)&&this.volumeName.equals(rhs.volumeName))))&&((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.storagePool == rhs.storagePool)||((this.storagePool!= null)&&this.storagePool.equals(rhs.storagePool))))&&((this.gateway == rhs.gateway)||((this.gateway!= null)&&this.gateway.equals(rhs.gateway))));
    }

}
