
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "type"
})
@Generated("jsonschema2pojo")
public class PodFailurePolicyOnPodConditionsPattern {

    /**
     * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.")
    private String status;
    /**
     * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.")
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodFailurePolicyOnPodConditionsPattern() {
    }

    /**
     * 
     * @param source
     */
    public PodFailurePolicyOnPodConditionsPattern(PodFailurePolicyOnPodConditionsPattern source) {
        super();
        this.status = source.status;
        this.type = source.type;
    }

    /**
     * 
     * @param type
     * @param status
     */
    public PodFailurePolicyOnPodConditionsPattern(String status, String type) {
        super();
        this.status = status;
        this.type = type;
    }

    /**
     * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodFailurePolicyOnPodConditionsPattern.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodFailurePolicyOnPodConditionsPattern) == false) {
            return false;
        }
        PodFailurePolicyOnPodConditionsPattern rhs = ((PodFailurePolicyOnPodConditionsPattern) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
