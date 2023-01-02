
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerName",
    "operator",
    "values"
})
@Generated("jsonschema2pojo")
public class PodFailurePolicyOnExitCodesRequirement {

    /**
     * Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
     * 
     */
    @JsonProperty("containerName")
    @JsonPropertyDescription("Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.")
    private String containerName;
    /**
     * Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is in the set of specified values.
     * - NotIn: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is not in the set of specified values.
     * Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code\n  (might be multiple if there are multiple containers not restricted\n  by the 'containerName' field) is in the set of specified values.\n- NotIn: the requirement is satisfied if at least one container exit code\n  (might be multiple if there are multiple containers not restricted\n  by the 'containerName' field) is not in the set of specified values.\nAdditional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.\n\n")
    private String operator;
    /**
     * Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("values")
    @JsonPropertyDescription("Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.")
    private List<Integer> values = new ArrayList<Integer>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodFailurePolicyOnExitCodesRequirement() {
    }

    /**
     * 
     * @param source
     */
    public PodFailurePolicyOnExitCodesRequirement(PodFailurePolicyOnExitCodesRequirement source) {
        super();
        this.containerName = source.containerName;
        this.operator = source.operator;
        this.values = source.values;
    }

    /**
     * 
     * @param containerName
     * @param values
     * @param operator
     */
    public PodFailurePolicyOnExitCodesRequirement(String containerName, String operator, List<Integer> values) {
        super();
        this.containerName = containerName;
        this.operator = operator;
        this.values = values;
    }

    /**
     * Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
     * 
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
     * 
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is in the set of specified values.
     * - NotIn: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is not in the set of specified values.
     * Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is in the set of specified values.
     * - NotIn: the requirement is satisfied if at least one container exit code
     *   (might be multiple if there are multiple containers not restricted
     *   by the 'containerName' field) is not in the set of specified values.
     * Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("values")
    public List<Integer> getValues() {
        return values;
    }

    /**
     * Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("values")
    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodFailurePolicyOnExitCodesRequirement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerName");
        sb.append('=');
        sb.append(((this.containerName == null)?"<null>":this.containerName));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
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
        result = ((result* 31)+((this.containerName == null)? 0 :this.containerName.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.values == null)? 0 :this.values.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodFailurePolicyOnExitCodesRequirement) == false) {
            return false;
        }
        PodFailurePolicyOnExitCodesRequirement rhs = ((PodFailurePolicyOnExitCodesRequirement) other);
        return ((((this.containerName == rhs.containerName)||((this.containerName!= null)&&this.containerName.equals(rhs.containerName)))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.values == rhs.values)||((this.values!= null)&&this.values.equals(rhs.values))));
    }

}
