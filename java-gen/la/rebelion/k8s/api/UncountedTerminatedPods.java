
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "failed",
    "succeeded"
})
@Generated("jsonschema2pojo")
public class UncountedTerminatedPods {

    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    @JsonProperty("failed")
    @JsonPropertyDescription("Failed holds UIDs of failed Pods.")
    private List<String> failed = new ArrayList<String>();
    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    @JsonProperty("succeeded")
    @JsonPropertyDescription("Succeeded holds UIDs of succeeded Pods.")
    private List<String> succeeded = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UncountedTerminatedPods() {
    }

    /**
     * 
     * @param source
     */
    public UncountedTerminatedPods(UncountedTerminatedPods source) {
        super();
        this.failed = source.failed;
        this.succeeded = source.succeeded;
    }

    /**
     * 
     * @param failed
     * @param succeeded
     */
    public UncountedTerminatedPods(List<String> failed, List<String> succeeded) {
        super();
        this.failed = failed;
        this.succeeded = succeeded;
    }

    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    @JsonProperty("failed")
    public List<String> getFailed() {
        return failed;
    }

    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    @JsonProperty("failed")
    public void setFailed(List<String> failed) {
        this.failed = failed;
    }

    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    @JsonProperty("succeeded")
    public List<String> getSucceeded() {
        return succeeded;
    }

    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    @JsonProperty("succeeded")
    public void setSucceeded(List<String> succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UncountedTerminatedPods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("failed");
        sb.append('=');
        sb.append(((this.failed == null)?"<null>":this.failed));
        sb.append(',');
        sb.append("succeeded");
        sb.append('=');
        sb.append(((this.succeeded == null)?"<null>":this.succeeded));
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
        result = ((result* 31)+((this.failed == null)? 0 :this.failed.hashCode()));
        result = ((result* 31)+((this.succeeded == null)? 0 :this.succeeded.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UncountedTerminatedPods) == false) {
            return false;
        }
        UncountedTerminatedPods rhs = ((UncountedTerminatedPods) other);
        return (((this.failed == rhs.failed)||((this.failed!= null)&&this.failed.equals(rhs.failed)))&&((this.succeeded == rhs.succeeded)||((this.succeeded!= null)&&this.succeeded.equals(rhs.succeeded))));
    }

}
