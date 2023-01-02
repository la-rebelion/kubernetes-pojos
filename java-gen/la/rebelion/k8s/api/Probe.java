
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exec",
    "failureThreshold",
    "grpc",
    "httpGet",
    "initialDelaySeconds",
    "periodSeconds",
    "successThreshold",
    "tcpSocket",
    "terminationGracePeriodSeconds",
    "timeoutSeconds"
})
@Generated("jsonschema2pojo")
public class Probe {

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    @JsonProperty("exec")
    @JsonPropertyDescription("ExecAction describes a \"run in container\" action.")
    private ExecAction exec;
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    @JsonPropertyDescription("Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
    private Integer failureThreshold;
    @JsonProperty("grpc")
    private GRPCAction grpc;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    @JsonProperty("httpGet")
    @JsonPropertyDescription("HTTPGetAction describes an action based on HTTP Get requests.")
    private HTTPGetAction httpGet;
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    @JsonPropertyDescription("Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    private Integer initialDelaySeconds;
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    @JsonPropertyDescription("How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
    private Integer periodSeconds;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    @JsonPropertyDescription("Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
    private Integer successThreshold;
    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    @JsonProperty("tcpSocket")
    @JsonPropertyDescription("TCPSocketAction describes an action based on opening a socket")
    private TCPSocketAction tcpSocket;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    @JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.")
    private Integer terminationGracePeriodSeconds;
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    @JsonPropertyDescription("Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    private Integer timeoutSeconds;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Probe() {
    }

    /**
     * 
     * @param source
     */
    public Probe(Probe source) {
        super();
        this.exec = source.exec;
        this.failureThreshold = source.failureThreshold;
        this.grpc = source.grpc;
        this.httpGet = source.httpGet;
        this.initialDelaySeconds = source.initialDelaySeconds;
        this.periodSeconds = source.periodSeconds;
        this.successThreshold = source.successThreshold;
        this.tcpSocket = source.tcpSocket;
        this.terminationGracePeriodSeconds = source.terminationGracePeriodSeconds;
        this.timeoutSeconds = source.timeoutSeconds;
    }

    /**
     * 
     * @param terminationGracePeriodSeconds
     * @param failureThreshold
     * @param periodSeconds
     * @param tcpSocket
     * @param timeoutSeconds
     * @param successThreshold
     * @param initialDelaySeconds
     * @param exec
     * @param grpc
     * @param httpGet
     */
    public Probe(ExecAction exec, Integer failureThreshold, GRPCAction grpc, HTTPGetAction httpGet, Integer initialDelaySeconds, Integer periodSeconds, Integer successThreshold, TCPSocketAction tcpSocket, Integer terminationGracePeriodSeconds, Integer timeoutSeconds) {
        super();
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.grpc = grpc;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
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
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    @JsonProperty("grpc")
    public GRPCAction getGrpc() {
        return grpc;
    }

    @JsonProperty("grpc")
    public void setGrpc(GRPCAction grpc) {
        this.grpc = grpc;
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
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
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

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Probe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exec");
        sb.append('=');
        sb.append(((this.exec == null)?"<null>":this.exec));
        sb.append(',');
        sb.append("failureThreshold");
        sb.append('=');
        sb.append(((this.failureThreshold == null)?"<null>":this.failureThreshold));
        sb.append(',');
        sb.append("grpc");
        sb.append('=');
        sb.append(((this.grpc == null)?"<null>":this.grpc));
        sb.append(',');
        sb.append("httpGet");
        sb.append('=');
        sb.append(((this.httpGet == null)?"<null>":this.httpGet));
        sb.append(',');
        sb.append("initialDelaySeconds");
        sb.append('=');
        sb.append(((this.initialDelaySeconds == null)?"<null>":this.initialDelaySeconds));
        sb.append(',');
        sb.append("periodSeconds");
        sb.append('=');
        sb.append(((this.periodSeconds == null)?"<null>":this.periodSeconds));
        sb.append(',');
        sb.append("successThreshold");
        sb.append('=');
        sb.append(((this.successThreshold == null)?"<null>":this.successThreshold));
        sb.append(',');
        sb.append("tcpSocket");
        sb.append('=');
        sb.append(((this.tcpSocket == null)?"<null>":this.tcpSocket));
        sb.append(',');
        sb.append("terminationGracePeriodSeconds");
        sb.append('=');
        sb.append(((this.terminationGracePeriodSeconds == null)?"<null>":this.terminationGracePeriodSeconds));
        sb.append(',');
        sb.append("timeoutSeconds");
        sb.append('=');
        sb.append(((this.timeoutSeconds == null)?"<null>":this.timeoutSeconds));
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
        result = ((result* 31)+((this.terminationGracePeriodSeconds == null)? 0 :this.terminationGracePeriodSeconds.hashCode()));
        result = ((result* 31)+((this.failureThreshold == null)? 0 :this.failureThreshold.hashCode()));
        result = ((result* 31)+((this.periodSeconds == null)? 0 :this.periodSeconds.hashCode()));
        result = ((result* 31)+((this.tcpSocket == null)? 0 :this.tcpSocket.hashCode()));
        result = ((result* 31)+((this.timeoutSeconds == null)? 0 :this.timeoutSeconds.hashCode()));
        result = ((result* 31)+((this.successThreshold == null)? 0 :this.successThreshold.hashCode()));
        result = ((result* 31)+((this.initialDelaySeconds == null)? 0 :this.initialDelaySeconds.hashCode()));
        result = ((result* 31)+((this.exec == null)? 0 :this.exec.hashCode()));
        result = ((result* 31)+((this.grpc == null)? 0 :this.grpc.hashCode()));
        result = ((result* 31)+((this.httpGet == null)? 0 :this.httpGet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Probe) == false) {
            return false;
        }
        Probe rhs = ((Probe) other);
        return (((((((((((this.terminationGracePeriodSeconds == rhs.terminationGracePeriodSeconds)||((this.terminationGracePeriodSeconds!= null)&&this.terminationGracePeriodSeconds.equals(rhs.terminationGracePeriodSeconds)))&&((this.failureThreshold == rhs.failureThreshold)||((this.failureThreshold!= null)&&this.failureThreshold.equals(rhs.failureThreshold))))&&((this.periodSeconds == rhs.periodSeconds)||((this.periodSeconds!= null)&&this.periodSeconds.equals(rhs.periodSeconds))))&&((this.tcpSocket == rhs.tcpSocket)||((this.tcpSocket!= null)&&this.tcpSocket.equals(rhs.tcpSocket))))&&((this.timeoutSeconds == rhs.timeoutSeconds)||((this.timeoutSeconds!= null)&&this.timeoutSeconds.equals(rhs.timeoutSeconds))))&&((this.successThreshold == rhs.successThreshold)||((this.successThreshold!= null)&&this.successThreshold.equals(rhs.successThreshold))))&&((this.initialDelaySeconds == rhs.initialDelaySeconds)||((this.initialDelaySeconds!= null)&&this.initialDelaySeconds.equals(rhs.initialDelaySeconds))))&&((this.exec == rhs.exec)||((this.exec!= null)&&this.exec.equals(rhs.exec))))&&((this.grpc == rhs.grpc)||((this.grpc!= null)&&this.grpc.equals(rhs.grpc))))&&((this.httpGet == rhs.httpGet)||((this.httpGet!= null)&&this.httpGet.equals(rhs.httpGet))));
    }

}
