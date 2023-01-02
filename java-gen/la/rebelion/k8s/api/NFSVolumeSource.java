
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path",
    "readOnly",
    "server"
})
@Generated("jsonschema2pojo")
public class NFSVolumeSource {

    /**
     * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    private String path;
    /**
     * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    private Boolean readOnly;
    /**
     * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    private String server;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NFSVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public NFSVolumeSource(NFSVolumeSource source) {
        super();
        this.path = source.path;
        this.readOnly = source.readOnly;
        this.server = source.server;
    }

    /**
     * 
     * @param path
     * @param server
     * @param readOnly
     */
    public NFSVolumeSource(String path, Boolean readOnly, String server) {
        super();
        this.path = path;
        this.readOnly = readOnly;
        this.server = server;
    }

    /**
     * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    /**
     * server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * (Required)
     * 
     */
    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NFSVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.server == null)? 0 :this.server.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NFSVolumeSource) == false) {
            return false;
        }
        NFSVolumeSource rhs = ((NFSVolumeSource) other);
        return ((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.server == rhs.server)||((this.server!= null)&&this.server.equals(rhs.server))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))));
    }

}
