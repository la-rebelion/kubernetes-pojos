
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of OnExitCodes and onPodConditions, but not both, can be used in each rule.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action",
    "onExitCodes",
    "onPodConditions"
})
@Generated("jsonschema2pojo")
public class PodFailurePolicyRule {

    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     *   running pods are terminated.
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all\n  running pods are terminated.\n- Ignore: indicates that the counter towards the .backoffLimit is not\n  incremented and a replacement pod is created.\n- Count: indicates that the pod is handled in the default way - the\n  counter towards the .backoffLimit is incremented.\nAdditional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.\n\n")
    private String action;
    /**
     * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
     * 
     */
    @JsonProperty("onExitCodes")
    @JsonPropertyDescription("PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.")
    private PodFailurePolicyOnExitCodesRequirement onExitCodes;
    /**
     * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("onPodConditions")
    @JsonPropertyDescription("Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.")
    private List<PodFailurePolicyOnPodConditionsPattern> onPodConditions = new ArrayList<PodFailurePolicyOnPodConditionsPattern>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodFailurePolicyRule() {
    }

    /**
     * 
     * @param source
     */
    public PodFailurePolicyRule(PodFailurePolicyRule source) {
        super();
        this.action = source.action;
        this.onExitCodes = source.onExitCodes;
        this.onPodConditions = source.onPodConditions;
    }

    /**
     * 
     * @param onExitCodes
     * @param action
     * @param onPodConditions
     */
    public PodFailurePolicyRule(String action, PodFailurePolicyOnExitCodesRequirement onExitCodes, List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        super();
        this.action = action;
        this.onExitCodes = onExitCodes;
        this.onPodConditions = onPodConditions;
    }

    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     *   running pods are terminated.
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     *   running pods are terminated.
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
     * 
     */
    @JsonProperty("onExitCodes")
    public PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
        return onExitCodes;
    }

    /**
     * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
     * 
     */
    @JsonProperty("onExitCodes")
    public void setOnExitCodes(PodFailurePolicyOnExitCodesRequirement onExitCodes) {
        this.onExitCodes = onExitCodes;
    }

    /**
     * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("onPodConditions")
    public List<PodFailurePolicyOnPodConditionsPattern> getOnPodConditions() {
        return onPodConditions;
    }

    /**
     * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("onPodConditions")
    public void setOnPodConditions(List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        this.onPodConditions = onPodConditions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodFailurePolicyRule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("onExitCodes");
        sb.append('=');
        sb.append(((this.onExitCodes == null)?"<null>":this.onExitCodes));
        sb.append(',');
        sb.append("onPodConditions");
        sb.append('=');
        sb.append(((this.onPodConditions == null)?"<null>":this.onPodConditions));
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
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.onExitCodes == null)? 0 :this.onExitCodes.hashCode()));
        result = ((result* 31)+((this.onPodConditions == null)? 0 :this.onPodConditions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodFailurePolicyRule) == false) {
            return false;
        }
        PodFailurePolicyRule rhs = ((PodFailurePolicyRule) other);
        return ((((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action)))&&((this.onExitCodes == rhs.onExitCodes)||((this.onExitCodes!= null)&&this.onExitCodes.equals(rhs.onExitCodes))))&&((this.onPodConditions == rhs.onPodConditions)||((this.onPodConditions!= null)&&this.onPodConditions.equals(rhs.onPodConditions))));
    }

}
