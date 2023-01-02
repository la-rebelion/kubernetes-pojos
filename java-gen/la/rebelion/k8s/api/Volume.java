
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awsElasticBlockStore",
    "azureDisk",
    "azureFile",
    "cephfs",
    "cinder",
    "configMap",
    "csi",
    "downwardAPI",
    "emptyDir",
    "ephemeral",
    "fc",
    "flexVolume",
    "flocker",
    "gcePersistentDisk",
    "gitRepo",
    "glusterfs",
    "hostPath",
    "iscsi",
    "name",
    "nfs",
    "persistentVolumeClaim",
    "photonPersistentDisk",
    "portworxVolume",
    "projected",
    "quobyte",
    "rbd",
    "scaleIO",
    "secret",
    "storageos",
    "vsphereVolume"
})
@Generated("jsonschema2pojo")
public class Volume {

    /**
     * Represents a Persistent Disk resource in AWS.
     * 
     * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    @JsonPropertyDescription("Represents a Persistent Disk resource in AWS.\n\nAn AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.")
    private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureDisk")
    @JsonPropertyDescription("AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
    private AzureDiskVolumeSource azureDisk;
    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureFile")
    @JsonPropertyDescription("AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
    private AzureFileVolumeSource azureFile;
    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("cephfs")
    @JsonPropertyDescription("Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.")
    private CephFSVolumeSource cephfs;
    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("cinder")
    @JsonPropertyDescription("Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.")
    private CinderVolumeSource cinder;
    /**
     * Adapts a ConfigMap into a volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("Adapts a ConfigMap into a volume.\n\nThe contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.")
    private ConfigMapVolumeSource configMap;
    /**
     * Represents a source location of a volume to mount, managed by an external CSI driver
     * 
     */
    @JsonProperty("csi")
    @JsonPropertyDescription("Represents a source location of a volume to mount, managed by an external CSI driver")
    private CSIVolumeSource csi;
    /**
     * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("downwardAPI")
    @JsonPropertyDescription("DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.")
    private DownwardAPIVolumeSource downwardAPI;
    /**
     * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("emptyDir")
    @JsonPropertyDescription("Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.")
    private EmptyDirVolumeSource emptyDir;
    /**
     * Represents an ephemeral volume that is handled by a normal storage driver.
     * 
     */
    @JsonProperty("ephemeral")
    @JsonPropertyDescription("Represents an ephemeral volume that is handled by a normal storage driver.")
    private EphemeralVolumeSource ephemeral;
    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("fc")
    @JsonPropertyDescription("Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")
    private FCVolumeSource fc;
    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    @JsonProperty("flexVolume")
    @JsonPropertyDescription("FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
    private FlexVolumeSource flexVolume;
    /**
     * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("flocker")
    @JsonPropertyDescription("Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")
    private FlockerVolumeSource flocker;
    /**
     * Represents a Persistent Disk resource in Google Compute Engine.
     * 
     * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("gcePersistentDisk")
    @JsonPropertyDescription("Represents a Persistent Disk resource in Google Compute Engine.\n\nA GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.")
    private GCEPersistentDiskVolumeSource gcePersistentDisk;
    /**
     * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
     * 
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    @JsonProperty("gitRepo")
    @JsonPropertyDescription("Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.\n\nDEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
    private GitRepoVolumeSource gitRepo;
    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("glusterfs")
    @JsonPropertyDescription("Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.")
    private GlusterfsVolumeSource glusterfs;
    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("hostPath")
    @JsonPropertyDescription("Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.")
    private HostPathVolumeSource hostPath;
    /**
     * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("iscsi")
    @JsonPropertyDescription("Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")
    private ISCSIVolumeSource iscsi;
    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    private String name;
    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("nfs")
    @JsonPropertyDescription("Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.")
    private NFSVolumeSource nfs;
    /**
     * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    @JsonPropertyDescription("PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).")
    private PersistentVolumeClaimVolumeSource persistentVolumeClaim;
    /**
     * Represents a Photon Controller persistent disk resource.
     * 
     */
    @JsonProperty("photonPersistentDisk")
    @JsonPropertyDescription("Represents a Photon Controller persistent disk resource.")
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    /**
     * PortworxVolumeSource represents a Portworx volume resource.
     * 
     */
    @JsonProperty("portworxVolume")
    @JsonPropertyDescription("PortworxVolumeSource represents a Portworx volume resource.")
    private PortworxVolumeSource portworxVolume;
    /**
     * Represents a projected volume source
     * 
     */
    @JsonProperty("projected")
    @JsonPropertyDescription("Represents a projected volume source")
    private ProjectedVolumeSource projected;
    /**
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("quobyte")
    @JsonPropertyDescription("Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")
    private QuobyteVolumeSource quobyte;
    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("rbd")
    @JsonPropertyDescription("Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.")
    private RBDVolumeSource rbd;
    /**
     * ScaleIOVolumeSource represents a persistent ScaleIO volume
     * 
     */
    @JsonProperty("scaleIO")
    @JsonPropertyDescription("ScaleIOVolumeSource represents a persistent ScaleIO volume")
    private ScaleIOVolumeSource scaleIO;
    /**
     * Adapts a Secret into a volume.
     * 
     * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("Adapts a Secret into a volume.\n\nThe contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.")
    private SecretVolumeSource secret;
    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    @JsonProperty("storageos")
    @JsonPropertyDescription("Represents a StorageOS persistent volume resource.")
    private StorageOSVolumeSource storageos;
    /**
     * Represents a vSphere volume resource.
     * 
     */
    @JsonProperty("vsphereVolume")
    @JsonPropertyDescription("Represents a vSphere volume resource.")
    private VsphereVirtualDiskVolumeSource vsphereVolume;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Volume() {
    }

    /**
     * 
     * @param source
     */
    public Volume(Volume source) {
        super();
        this.awsElasticBlockStore = source.awsElasticBlockStore;
        this.azureDisk = source.azureDisk;
        this.azureFile = source.azureFile;
        this.cephfs = source.cephfs;
        this.cinder = source.cinder;
        this.configMap = source.configMap;
        this.csi = source.csi;
        this.downwardAPI = source.downwardAPI;
        this.emptyDir = source.emptyDir;
        this.ephemeral = source.ephemeral;
        this.fc = source.fc;
        this.flexVolume = source.flexVolume;
        this.flocker = source.flocker;
        this.gcePersistentDisk = source.gcePersistentDisk;
        this.gitRepo = source.gitRepo;
        this.glusterfs = source.glusterfs;
        this.hostPath = source.hostPath;
        this.iscsi = source.iscsi;
        this.name = source.name;
        this.nfs = source.nfs;
        this.persistentVolumeClaim = source.persistentVolumeClaim;
        this.photonPersistentDisk = source.photonPersistentDisk;
        this.portworxVolume = source.portworxVolume;
        this.projected = source.projected;
        this.quobyte = source.quobyte;
        this.rbd = source.rbd;
        this.scaleIO = source.scaleIO;
        this.secret = source.secret;
        this.storageos = source.storageos;
        this.vsphereVolume = source.vsphereVolume;
    }

    /**
     * 
     * @param quobyte
     * @param azureFile
     * @param flexVolume
     * @param ephemeral
     * @param secret
     * @param projected
     * @param cephfs
     * @param scaleIO
     * @param emptyDir
     * @param glusterfs
     * @param gcePersistentDisk
     * @param photonPersistentDisk
     * @param azureDisk
     * @param cinder
     * @param downwardAPI
     * @param awsElasticBlockStore
     * @param flocker
     * @param iscsi
     * @param rbd
     * @param configMap
     * @param storageos
     * @param csi
     * @param name
     * @param nfs
     * @param persistentVolumeClaim
     * @param gitRepo
     * @param portworxVolume
     * @param vsphereVolume
     * @param fc
     * @param hostPath
     */
    public Volume(AWSElasticBlockStoreVolumeSource awsElasticBlockStore, AzureDiskVolumeSource azureDisk, AzureFileVolumeSource azureFile, CephFSVolumeSource cephfs, CinderVolumeSource cinder, ConfigMapVolumeSource configMap, CSIVolumeSource csi, DownwardAPIVolumeSource downwardAPI, EmptyDirVolumeSource emptyDir, EphemeralVolumeSource ephemeral, FCVolumeSource fc, FlexVolumeSource flexVolume, FlockerVolumeSource flocker, GCEPersistentDiskVolumeSource gcePersistentDisk, GitRepoVolumeSource gitRepo, GlusterfsVolumeSource glusterfs, HostPathVolumeSource hostPath, ISCSIVolumeSource iscsi, String name, NFSVolumeSource nfs, PersistentVolumeClaimVolumeSource persistentVolumeClaim, PhotonPersistentDiskVolumeSource photonPersistentDisk, PortworxVolumeSource portworxVolume, ProjectedVolumeSource projected, QuobyteVolumeSource quobyte, RBDVolumeSource rbd, ScaleIOVolumeSource scaleIO, SecretVolumeSource secret, StorageOSVolumeSource storageos, VsphereVirtualDiskVolumeSource vsphereVolume) {
        super();
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.configMap = configMap;
        this.csi = csi;
        this.downwardAPI = downwardAPI;
        this.emptyDir = emptyDir;
        this.ephemeral = ephemeral;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.gitRepo = gitRepo;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.name = name;
        this.nfs = nfs;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.projected = projected;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.secret = secret;
        this.storageos = storageos;
        this.vsphereVolume = vsphereVolume;
    }

    /**
     * Represents a Persistent Disk resource in AWS.
     * 
     * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    /**
     * Represents a Persistent Disk resource in AWS.
     * 
     * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    public void setAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureDisk")
    public AzureDiskVolumeSource getAzureDisk() {
        return azureDisk;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureDisk")
    public void setAzureDisk(AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureFile")
    public AzureFileVolumeSource getAzureFile() {
        return azureFile;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    @JsonProperty("azureFile")
    public void setAzureFile(AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("cephfs")
    public CephFSVolumeSource getCephfs() {
        return cephfs;
    }

    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("cephfs")
    public void setCephfs(CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("cinder")
    public CinderVolumeSource getCinder() {
        return cinder;
    }

    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("cinder")
    public void setCinder(CinderVolumeSource cinder) {
        this.cinder = cinder;
    }

    /**
     * Adapts a ConfigMap into a volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("configMap")
    public ConfigMapVolumeSource getConfigMap() {
        return configMap;
    }

    /**
     * Adapts a ConfigMap into a volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMapVolumeSource configMap) {
        this.configMap = configMap;
    }

    /**
     * Represents a source location of a volume to mount, managed by an external CSI driver
     * 
     */
    @JsonProperty("csi")
    public CSIVolumeSource getCsi() {
        return csi;
    }

    /**
     * Represents a source location of a volume to mount, managed by an external CSI driver
     * 
     */
    @JsonProperty("csi")
    public void setCsi(CSIVolumeSource csi) {
        this.csi = csi;
    }

    /**
     * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("downwardAPI")
    public DownwardAPIVolumeSource getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPIVolumeSource downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("emptyDir")
    public EmptyDirVolumeSource getEmptyDir() {
        return emptyDir;
    }

    /**
     * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("emptyDir")
    public void setEmptyDir(EmptyDirVolumeSource emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * Represents an ephemeral volume that is handled by a normal storage driver.
     * 
     */
    @JsonProperty("ephemeral")
    public EphemeralVolumeSource getEphemeral() {
        return ephemeral;
    }

    /**
     * Represents an ephemeral volume that is handled by a normal storage driver.
     * 
     */
    @JsonProperty("ephemeral")
    public void setEphemeral(EphemeralVolumeSource ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("fc")
    public FCVolumeSource getFc() {
        return fc;
    }

    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("fc")
    public void setFc(FCVolumeSource fc) {
        this.fc = fc;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    @JsonProperty("flexVolume")
    public FlexVolumeSource getFlexVolume() {
        return flexVolume;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    @JsonProperty("flexVolume")
    public void setFlexVolume(FlexVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("flocker")
    public FlockerVolumeSource getFlocker() {
        return flocker;
    }

    /**
     * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("flocker")
    public void setFlocker(FlockerVolumeSource flocker) {
        this.flocker = flocker;
    }

    /**
     * Represents a Persistent Disk resource in Google Compute Engine.
     * 
     * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("gcePersistentDisk")
    public GCEPersistentDiskVolumeSource getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    /**
     * Represents a Persistent Disk resource in Google Compute Engine.
     * 
     * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("gcePersistentDisk")
    public void setGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
     * 
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    @JsonProperty("gitRepo")
    public GitRepoVolumeSource getGitRepo() {
        return gitRepo;
    }

    /**
     * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
     * 
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    @JsonProperty("gitRepo")
    public void setGitRepo(GitRepoVolumeSource gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("glusterfs")
    public GlusterfsVolumeSource getGlusterfs() {
        return glusterfs;
    }

    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("glusterfs")
    public void setGlusterfs(GlusterfsVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("hostPath")
    public HostPathVolumeSource getHostPath() {
        return hostPath;
    }

    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("hostPath")
    public void setHostPath(HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("iscsi")
    public ISCSIVolumeSource getIscsi() {
        return iscsi;
    }

    /**
     * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("iscsi")
    public void setIscsi(ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("nfs")
    public NFSVolumeSource getNfs() {
        return nfs;
    }

    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("nfs")
    public void setNfs(NFSVolumeSource nfs) {
        this.nfs = nfs;
    }

    /**
     * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    /**
     * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public void setPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * Represents a Photon Controller persistent disk resource.
     * 
     */
    @JsonProperty("photonPersistentDisk")
    public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    /**
     * Represents a Photon Controller persistent disk resource.
     * 
     */
    @JsonProperty("photonPersistentDisk")
    public void setPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * PortworxVolumeSource represents a Portworx volume resource.
     * 
     */
    @JsonProperty("portworxVolume")
    public PortworxVolumeSource getPortworxVolume() {
        return portworxVolume;
    }

    /**
     * PortworxVolumeSource represents a Portworx volume resource.
     * 
     */
    @JsonProperty("portworxVolume")
    public void setPortworxVolume(PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * Represents a projected volume source
     * 
     */
    @JsonProperty("projected")
    public ProjectedVolumeSource getProjected() {
        return projected;
    }

    /**
     * Represents a projected volume source
     * 
     */
    @JsonProperty("projected")
    public void setProjected(ProjectedVolumeSource projected) {
        this.projected = projected;
    }

    /**
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("quobyte")
    public QuobyteVolumeSource getQuobyte() {
        return quobyte;
    }

    /**
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    @JsonProperty("quobyte")
    public void setQuobyte(QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("rbd")
    public RBDVolumeSource getRbd() {
        return rbd;
    }

    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("rbd")
    public void setRbd(RBDVolumeSource rbd) {
        this.rbd = rbd;
    }

    /**
     * ScaleIOVolumeSource represents a persistent ScaleIO volume
     * 
     */
    @JsonProperty("scaleIO")
    public ScaleIOVolumeSource getScaleIO() {
        return scaleIO;
    }

    /**
     * ScaleIOVolumeSource represents a persistent ScaleIO volume
     * 
     */
    @JsonProperty("scaleIO")
    public void setScaleIO(ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * Adapts a Secret into a volume.
     * 
     * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("secret")
    public SecretVolumeSource getSecret() {
        return secret;
    }

    /**
     * Adapts a Secret into a volume.
     * 
     * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
     * 
     */
    @JsonProperty("secret")
    public void setSecret(SecretVolumeSource secret) {
        this.secret = secret;
    }

    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    @JsonProperty("storageos")
    public StorageOSVolumeSource getStorageos() {
        return storageos;
    }

    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    @JsonProperty("storageos")
    public void setStorageos(StorageOSVolumeSource storageos) {
        this.storageos = storageos;
    }

    /**
     * Represents a vSphere volume resource.
     * 
     */
    @JsonProperty("vsphereVolume")
    public VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return vsphereVolume;
    }

    /**
     * Represents a vSphere volume resource.
     * 
     */
    @JsonProperty("vsphereVolume")
    public void setVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Volume.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awsElasticBlockStore");
        sb.append('=');
        sb.append(((this.awsElasticBlockStore == null)?"<null>":this.awsElasticBlockStore));
        sb.append(',');
        sb.append("azureDisk");
        sb.append('=');
        sb.append(((this.azureDisk == null)?"<null>":this.azureDisk));
        sb.append(',');
        sb.append("azureFile");
        sb.append('=');
        sb.append(((this.azureFile == null)?"<null>":this.azureFile));
        sb.append(',');
        sb.append("cephfs");
        sb.append('=');
        sb.append(((this.cephfs == null)?"<null>":this.cephfs));
        sb.append(',');
        sb.append("cinder");
        sb.append('=');
        sb.append(((this.cinder == null)?"<null>":this.cinder));
        sb.append(',');
        sb.append("configMap");
        sb.append('=');
        sb.append(((this.configMap == null)?"<null>":this.configMap));
        sb.append(',');
        sb.append("csi");
        sb.append('=');
        sb.append(((this.csi == null)?"<null>":this.csi));
        sb.append(',');
        sb.append("downwardAPI");
        sb.append('=');
        sb.append(((this.downwardAPI == null)?"<null>":this.downwardAPI));
        sb.append(',');
        sb.append("emptyDir");
        sb.append('=');
        sb.append(((this.emptyDir == null)?"<null>":this.emptyDir));
        sb.append(',');
        sb.append("ephemeral");
        sb.append('=');
        sb.append(((this.ephemeral == null)?"<null>":this.ephemeral));
        sb.append(',');
        sb.append("fc");
        sb.append('=');
        sb.append(((this.fc == null)?"<null>":this.fc));
        sb.append(',');
        sb.append("flexVolume");
        sb.append('=');
        sb.append(((this.flexVolume == null)?"<null>":this.flexVolume));
        sb.append(',');
        sb.append("flocker");
        sb.append('=');
        sb.append(((this.flocker == null)?"<null>":this.flocker));
        sb.append(',');
        sb.append("gcePersistentDisk");
        sb.append('=');
        sb.append(((this.gcePersistentDisk == null)?"<null>":this.gcePersistentDisk));
        sb.append(',');
        sb.append("gitRepo");
        sb.append('=');
        sb.append(((this.gitRepo == null)?"<null>":this.gitRepo));
        sb.append(',');
        sb.append("glusterfs");
        sb.append('=');
        sb.append(((this.glusterfs == null)?"<null>":this.glusterfs));
        sb.append(',');
        sb.append("hostPath");
        sb.append('=');
        sb.append(((this.hostPath == null)?"<null>":this.hostPath));
        sb.append(',');
        sb.append("iscsi");
        sb.append('=');
        sb.append(((this.iscsi == null)?"<null>":this.iscsi));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nfs");
        sb.append('=');
        sb.append(((this.nfs == null)?"<null>":this.nfs));
        sb.append(',');
        sb.append("persistentVolumeClaim");
        sb.append('=');
        sb.append(((this.persistentVolumeClaim == null)?"<null>":this.persistentVolumeClaim));
        sb.append(',');
        sb.append("photonPersistentDisk");
        sb.append('=');
        sb.append(((this.photonPersistentDisk == null)?"<null>":this.photonPersistentDisk));
        sb.append(',');
        sb.append("portworxVolume");
        sb.append('=');
        sb.append(((this.portworxVolume == null)?"<null>":this.portworxVolume));
        sb.append(',');
        sb.append("projected");
        sb.append('=');
        sb.append(((this.projected == null)?"<null>":this.projected));
        sb.append(',');
        sb.append("quobyte");
        sb.append('=');
        sb.append(((this.quobyte == null)?"<null>":this.quobyte));
        sb.append(',');
        sb.append("rbd");
        sb.append('=');
        sb.append(((this.rbd == null)?"<null>":this.rbd));
        sb.append(',');
        sb.append("scaleIO");
        sb.append('=');
        sb.append(((this.scaleIO == null)?"<null>":this.scaleIO));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("storageos");
        sb.append('=');
        sb.append(((this.storageos == null)?"<null>":this.storageos));
        sb.append(',');
        sb.append("vsphereVolume");
        sb.append('=');
        sb.append(((this.vsphereVolume == null)?"<null>":this.vsphereVolume));
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
        result = ((result* 31)+((this.quobyte == null)? 0 :this.quobyte.hashCode()));
        result = ((result* 31)+((this.azureFile == null)? 0 :this.azureFile.hashCode()));
        result = ((result* 31)+((this.flexVolume == null)? 0 :this.flexVolume.hashCode()));
        result = ((result* 31)+((this.ephemeral == null)? 0 :this.ephemeral.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.projected == null)? 0 :this.projected.hashCode()));
        result = ((result* 31)+((this.cephfs == null)? 0 :this.cephfs.hashCode()));
        result = ((result* 31)+((this.scaleIO == null)? 0 :this.scaleIO.hashCode()));
        result = ((result* 31)+((this.emptyDir == null)? 0 :this.emptyDir.hashCode()));
        result = ((result* 31)+((this.glusterfs == null)? 0 :this.glusterfs.hashCode()));
        result = ((result* 31)+((this.gcePersistentDisk == null)? 0 :this.gcePersistentDisk.hashCode()));
        result = ((result* 31)+((this.photonPersistentDisk == null)? 0 :this.photonPersistentDisk.hashCode()));
        result = ((result* 31)+((this.azureDisk == null)? 0 :this.azureDisk.hashCode()));
        result = ((result* 31)+((this.cinder == null)? 0 :this.cinder.hashCode()));
        result = ((result* 31)+((this.downwardAPI == null)? 0 :this.downwardAPI.hashCode()));
        result = ((result* 31)+((this.awsElasticBlockStore == null)? 0 :this.awsElasticBlockStore.hashCode()));
        result = ((result* 31)+((this.flocker == null)? 0 :this.flocker.hashCode()));
        result = ((result* 31)+((this.iscsi == null)? 0 :this.iscsi.hashCode()));
        result = ((result* 31)+((this.rbd == null)? 0 :this.rbd.hashCode()));
        result = ((result* 31)+((this.configMap == null)? 0 :this.configMap.hashCode()));
        result = ((result* 31)+((this.storageos == null)? 0 :this.storageos.hashCode()));
        result = ((result* 31)+((this.csi == null)? 0 :this.csi.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nfs == null)? 0 :this.nfs.hashCode()));
        result = ((result* 31)+((this.persistentVolumeClaim == null)? 0 :this.persistentVolumeClaim.hashCode()));
        result = ((result* 31)+((this.gitRepo == null)? 0 :this.gitRepo.hashCode()));
        result = ((result* 31)+((this.portworxVolume == null)? 0 :this.portworxVolume.hashCode()));
        result = ((result* 31)+((this.vsphereVolume == null)? 0 :this.vsphereVolume.hashCode()));
        result = ((result* 31)+((this.fc == null)? 0 :this.fc.hashCode()));
        result = ((result* 31)+((this.hostPath == null)? 0 :this.hostPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volume) == false) {
            return false;
        }
        Volume rhs = ((Volume) other);
        return (((((((((((((((((((((((((((((((this.quobyte == rhs.quobyte)||((this.quobyte!= null)&&this.quobyte.equals(rhs.quobyte)))&&((this.azureFile == rhs.azureFile)||((this.azureFile!= null)&&this.azureFile.equals(rhs.azureFile))))&&((this.flexVolume == rhs.flexVolume)||((this.flexVolume!= null)&&this.flexVolume.equals(rhs.flexVolume))))&&((this.ephemeral == rhs.ephemeral)||((this.ephemeral!= null)&&this.ephemeral.equals(rhs.ephemeral))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.projected == rhs.projected)||((this.projected!= null)&&this.projected.equals(rhs.projected))))&&((this.cephfs == rhs.cephfs)||((this.cephfs!= null)&&this.cephfs.equals(rhs.cephfs))))&&((this.scaleIO == rhs.scaleIO)||((this.scaleIO!= null)&&this.scaleIO.equals(rhs.scaleIO))))&&((this.emptyDir == rhs.emptyDir)||((this.emptyDir!= null)&&this.emptyDir.equals(rhs.emptyDir))))&&((this.glusterfs == rhs.glusterfs)||((this.glusterfs!= null)&&this.glusterfs.equals(rhs.glusterfs))))&&((this.gcePersistentDisk == rhs.gcePersistentDisk)||((this.gcePersistentDisk!= null)&&this.gcePersistentDisk.equals(rhs.gcePersistentDisk))))&&((this.photonPersistentDisk == rhs.photonPersistentDisk)||((this.photonPersistentDisk!= null)&&this.photonPersistentDisk.equals(rhs.photonPersistentDisk))))&&((this.azureDisk == rhs.azureDisk)||((this.azureDisk!= null)&&this.azureDisk.equals(rhs.azureDisk))))&&((this.cinder == rhs.cinder)||((this.cinder!= null)&&this.cinder.equals(rhs.cinder))))&&((this.downwardAPI == rhs.downwardAPI)||((this.downwardAPI!= null)&&this.downwardAPI.equals(rhs.downwardAPI))))&&((this.awsElasticBlockStore == rhs.awsElasticBlockStore)||((this.awsElasticBlockStore!= null)&&this.awsElasticBlockStore.equals(rhs.awsElasticBlockStore))))&&((this.flocker == rhs.flocker)||((this.flocker!= null)&&this.flocker.equals(rhs.flocker))))&&((this.iscsi == rhs.iscsi)||((this.iscsi!= null)&&this.iscsi.equals(rhs.iscsi))))&&((this.rbd == rhs.rbd)||((this.rbd!= null)&&this.rbd.equals(rhs.rbd))))&&((this.configMap == rhs.configMap)||((this.configMap!= null)&&this.configMap.equals(rhs.configMap))))&&((this.storageos == rhs.storageos)||((this.storageos!= null)&&this.storageos.equals(rhs.storageos))))&&((this.csi == rhs.csi)||((this.csi!= null)&&this.csi.equals(rhs.csi))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nfs == rhs.nfs)||((this.nfs!= null)&&this.nfs.equals(rhs.nfs))))&&((this.persistentVolumeClaim == rhs.persistentVolumeClaim)||((this.persistentVolumeClaim!= null)&&this.persistentVolumeClaim.equals(rhs.persistentVolumeClaim))))&&((this.gitRepo == rhs.gitRepo)||((this.gitRepo!= null)&&this.gitRepo.equals(rhs.gitRepo))))&&((this.portworxVolume == rhs.portworxVolume)||((this.portworxVolume!= null)&&this.portworxVolume.equals(rhs.portworxVolume))))&&((this.vsphereVolume == rhs.vsphereVolume)||((this.vsphereVolume!= null)&&this.vsphereVolume.equals(rhs.vsphereVolume))))&&((this.fc == rhs.fc)||((this.fc!= null)&&this.fc.equals(rhs.fc))))&&((this.hostPath == rhs.hostPath)||((this.hostPath!= null)&&this.hostPath.equals(rhs.hostPath))));
    }

}
