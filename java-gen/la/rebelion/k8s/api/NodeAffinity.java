
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Node affinity is a group of node affinity scheduling rules.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferredDuringSchedulingIgnoredDuringExecution",
    "requiredDuringSchedulingIgnoredDuringExecution"
})
@Generated("jsonschema2pojo")
public class NodeAffinity {

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.")
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTerm>();
    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.")
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeAffinity() {
    }

    /**
     * 
     * @param source
     */
    public NodeAffinity(NodeAffinity source) {
        super();
        this.preferredDuringSchedulingIgnoredDuringExecution = source.preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = source.requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param preferredDuringSchedulingIgnoredDuringExecution
     */
    public NodeAffinity(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution, NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        super();
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NodeAffinity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferredDuringSchedulingIgnoredDuringExecution");
        sb.append('=');
        sb.append(((this.preferredDuringSchedulingIgnoredDuringExecution == null)?"<null>":this.preferredDuringSchedulingIgnoredDuringExecution));
        sb.append(',');
        sb.append("requiredDuringSchedulingIgnoredDuringExecution");
        sb.append('=');
        sb.append(((this.requiredDuringSchedulingIgnoredDuringExecution == null)?"<null>":this.requiredDuringSchedulingIgnoredDuringExecution));
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
        result = ((result* 31)+((this.requiredDuringSchedulingIgnoredDuringExecution == null)? 0 :this.requiredDuringSchedulingIgnoredDuringExecution.hashCode()));
        result = ((result* 31)+((this.preferredDuringSchedulingIgnoredDuringExecution == null)? 0 :this.preferredDuringSchedulingIgnoredDuringExecution.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeAffinity) == false) {
            return false;
        }
        NodeAffinity rhs = ((NodeAffinity) other);
        return (((this.requiredDuringSchedulingIgnoredDuringExecution == rhs.requiredDuringSchedulingIgnoredDuringExecution)||((this.requiredDuringSchedulingIgnoredDuringExecution!= null)&&this.requiredDuringSchedulingIgnoredDuringExecution.equals(rhs.requiredDuringSchedulingIgnoredDuringExecution)))&&((this.preferredDuringSchedulingIgnoredDuringExecution == rhs.preferredDuringSchedulingIgnoredDuringExecution)||((this.preferredDuringSchedulingIgnoredDuringExecution!= null)&&this.preferredDuringSchedulingIgnoredDuringExecution.equals(rhs.preferredDuringSchedulingIgnoredDuringExecution))));
    }

}
