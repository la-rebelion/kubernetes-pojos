
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NamespaceStatus is information about the current status of a Namespace.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conditions",
    "phase"
})
@Generated("jsonschema2pojo")
public class NamespaceStatus {

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("Represents the latest available observations of a namespace's current state.")
    private List<NamespaceCondition> conditions = new ArrayList<NamespaceCondition>();
    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/\n\n")
    private String phase;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NamespaceStatus() {
    }

    /**
     * 
     * @param source
     */
    public NamespaceStatus(NamespaceStatus source) {
        super();
        this.conditions = source.conditions;
        this.phase = source.phase;
    }

    /**
     * 
     * @param phase
     * @param conditions
     */
    public NamespaceStatus(List<NamespaceCondition> conditions, String phase) {
        super();
        this.conditions = conditions;
        this.phase = phase;
    }

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    @JsonProperty("conditions")
    public List<NamespaceCondition> getConditions() {
        return conditions;
    }

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<NamespaceCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NamespaceStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
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
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NamespaceStatus) == false) {
            return false;
        }
        NamespaceStatus rhs = ((NamespaceStatus) other);
        return (((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions)))&&((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase))));
    }

}
