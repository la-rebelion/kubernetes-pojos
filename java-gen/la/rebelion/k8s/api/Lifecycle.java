
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "postStart",
    "preStop"
})
@Generated("jsonschema2pojo")
public class Lifecycle {

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("postStart")
    @JsonPropertyDescription("LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.")
    private LifecycleHandler postStart;
    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("preStop")
    @JsonPropertyDescription("LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.")
    private LifecycleHandler preStop;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lifecycle() {
    }

    /**
     * 
     * @param source
     */
    public Lifecycle(Lifecycle source) {
        super();
        this.postStart = source.postStart;
        this.preStop = source.preStop;
    }

    /**
     * 
     * @param postStart
     * @param preStop
     */
    public Lifecycle(LifecycleHandler postStart, LifecycleHandler preStop) {
        super();
        this.postStart = postStart;
        this.preStop = preStop;
    }

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("postStart")
    public LifecycleHandler getPostStart() {
        return postStart;
    }

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("postStart")
    public void setPostStart(LifecycleHandler postStart) {
        this.postStart = postStart;
    }

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("preStop")
    public LifecycleHandler getPreStop() {
        return preStop;
    }

    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    @JsonProperty("preStop")
    public void setPreStop(LifecycleHandler preStop) {
        this.preStop = preStop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lifecycle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("postStart");
        sb.append('=');
        sb.append(((this.postStart == null)?"<null>":this.postStart));
        sb.append(',');
        sb.append("preStop");
        sb.append('=');
        sb.append(((this.preStop == null)?"<null>":this.preStop));
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
        result = ((result* 31)+((this.preStop == null)? 0 :this.preStop.hashCode()));
        result = ((result* 31)+((this.postStart == null)? 0 :this.postStart.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lifecycle) == false) {
            return false;
        }
        Lifecycle rhs = ((Lifecycle) other);
        return (((this.preStop == rhs.preStop)||((this.preStop!= null)&&this.preStop.equals(rhs.preStop)))&&((this.postStart == rhs.postStart)||((this.postStart!= null)&&this.postStart.equals(rhs.postStart))));
    }

}
