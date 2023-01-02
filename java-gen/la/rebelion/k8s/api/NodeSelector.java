
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodeSelectorTerms"
})
@Generated("jsonschema2pojo")
public class NodeSelector {

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * (Required)
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    @JsonPropertyDescription("Required. A list of node selector terms. The terms are ORed.")
    private List<NodeSelectorTerm> nodeSelectorTerms = new ArrayList<NodeSelectorTerm>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeSelector() {
    }

    /**
     * 
     * @param source
     */
    public NodeSelector(NodeSelector source) {
        super();
        this.nodeSelectorTerms = source.nodeSelectorTerms;
    }

    /**
     * 
     * @param nodeSelectorTerms
     */
    public NodeSelector(List<NodeSelectorTerm> nodeSelectorTerms) {
        super();
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * (Required)
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * (Required)
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    public void setNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NodeSelector.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nodeSelectorTerms");
        sb.append('=');
        sb.append(((this.nodeSelectorTerms == null)?"<null>":this.nodeSelectorTerms));
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
        result = ((result* 31)+((this.nodeSelectorTerms == null)? 0 :this.nodeSelectorTerms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeSelector) == false) {
            return false;
        }
        NodeSelector rhs = ((NodeSelector) other);
        return ((this.nodeSelectorTerms == rhs.nodeSelectorTerms)||((this.nodeSelectorTerms!= null)&&this.nodeSelectorTerms.equals(rhs.nodeSelectorTerms)));
    }

}
