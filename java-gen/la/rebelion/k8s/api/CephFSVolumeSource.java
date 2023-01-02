
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monitors",
    "path",
    "readOnly",
    "secretFile",
    "secretRef",
    "user"
})
@Generated("jsonschema2pojo")
public class CephFSVolumeSource {

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    @JsonPropertyDescription("monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    private List<String> monitors = new ArrayList<String>();
    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
    private String path;
    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    private Boolean readOnly;
    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("secretFile")
    @JsonPropertyDescription("secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    private String secretFile;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.")
    private LocalObjectReference secretRef;
    /**
     * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    private String user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CephFSVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public CephFSVolumeSource(CephFSVolumeSource source) {
        super();
        this.monitors = source.monitors;
        this.path = source.path;
        this.readOnly = source.readOnly;
        this.secretFile = source.secretFile;
        this.secretRef = source.secretRef;
        this.user = source.user;
    }

    /**
     * 
     * @param path
     * @param secretRef
     * @param secretFile
     * @param readOnly
     * @param user
     * @param monitors
     */
    public CephFSVolumeSource(List<String> monitors, String path, Boolean readOnly, String secretFile, LocalObjectReference secretRef, String user) {
        super();
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    public List<String> getMonitors() {
        return monitors;
    }

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * (Required)
     * 
     */
    @JsonProperty("monitors")
    public void setMonitors(List<String> monitors) {
        this.monitors = monitors;
    }

    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("secretFile")
    public String getSecretFile() {
        return secretFile;
    }

    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("secretFile")
    public void setSecretFile(String secretFile) {
        this.secretFile = secretFile;
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
     * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CephFSVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("monitors");
        sb.append('=');
        sb.append(((this.monitors == null)?"<null>":this.monitors));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretFile");
        sb.append('=');
        sb.append(((this.secretFile == null)?"<null>":this.secretFile));
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
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.secretFile == null)? 0 :this.secretFile.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.monitors == null)? 0 :this.monitors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CephFSVolumeSource) == false) {
            return false;
        }
        CephFSVolumeSource rhs = ((CephFSVolumeSource) other);
        return (((((((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.secretFile == rhs.secretFile)||((this.secretFile!= null)&&this.secretFile.equals(rhs.secretFile))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.monitors == rhs.monitors)||((this.monitors!= null)&&this.monitors.equals(rhs.monitors))));
    }

}
