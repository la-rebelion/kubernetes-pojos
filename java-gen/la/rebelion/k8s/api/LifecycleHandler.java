
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exec",
    "httpGet",
    "tcpSocket"
})
@Generated("jsonschema2pojo")
public class LifecycleHandler {

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    @JsonProperty("exec")
    @JsonPropertyDescription("ExecAction describes a \"run in container\" action.")
    private ExecAction exec;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    @JsonProperty("httpGet")
    @JsonPropertyDescription("HTTPGetAction describes an action based on HTTP Get requests.")
    private HTTPGetAction httpGet;
    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    @JsonProperty("tcpSocket")
    @JsonPropertyDescription("TCPSocketAction describes an action based on opening a socket")
    private TCPSocketAction tcpSocket;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LifecycleHandler() {
    }

    /**
     * 
     * @param source
     */
    public LifecycleHandler(LifecycleHandler source) {
        super();
        this.exec = source.exec;
        this.httpGet = source.httpGet;
        this.tcpSocket = source.tcpSocket;
    }

    /**
     * 
     * @param tcpSocket
     * @param exec
     * @param httpGet
     */
    public LifecycleHandler(ExecAction exec, HTTPGetAction httpGet, TCPSocketAction tcpSocket) {
        super();
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    @JsonProperty("exec")
    public ExecAction getExec() {
        return exec;
    }

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    @JsonProperty("exec")
    public void setExec(ExecAction exec) {
        this.exec = exec;
    }

    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    @JsonProperty("httpGet")
    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    @JsonProperty("httpGet")
    public void setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    @JsonProperty("tcpSocket")
    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    @JsonProperty("tcpSocket")
    public void setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifecycleHandler.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exec");
        sb.append('=');
        sb.append(((this.exec == null)?"<null>":this.exec));
        sb.append(',');
        sb.append("httpGet");
        sb.append('=');
        sb.append(((this.httpGet == null)?"<null>":this.httpGet));
        sb.append(',');
        sb.append("tcpSocket");
        sb.append('=');
        sb.append(((this.tcpSocket == null)?"<null>":this.tcpSocket));
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
        result = ((result* 31)+((this.tcpSocket == null)? 0 :this.tcpSocket.hashCode()));
        result = ((result* 31)+((this.exec == null)? 0 :this.exec.hashCode()));
        result = ((result* 31)+((this.httpGet == null)? 0 :this.httpGet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecycleHandler) == false) {
            return false;
        }
        LifecycleHandler rhs = ((LifecycleHandler) other);
        return ((((this.tcpSocket == rhs.tcpSocket)||((this.tcpSocket!= null)&&this.tcpSocket.equals(rhs.tcpSocket)))&&((this.exec == rhs.exec)||((this.exec!= null)&&this.exec.equals(rhs.exec))))&&((this.httpGet == rhs.httpGet)||((this.httpGet!= null)&&this.httpGet.equals(rhs.httpGet))));
    }

}
