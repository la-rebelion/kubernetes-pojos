
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active",
    "completedIndexes",
    "completionTime",
    "conditions",
    "failed",
    "ready",
    "startTime",
    "succeeded",
    "uncountedTerminatedPods"
})
@Generated("jsonschema2pojo")
public class JobStatus {

    /**
     * The number of pending and running pods.
     * 
     */
    @JsonProperty("active")
    @JsonPropertyDescription("The number of pending and running pods.")
    private Integer active;
    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    @JsonProperty("completedIndexes")
    @JsonPropertyDescription("CompletedIndexes holds the completed indexes when .spec.completionMode = \"Indexed\" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \"1,3-5,7\".")
    private String completedIndexes;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("completionTime")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date completionTime;
    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("The latest available observations of an object's current state. When a Job fails, one of the conditions will have type \"Failed\" and status true. When a Job is suspended, one of the conditions will have type \"Suspended\" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type \"Complete\" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
    private List<JobCondition> conditions = new ArrayList<JobCondition>();
    /**
     * The number of pods which reached phase Failed.
     * 
     */
    @JsonProperty("failed")
    @JsonPropertyDescription("The number of pods which reached phase Failed.")
    private Integer failed;
    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    @JsonProperty("ready")
    @JsonPropertyDescription("The number of pods which have a Ready condition.\n\nThis field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).")
    private Integer ready;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date startTime;
    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    @JsonProperty("succeeded")
    @JsonPropertyDescription("The number of pods which reached phase Succeeded.")
    private Integer succeeded;
    /**
     * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
     * 
     */
    @JsonProperty("uncountedTerminatedPods")
    @JsonPropertyDescription("UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.")
    private UncountedTerminatedPods uncountedTerminatedPods;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobStatus() {
    }

    /**
     * 
     * @param source
     */
    public JobStatus(JobStatus source) {
        super();
        this.active = source.active;
        this.completedIndexes = source.completedIndexes;
        this.completionTime = source.completionTime;
        this.conditions = source.conditions;
        this.failed = source.failed;
        this.ready = source.ready;
        this.startTime = source.startTime;
        this.succeeded = source.succeeded;
        this.uncountedTerminatedPods = source.uncountedTerminatedPods;
    }

    /**
     * 
     * @param completionTime
     * @param completedIndexes
     * @param ready
     * @param active
     * @param startTime
     * @param uncountedTerminatedPods
     * @param failed
     * @param conditions
     * @param succeeded
     */
    public JobStatus(Integer active, String completedIndexes, Date completionTime, List<JobCondition> conditions, Integer failed, Integer ready, Date startTime, Integer succeeded, UncountedTerminatedPods uncountedTerminatedPods) {
        super();
        this.active = active;
        this.completedIndexes = completedIndexes;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.ready = ready;
        this.startTime = startTime;
        this.succeeded = succeeded;
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    /**
     * The number of pending and running pods.
     * 
     */
    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    /**
     * The number of pending and running pods.
     * 
     */
    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    @JsonProperty("completedIndexes")
    public String getCompletedIndexes() {
        return completedIndexes;
    }

    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    @JsonProperty("completedIndexes")
    public void setCompletedIndexes(String completedIndexes) {
        this.completedIndexes = completedIndexes;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("completionTime")
    public Date getCompletionTime() {
        return completionTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("completionTime")
    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("conditions")
    public List<JobCondition> getConditions() {
        return conditions;
    }

    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<JobCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * The number of pods which reached phase Failed.
     * 
     */
    @JsonProperty("failed")
    public Integer getFailed() {
        return failed;
    }

    /**
     * The number of pods which reached phase Failed.
     * 
     */
    @JsonProperty("failed")
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    @JsonProperty("ready")
    public Integer getReady() {
        return ready;
    }

    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    @JsonProperty("ready")
    public void setReady(Integer ready) {
        this.ready = ready;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    @JsonProperty("succeeded")
    public Integer getSucceeded() {
        return succeeded;
    }

    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    @JsonProperty("succeeded")
    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
     * 
     */
    @JsonProperty("uncountedTerminatedPods")
    public UncountedTerminatedPods getUncountedTerminatedPods() {
        return uncountedTerminatedPods;
    }

    /**
     * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
     * 
     */
    @JsonProperty("uncountedTerminatedPods")
    public void setUncountedTerminatedPods(UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("completedIndexes");
        sb.append('=');
        sb.append(((this.completedIndexes == null)?"<null>":this.completedIndexes));
        sb.append(',');
        sb.append("completionTime");
        sb.append('=');
        sb.append(((this.completionTime == null)?"<null>":this.completionTime));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("failed");
        sb.append('=');
        sb.append(((this.failed == null)?"<null>":this.failed));
        sb.append(',');
        sb.append("ready");
        sb.append('=');
        sb.append(((this.ready == null)?"<null>":this.ready));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("succeeded");
        sb.append('=');
        sb.append(((this.succeeded == null)?"<null>":this.succeeded));
        sb.append(',');
        sb.append("uncountedTerminatedPods");
        sb.append('=');
        sb.append(((this.uncountedTerminatedPods == null)?"<null>":this.uncountedTerminatedPods));
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
        result = ((result* 31)+((this.completionTime == null)? 0 :this.completionTime.hashCode()));
        result = ((result* 31)+((this.completedIndexes == null)? 0 :this.completedIndexes.hashCode()));
        result = ((result* 31)+((this.ready == null)? 0 :this.ready.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.uncountedTerminatedPods == null)? 0 :this.uncountedTerminatedPods.hashCode()));
        result = ((result* 31)+((this.failed == null)? 0 :this.failed.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.succeeded == null)? 0 :this.succeeded.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobStatus) == false) {
            return false;
        }
        JobStatus rhs = ((JobStatus) other);
        return ((((((((((this.completionTime == rhs.completionTime)||((this.completionTime!= null)&&this.completionTime.equals(rhs.completionTime)))&&((this.completedIndexes == rhs.completedIndexes)||((this.completedIndexes!= null)&&this.completedIndexes.equals(rhs.completedIndexes))))&&((this.ready == rhs.ready)||((this.ready!= null)&&this.ready.equals(rhs.ready))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.uncountedTerminatedPods == rhs.uncountedTerminatedPods)||((this.uncountedTerminatedPods!= null)&&this.uncountedTerminatedPods.equals(rhs.uncountedTerminatedPods))))&&((this.failed == rhs.failed)||((this.failed!= null)&&this.failed.equals(rhs.failed))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.succeeded == rhs.succeeded)||((this.succeeded!= null)&&this.succeeded.equals(rhs.succeeded))));
    }

}
