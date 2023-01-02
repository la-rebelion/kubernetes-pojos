
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chapAuthDiscovery",
    "chapAuthSession",
    "fsType",
    "initiatorName",
    "iqn",
    "iscsiInterface",
    "lun",
    "portals",
    "readOnly",
    "secretRef",
    "targetPortal"
})
@Generated("jsonschema2pojo")
public class ISCSIVolumeSource {

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    @JsonPropertyDescription("chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication")
    private Boolean chapAuthDiscovery;
    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    @JsonProperty("chapAuthSession")
    @JsonPropertyDescription("chapAuthSession defines whether support iSCSI Session CHAP authentication")
    private Boolean chapAuthSession;
    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")
    private String fsType;
    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     * 
     */
    @JsonProperty("initiatorName")
    @JsonPropertyDescription("initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
    private String initiatorName;
    /**
     * iqn is the target iSCSI Qualified Name.
     * (Required)
     * 
     */
    @JsonProperty("iqn")
    @JsonPropertyDescription("iqn is the target iSCSI Qualified Name.")
    private String iqn;
    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
     * 
     */
    @JsonProperty("iscsiInterface")
    @JsonPropertyDescription("iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
    private String iscsiInterface;
    /**
     * lun represents iSCSI Target Lun number.
     * (Required)
     * 
     */
    @JsonProperty("lun")
    @JsonPropertyDescription("lun represents iSCSI Target Lun number.")
    private Integer lun;
    /**
     * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    @JsonProperty("portals")
    @JsonPropertyDescription("portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
    private List<String> portals = new ArrayList<String>();
    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
    private Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * (Required)
     * 
     */
    @JsonProperty("targetPortal")
    @JsonPropertyDescription("targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
    private String targetPortal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ISCSIVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public ISCSIVolumeSource(ISCSIVolumeSource source) {
        super();
        this.chapAuthDiscovery = source.chapAuthDiscovery;
        this.chapAuthSession = source.chapAuthSession;
        this.fsType = source.fsType;
        this.initiatorName = source.initiatorName;
        this.iqn = source.iqn;
        this.iscsiInterface = source.iscsiInterface;
        this.lun = source.lun;
        this.portals = source.portals;
        this.readOnly = source.readOnly;
        this.secretRef = source.secretRef;
        this.targetPortal = source.targetPortal;
    }

    /**
     * 
     * @param chapAuthSession
     * @param iscsiInterface
     * @param lun
     * @param chapAuthDiscovery
     * @param iqn
     * @param portals
     * @param secretRef
     * @param initiatorName
     * @param readOnly
     * @param fsType
     * @param targetPortal
     */
    public ISCSIVolumeSource(Boolean chapAuthDiscovery, Boolean chapAuthSession, String fsType, String initiatorName, String iqn, String iscsiInterface, Integer lun, List<String> portals, Boolean readOnly, LocalObjectReference secretRef, String targetPortal) {
        super();
        this.chapAuthDiscovery = chapAuthDiscovery;
        this.chapAuthSession = chapAuthSession;
        this.fsType = fsType;
        this.initiatorName = initiatorName;
        this.iqn = iqn;
        this.iscsiInterface = iscsiInterface;
        this.lun = lun;
        this.portals = portals;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.targetPortal = targetPortal;
    }

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    public Boolean getChapAuthDiscovery() {
        return chapAuthDiscovery;
    }

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
    }

    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    @JsonProperty("chapAuthSession")
    public Boolean getChapAuthSession() {
        return chapAuthSession;
    }

    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     * 
     */
    @JsonProperty("chapAuthSession")
    public void setChapAuthSession(Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     * 
     */
    @JsonProperty("initiatorName")
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     * 
     */
    @JsonProperty("initiatorName")
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * iqn is the target iSCSI Qualified Name.
     * (Required)
     * 
     */
    @JsonProperty("iqn")
    public String getIqn() {
        return iqn;
    }

    /**
     * iqn is the target iSCSI Qualified Name.
     * (Required)
     * 
     */
    @JsonProperty("iqn")
    public void setIqn(String iqn) {
        this.iqn = iqn;
    }

    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
     * 
     */
    @JsonProperty("iscsiInterface")
    public String getIscsiInterface() {
        return iscsiInterface;
    }

    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
     * 
     */
    @JsonProperty("iscsiInterface")
    public void setIscsiInterface(String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
    }

    /**
     * lun represents iSCSI Target Lun number.
     * (Required)
     * 
     */
    @JsonProperty("lun")
    public Integer getLun() {
        return lun;
    }

    /**
     * lun represents iSCSI Target Lun number.
     * (Required)
     * 
     */
    @JsonProperty("lun")
    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    @JsonProperty("portals")
    public List<String> getPortals() {
        return portals;
    }

    /**
     * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * 
     */
    @JsonProperty("portals")
    public void setPortals(List<String> portals) {
        this.portals = portals;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
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
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * (Required)
     * 
     */
    @JsonProperty("targetPortal")
    public String getTargetPortal() {
        return targetPortal;
    }

    /**
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     * (Required)
     * 
     */
    @JsonProperty("targetPortal")
    public void setTargetPortal(String targetPortal) {
        this.targetPortal = targetPortal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ISCSIVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chapAuthDiscovery");
        sb.append('=');
        sb.append(((this.chapAuthDiscovery == null)?"<null>":this.chapAuthDiscovery));
        sb.append(',');
        sb.append("chapAuthSession");
        sb.append('=');
        sb.append(((this.chapAuthSession == null)?"<null>":this.chapAuthSession));
        sb.append(',');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("initiatorName");
        sb.append('=');
        sb.append(((this.initiatorName == null)?"<null>":this.initiatorName));
        sb.append(',');
        sb.append("iqn");
        sb.append('=');
        sb.append(((this.iqn == null)?"<null>":this.iqn));
        sb.append(',');
        sb.append("iscsiInterface");
        sb.append('=');
        sb.append(((this.iscsiInterface == null)?"<null>":this.iscsiInterface));
        sb.append(',');
        sb.append("lun");
        sb.append('=');
        sb.append(((this.lun == null)?"<null>":this.lun));
        sb.append(',');
        sb.append("portals");
        sb.append('=');
        sb.append(((this.portals == null)?"<null>":this.portals));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
        sb.append(',');
        sb.append("targetPortal");
        sb.append('=');
        sb.append(((this.targetPortal == null)?"<null>":this.targetPortal));
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
        result = ((result* 31)+((this.chapAuthSession == null)? 0 :this.chapAuthSession.hashCode()));
        result = ((result* 31)+((this.iscsiInterface == null)? 0 :this.iscsiInterface.hashCode()));
        result = ((result* 31)+((this.lun == null)? 0 :this.lun.hashCode()));
        result = ((result* 31)+((this.chapAuthDiscovery == null)? 0 :this.chapAuthDiscovery.hashCode()));
        result = ((result* 31)+((this.iqn == null)? 0 :this.iqn.hashCode()));
        result = ((result* 31)+((this.portals == null)? 0 :this.portals.hashCode()));
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.initiatorName == null)? 0 :this.initiatorName.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.targetPortal == null)? 0 :this.targetPortal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ISCSIVolumeSource) == false) {
            return false;
        }
        ISCSIVolumeSource rhs = ((ISCSIVolumeSource) other);
        return ((((((((((((this.chapAuthSession == rhs.chapAuthSession)||((this.chapAuthSession!= null)&&this.chapAuthSession.equals(rhs.chapAuthSession)))&&((this.iscsiInterface == rhs.iscsiInterface)||((this.iscsiInterface!= null)&&this.iscsiInterface.equals(rhs.iscsiInterface))))&&((this.lun == rhs.lun)||((this.lun!= null)&&this.lun.equals(rhs.lun))))&&((this.chapAuthDiscovery == rhs.chapAuthDiscovery)||((this.chapAuthDiscovery!= null)&&this.chapAuthDiscovery.equals(rhs.chapAuthDiscovery))))&&((this.iqn == rhs.iqn)||((this.iqn!= null)&&this.iqn.equals(rhs.iqn))))&&((this.portals == rhs.portals)||((this.portals!= null)&&this.portals.equals(rhs.portals))))&&((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef))))&&((this.initiatorName == rhs.initiatorName)||((this.initiatorName!= null)&&this.initiatorName.equals(rhs.initiatorName))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.targetPortal == rhs.targetPortal)||((this.targetPortal!= null)&&this.targetPortal.equals(rhs.targetPortal))));
    }

}
