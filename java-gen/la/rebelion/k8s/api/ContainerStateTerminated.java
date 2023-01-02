
package la.rebelion.k8s.api;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerStateTerminated is a terminated state of a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerID",
    "exitCode",
    "finishedAt",
    "message",
    "reason",
    "signal",
    "startedAt"
})
@Generated("jsonschema2pojo")
public class ContainerStateTerminated {

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    @JsonPropertyDescription("Container's ID in the format '<type>://<container_id>'")
    private String containerID;
    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    @JsonPropertyDescription("Exit status from the last termination of the container")
    private Integer exitCode;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("finishedAt")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date finishedAt;
    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message regarding the last termination of the container")
    private String message;
    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("(brief) reason from the last termination of the container")
    private String reason;
    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    @JsonPropertyDescription("Signal from the last termination of the container")
    private Integer signal;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startedAt")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date startedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerStateTerminated() {
    }

    /**
     * 
     * @param source
     */
    public ContainerStateTerminated(ContainerStateTerminated source) {
        super();
        this.containerID = source.containerID;
        this.exitCode = source.exitCode;
        this.finishedAt = source.finishedAt;
        this.message = source.message;
        this.reason = source.reason;
        this.signal = source.signal;
        this.startedAt = source.startedAt;
    }

    /**
     * 
     * @param reason
     * @param exitCode
     * @param startedAt
     * @param containerID
     * @param message
     * @param signal
     * @param finishedAt
     */
    public ContainerStateTerminated(String containerID, Integer exitCode, Date finishedAt, String message, String reason, Integer signal, Date startedAt) {
        super();
        this.containerID = containerID;
        this.exitCode = exitCode;
        this.finishedAt = finishedAt;
        this.message = message;
        this.reason = reason;
        this.signal = signal;
        this.startedAt = startedAt;
    }

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    public String getContainerID() {
        return containerID;
    }

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("finishedAt")
    public Date getFinishedAt() {
        return finishedAt;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("finishedAt")
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    public Integer getSignal() {
        return signal;
    }

    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startedAt")
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startedAt")
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerStateTerminated.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerID");
        sb.append('=');
        sb.append(((this.containerID == null)?"<null>":this.containerID));
        sb.append(',');
        sb.append("exitCode");
        sb.append('=');
        sb.append(((this.exitCode == null)?"<null>":this.exitCode));
        sb.append(',');
        sb.append("finishedAt");
        sb.append('=');
        sb.append(((this.finishedAt == null)?"<null>":this.finishedAt));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("signal");
        sb.append('=');
        sb.append(((this.signal == null)?"<null>":this.signal));
        sb.append(',');
        sb.append("startedAt");
        sb.append('=');
        sb.append(((this.startedAt == null)?"<null>":this.startedAt));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.exitCode == null)? 0 :this.exitCode.hashCode()));
        result = ((result* 31)+((this.startedAt == null)? 0 :this.startedAt.hashCode()));
        result = ((result* 31)+((this.containerID == null)? 0 :this.containerID.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.signal == null)? 0 :this.signal.hashCode()));
        result = ((result* 31)+((this.finishedAt == null)? 0 :this.finishedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerStateTerminated) == false) {
            return false;
        }
        ContainerStateTerminated rhs = ((ContainerStateTerminated) other);
        return ((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.exitCode == rhs.exitCode)||((this.exitCode!= null)&&this.exitCode.equals(rhs.exitCode))))&&((this.startedAt == rhs.startedAt)||((this.startedAt!= null)&&this.startedAt.equals(rhs.startedAt))))&&((this.containerID == rhs.containerID)||((this.containerID!= null)&&this.containerID.equals(rhs.containerID))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.signal == rhs.signal)||((this.signal!= null)&&this.signal.equals(rhs.signal))))&&((this.finishedAt == rhs.finishedAt)||((this.finishedAt!= null)&&this.finishedAt.equals(rhs.finishedAt))));
    }

}
