
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IP address information for entries in the (plural) PodIPs field. Each entry includes:
 * 
 * 	IP: An IP address allocated to the pod. Routable at least within the cluster.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ip"
})
@Generated("jsonschema2pojo")
public class PodIP {

    /**
     * ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("ip is an IP address (IPv4 or IPv6) assigned to the pod")
    private String ip;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodIP() {
    }

    /**
     * 
     * @param source
     */
    public PodIP(PodIP source) {
        super();
        this.ip = source.ip;
    }

    /**
     * 
     * @param ip
     */
    public PodIP(String ip) {
        super();
        this.ip = ip;
    }

    /**
     * ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodIP.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.ip == null)? 0 :this.ip.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodIP) == false) {
            return false;
        }
        PodIP rhs = ((PodIP) other);
        return ((this.ip == rhs.ip)||((this.ip!= null)&&this.ip.equals(rhs.ip)));
    }

}
