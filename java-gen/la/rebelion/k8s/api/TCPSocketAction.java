
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TCPSocketAction describes an action based on opening a socket
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "port"
})
@Generated("jsonschema2pojo")
public class TCPSocketAction {

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("Optional: Host name to connect to, defaults to the pod IP.")
    private String host;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
    private String port;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TCPSocketAction() {
    }

    /**
     * 
     * @param source
     */
    public TCPSocketAction(TCPSocketAction source) {
        super();
        this.host = source.host;
        this.port = source.port;
    }

    /**
     * 
     * @param port
     * @param host
     */
    public TCPSocketAction(String host, String port) {
        super();
        this.host = host;
        this.port = port;
    }

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TCPSocketAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
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
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TCPSocketAction) == false) {
            return false;
        }
        TCPSocketAction rhs = ((TCPSocketAction) other);
        return (((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))));
    }

}
