
package la.rebelion.k8s.api;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerStateRunning is a running state of a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startedAt"
})
@Generated("jsonschema2pojo")
public class ContainerStateRunning {

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
    public ContainerStateRunning() {
    }

    /**
     * 
     * @param source
     */
    public ContainerStateRunning(ContainerStateRunning source) {
        super();
        this.startedAt = source.startedAt;
    }

    /**
     * 
     * @param startedAt
     */
    public ContainerStateRunning(Date startedAt) {
        super();
        this.startedAt = startedAt;
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
        sb.append(ContainerStateRunning.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.startedAt == null)? 0 :this.startedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerStateRunning) == false) {
            return false;
        }
        ContainerStateRunning rhs = ((ContainerStateRunning) other);
        return ((this.startedAt == rhs.startedAt)||((this.startedAt!= null)&&this.startedAt.equals(rhs.startedAt)));
    }

}
