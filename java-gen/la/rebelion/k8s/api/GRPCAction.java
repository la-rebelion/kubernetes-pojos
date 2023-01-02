
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "port",
    "service"
})
@Generated("jsonschema2pojo")
public class GRPCAction {

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("Port number of the gRPC service. Number must be in the range 1 to 65535.")
    private Integer port;
    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).\n\nIf this is not specified, the default behavior is defined by gRPC.")
    private String service;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GRPCAction() {
    }

    /**
     * 
     * @param source
     */
    public GRPCAction(GRPCAction source) {
        super();
        this.port = source.port;
        this.service = source.service;
    }

    /**
     * 
     * @param port
     * @param service
     */
    public GRPCAction(Integer port, String service) {
        super();
        this.port = port;
        this.service = service;
    }

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GRPCAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
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
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GRPCAction) == false) {
            return false;
        }
        GRPCAction rhs = ((GRPCAction) other);
        return (((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port)))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))));
    }

}
