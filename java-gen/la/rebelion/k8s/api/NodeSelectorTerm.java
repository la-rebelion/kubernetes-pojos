
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matchExpressions",
    "matchFields"
})
@Generated("jsonschema2pojo")
public class NodeSelectorTerm {

    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonPropertyDescription("A list of node selector requirements by node's labels.")
    private List<NodeSelectorRequirement> matchExpressions = new ArrayList<NodeSelectorRequirement>();
    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    @JsonProperty("matchFields")
    @JsonPropertyDescription("A list of node selector requirements by node's fields.")
    private List<NodeSelectorRequirement> matchFields = new ArrayList<NodeSelectorRequirement>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeSelectorTerm() {
    }

    /**
     * 
     * @param source
     */
    public NodeSelectorTerm(NodeSelectorTerm source) {
        super();
        this.matchExpressions = source.matchExpressions;
        this.matchFields = source.matchFields;
    }

    /**
     * 
     * @param matchExpressions
     * @param matchFields
     */
    public NodeSelectorTerm(List<NodeSelectorRequirement> matchExpressions, List<NodeSelectorRequirement> matchFields) {
        super();
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    @JsonProperty("matchExpressions")
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    @JsonProperty("matchFields")
    public List<NodeSelectorRequirement> getMatchFields() {
        return matchFields;
    }

    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    @JsonProperty("matchFields")
    public void setMatchFields(List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NodeSelectorTerm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchExpressions");
        sb.append('=');
        sb.append(((this.matchExpressions == null)?"<null>":this.matchExpressions));
        sb.append(',');
        sb.append("matchFields");
        sb.append('=');
        sb.append(((this.matchFields == null)?"<null>":this.matchFields));
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
        result = ((result* 31)+((this.matchExpressions == null)? 0 :this.matchExpressions.hashCode()));
        result = ((result* 31)+((this.matchFields == null)? 0 :this.matchFields.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeSelectorTerm) == false) {
            return false;
        }
        NodeSelectorTerm rhs = ((NodeSelectorTerm) other);
        return (((this.matchExpressions == rhs.matchExpressions)||((this.matchExpressions!= null)&&this.matchExpressions.equals(rhs.matchExpressions)))&&((this.matchFields == rhs.matchFields)||((this.matchFields!= null)&&this.matchFields.equals(rhs.matchFields))));
    }

}
