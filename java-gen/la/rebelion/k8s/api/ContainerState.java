
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "running",
    "terminated",
    "waiting"
})
@Generated("jsonschema2pojo")
public class ContainerState {

    /**
     * ContainerStateRunning is a running state of a container.
     * 
     */
    @JsonProperty("running")
    @JsonPropertyDescription("ContainerStateRunning is a running state of a container.")
    private ContainerStateRunning running;
    /**
     * ContainerStateTerminated is a terminated state of a container.
     * 
     */
    @JsonProperty("terminated")
    @JsonPropertyDescription("ContainerStateTerminated is a terminated state of a container.")
    private ContainerStateTerminated terminated;
    /**
     * ContainerStateWaiting is a waiting state of a container.
     * 
     */
    @JsonProperty("waiting")
    @JsonPropertyDescription("ContainerStateWaiting is a waiting state of a container.")
    private ContainerStateWaiting waiting;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerState() {
    }

    /**
     * 
     * @param source
     */
    public ContainerState(ContainerState source) {
        super();
        this.running = source.running;
        this.terminated = source.terminated;
        this.waiting = source.waiting;
    }

    /**
     * 
     * @param running
     * @param waiting
     * @param terminated
     */
    public ContainerState(ContainerStateRunning running, ContainerStateTerminated terminated, ContainerStateWaiting waiting) {
        super();
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    /**
     * ContainerStateRunning is a running state of a container.
     * 
     */
    @JsonProperty("running")
    public ContainerStateRunning getRunning() {
        return running;
    }

    /**
     * ContainerStateRunning is a running state of a container.
     * 
     */
    @JsonProperty("running")
    public void setRunning(ContainerStateRunning running) {
        this.running = running;
    }

    /**
     * ContainerStateTerminated is a terminated state of a container.
     * 
     */
    @JsonProperty("terminated")
    public ContainerStateTerminated getTerminated() {
        return terminated;
    }

    /**
     * ContainerStateTerminated is a terminated state of a container.
     * 
     */
    @JsonProperty("terminated")
    public void setTerminated(ContainerStateTerminated terminated) {
        this.terminated = terminated;
    }

    /**
     * ContainerStateWaiting is a waiting state of a container.
     * 
     */
    @JsonProperty("waiting")
    public ContainerStateWaiting getWaiting() {
        return waiting;
    }

    /**
     * ContainerStateWaiting is a waiting state of a container.
     * 
     */
    @JsonProperty("waiting")
    public void setWaiting(ContainerStateWaiting waiting) {
        this.waiting = waiting;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerState.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("running");
        sb.append('=');
        sb.append(((this.running == null)?"<null>":this.running));
        sb.append(',');
        sb.append("terminated");
        sb.append('=');
        sb.append(((this.terminated == null)?"<null>":this.terminated));
        sb.append(',');
        sb.append("waiting");
        sb.append('=');
        sb.append(((this.waiting == null)?"<null>":this.waiting));
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
        result = ((result* 31)+((this.running == null)? 0 :this.running.hashCode()));
        result = ((result* 31)+((this.waiting == null)? 0 :this.waiting.hashCode()));
        result = ((result* 31)+((this.terminated == null)? 0 :this.terminated.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerState) == false) {
            return false;
        }
        ContainerState rhs = ((ContainerState) other);
        return ((((this.running == rhs.running)||((this.running!= null)&&this.running.equals(rhs.running)))&&((this.waiting == rhs.waiting)||((this.waiting!= null)&&this.waiting.equals(rhs.waiting))))&&((this.terminated == rhs.terminated)||((this.terminated!= null)&&this.terminated.equals(rhs.terminated))));
    }

}
