
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hostnames",
    "ip"
})
@Generated("jsonschema2pojo")
public class HostAlias {

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    @JsonPropertyDescription("Hostnames for the above IP address.")
    private List<String> hostnames = new ArrayList<String>();
    /**
     * IP address of the host file entry.
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("IP address of the host file entry.")
    private String ip;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HostAlias() {
    }

    /**
     * 
     * @param source
     */
    public HostAlias(HostAlias source) {
        super();
        this.hostnames = source.hostnames;
        this.ip = source.ip;
    }

    /**
     * 
     * @param ip
     * @param hostnames
     */
    public HostAlias(List<String> hostnames, String ip) {
        super();
        this.hostnames = hostnames;
        this.ip = ip;
    }

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    public List<String> getHostnames() {
        return hostnames;
    }

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    /**
     * IP address of the host file entry.
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * IP address of the host file entry.
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostAlias.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hostnames");
        sb.append('=');
        sb.append(((this.hostnames == null)?"<null>":this.hostnames));
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null)?"<null>":this.ip));
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
        result = ((result* 31)+((this.hostnames == null)? 0 :this.hostnames.hashCode()));
        result = ((result* 31)+((this.ip == null)? 0 :this.ip.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostAlias) == false) {
            return false;
        }
        HostAlias rhs = ((HostAlias) other);
        return (((this.hostnames == rhs.hostnames)||((this.hostnames!= null)&&this.hostnames.equals(rhs.hostnames)))&&((this.ip == rhs.ip)||((this.ip!= null)&&this.ip.equals(rhs.ip))));
    }

}
