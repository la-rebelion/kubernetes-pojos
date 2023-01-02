
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodFailurePolicy describes how failed pods influence the backoffLimit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rules"
})
@Generated("jsonschema2pojo")
public class PodFailurePolicy {

    /**
     * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("rules")
    @JsonPropertyDescription("A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.")
    private List<PodFailurePolicyRule> rules = new ArrayList<PodFailurePolicyRule>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodFailurePolicy() {
    }

    /**
     * 
     * @param source
     */
    public PodFailurePolicy(PodFailurePolicy source) {
        super();
        this.rules = source.rules;
    }

    /**
     * 
     * @param rules
     */
    public PodFailurePolicy(List<PodFailurePolicyRule> rules) {
        super();
        this.rules = rules;
    }

    /**
     * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("rules")
    public List<PodFailurePolicyRule> getRules() {
        return rules;
    }

    /**
     * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     * (Required)
     * 
     */
    @JsonProperty("rules")
    public void setRules(List<PodFailurePolicyRule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodFailurePolicy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rules");
        sb.append('=');
        sb.append(((this.rules == null)?"<null>":this.rules));
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
        result = ((result* 31)+((this.rules == null)? 0 :this.rules.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodFailurePolicy) == false) {
            return false;
        }
        PodFailurePolicy rhs = ((PodFailurePolicy) other);
        return ((this.rules == rhs.rules)||((this.rules!= null)&&this.rules.equals(rhs.rules)));
    }

}
