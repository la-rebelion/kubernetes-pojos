
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodReadinessGate contains the reference to a pod condition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conditionType"
})
@Generated("jsonschema2pojo")
public class PodReadinessGate {

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     * (Required)
     * 
     */
    @JsonProperty("conditionType")
    @JsonPropertyDescription("ConditionType refers to a condition in the pod's condition list with matching type.")
    private String conditionType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodReadinessGate() {
    }

    /**
     * 
     * @param source
     */
    public PodReadinessGate(PodReadinessGate source) {
        super();
        this.conditionType = source.conditionType;
    }

    /**
     * 
     * @param conditionType
     */
    public PodReadinessGate(String conditionType) {
        super();
        this.conditionType = conditionType;
    }

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     * (Required)
     * 
     */
    @JsonProperty("conditionType")
    public String getConditionType() {
        return conditionType;
    }

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     * (Required)
     * 
     */
    @JsonProperty("conditionType")
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodReadinessGate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conditionType");
        sb.append('=');
        sb.append(((this.conditionType == null)?"<null>":this.conditionType));
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
        result = ((result* 31)+((this.conditionType == null)? 0 :this.conditionType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodReadinessGate) == false) {
            return false;
        }
        PodReadinessGate rhs = ((PodReadinessGate) other);
        return ((this.conditionType == rhs.conditionType)||((this.conditionType!= null)&&this.conditionType.equals(rhs.conditionType)));
    }

}
