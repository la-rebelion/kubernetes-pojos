
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsType",
    "image",
    "keyring",
    "monitors",
    "pool",
    "readOnly",
    "secretRef",
    "user"
})
@Generated("jsonschema2pojo")
public class RBDVolumeSource {

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd")
    private String fsType;
    /**
     * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private String image;
    /**
     * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("keyring")
    @JsonPropertyDescription("keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private String keyring;
    /**
     * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    @JsonPropertyDescription("monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private List<String> monitors = new ArrayList<String>();
    /**
     * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("pool")
    @JsonPropertyDescription("pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private String pool;
    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private Boolean readOnly;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
    private String user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RBDVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public RBDVolumeSource(RBDVolumeSource source) {
        super();
        this.fsType = source.fsType;
        this.image = source.image;
        this.keyring = source.keyring;
        this.monitors = source.monitors;
        this.pool = source.pool;
        this.readOnly = source.readOnly;
        this.secretRef = source.secretRef;
        this.user = source.user;
    }

    /**
     * 
     * @param image
     * @param pool
     * @param secretRef
     * @param readOnly
     * @param fsType
     * @param keyring
     * @param user
     * @param monitors
     */
    public RBDVolumeSource(String fsType, String image, String keyring, List<String> monitors, String pool, Boolean readOnly, LocalObjectReference secretRef, String user) {
        super();
        this.fsType = fsType;
        this.image = image;
        this.keyring = keyring;
        this.monitors = monitors;
        this.pool = pool;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("keyring")
    public String getKeyring() {
        return keyring;
    }

    /**
     * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("keyring")
    public void setKeyring(String keyring) {
        this.keyring = keyring;
    }

    /**
     * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    public List<String> getMonitors() {
        return monitors;
    }

    /**
     * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    public void setMonitors(List<String> monitors) {
        this.monitors = monitors;
    }

    /**
     * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("pool")
    public String getPool() {
        return pool;
    }

    /**
     * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("pool")
    public void setPool(String pool) {
        this.pool = pool;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
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
     * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RBDVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("keyring");
        sb.append('=');
        sb.append(((this.keyring == null)?"<null>":this.keyring));
        sb.append(',');
        sb.append("monitors");
        sb.append('=');
        sb.append(((this.monitors == null)?"<null>":this.monitors));
        sb.append(',');
        sb.append("pool");
        sb.append('=');
        sb.append(((this.pool == null)?"<null>":this.pool));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.pool == null)? 0 :this.pool.hashCode()));
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.keyring == null)? 0 :this.keyring.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.monitors == null)? 0 :this.monitors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RBDVolumeSource) == false) {
            return false;
        }
        RBDVolumeSource rhs = ((RBDVolumeSource) other);
        return (((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.pool == rhs.pool)||((this.pool!= null)&&this.pool.equals(rhs.pool))))&&((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.keyring == rhs.keyring)||((this.keyring!= null)&&this.keyring.equals(rhs.keyring))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.monitors == rhs.monitors)||((this.monitors!= null)&&this.monitors.equals(rhs.monitors))));
    }

}
