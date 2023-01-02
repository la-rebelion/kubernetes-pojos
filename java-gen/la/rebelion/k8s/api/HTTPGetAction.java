
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "httpHeaders",
    "path",
    "port",
    "scheme"
})
@Generated("jsonschema2pojo")
public class HTTPGetAction {

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
    private String host;
    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    @JsonPropertyDescription("Custom headers to set in the request. HTTP allows repeated headers.")
    private List<HTTPHeader> httpHeaders = new ArrayList<HTTPHeader>();
    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Path to access on the HTTP server.")
    private String path;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
    private String port;
    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * 
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Scheme to use for connecting to the host. Defaults to HTTP.\n\n")
    private String scheme;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HTTPGetAction() {
    }

    /**
     * 
     * @param source
     */
    public HTTPGetAction(HTTPGetAction source) {
        super();
        this.host = source.host;
        this.httpHeaders = source.httpHeaders;
        this.path = source.path;
        this.port = source.port;
        this.scheme = source.scheme;
    }

    /**
     * 
     * @param path
     * @param scheme
     * @param port
     * @param host
     * @param httpHeaders
     */
    public HTTPGetAction(String host, List<HTTPHeader> httpHeaders, String path, String port, String scheme) {
        super();
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = port;
        this.scheme = scheme;
    }

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    public List<HTTPHeader> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    public void setHttpHeaders(List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
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

    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * 
     * 
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * 
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HTTPGetAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("httpHeaders");
        sb.append('=');
        sb.append(((this.httpHeaders == null)?"<null>":this.httpHeaders));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.httpHeaders == null)? 0 :this.httpHeaders.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HTTPGetAction) == false) {
            return false;
        }
        HTTPGetAction rhs = ((HTTPGetAction) other);
        return ((((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.httpHeaders == rhs.httpHeaders)||((this.httpHeaders!= null)&&this.httpHeaders.equals(rhs.httpHeaders))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))));
    }

}
