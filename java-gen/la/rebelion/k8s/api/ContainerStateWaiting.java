
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerStateWaiting is a waiting state of a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "reason"
})
@Generated("jsonschema2pojo")
public class ContainerStateWaiting {

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message regarding why the container is not yet running.")
    private String message;
    /**
     * (brief) reason the container is not yet running.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("(brief) reason the container is not yet running.")
    private String reason;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerStateWaiting() {
    }

    /**
     * 
     * @param source
     */
    public ContainerStateWaiting(ContainerStateWaiting source) {
        super();
        this.message = source.message;
        this.reason = source.reason;
    }

    /**
     * 
     * @param reason
     * @param message
     */
    public ContainerStateWaiting(String message, String reason) {
        super();
        this.message = message;
        this.reason = reason;
    }

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * (brief) reason the container is not yet running.
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * (brief) reason the container is not yet running.
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerStateWaiting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerStateWaiting) == false) {
            return false;
        }
        ContainerStateWaiting rhs = ((ContainerStateWaiting) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))));
    }

}
