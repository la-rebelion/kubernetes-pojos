
package la.rebelion.k8s.api;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodCondition contains details for the current condition of this pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastProbeTime",
    "lastTransitionTime",
    "message",
    "reason",
    "status",
    "type"
})
@Generated("jsonschema2pojo")
public class PodCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastProbeTime")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date lastProbeTime;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastTransitionTime")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date lastTransitionTime;
    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Human-readable message indicating details about last transition.")
    private String message;
    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Unique, one-word, CamelCase reason for the condition's last transition.")
    private String reason;
    /**
     * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
    private String status;
    /**
     * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodCondition() {
    }

    /**
     * 
     * @param source
     */
    public PodCondition(PodCondition source) {
        super();
        this.lastProbeTime = source.lastProbeTime;
        this.lastTransitionTime = source.lastTransitionTime;
        this.message = source.message;
        this.reason = source.reason;
        this.status = source.status;
        this.type = source.type;
    }

    /**
     * 
     * @param reason
     * @param lastTransitionTime
     * @param message
     * @param type
     * @param lastProbeTime
     * @param status
     */
    public PodCondition(Date lastProbeTime, Date lastTransitionTime, String message, String reason, String status, String type) {
        super();
        this.lastProbeTime = lastProbeTime;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastProbeTime")
    public Date getLastProbeTime() {
        return lastProbeTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastProbeTime")
    public void setLastProbeTime(Date lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastTransitionTime")
    public Date getLastTransitionTime() {
        return lastTransitionTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("lastTransitionTime")
    public void setLastTransitionTime(Date lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodCondition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastProbeTime");
        sb.append('=');
        sb.append(((this.lastProbeTime == null)?"<null>":this.lastProbeTime));
        sb.append(',');
        sb.append("lastTransitionTime");
        sb.append('=');
        sb.append(((this.lastTransitionTime == null)?"<null>":this.lastTransitionTime));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.lastTransitionTime == null)? 0 :this.lastTransitionTime.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.lastProbeTime == null)? 0 :this.lastProbeTime.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodCondition) == false) {
            return false;
        }
        PodCondition rhs = ((PodCondition) other);
        return (((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.lastTransitionTime == rhs.lastTransitionTime)||((this.lastTransitionTime!= null)&&this.lastTransitionTime.equals(rhs.lastTransitionTime))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.lastProbeTime == rhs.lastProbeTime)||((this.lastProbeTime!= null)&&this.lastProbeTime.equals(rhs.lastProbeTime))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
