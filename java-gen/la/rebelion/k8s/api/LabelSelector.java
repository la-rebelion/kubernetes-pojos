
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matchExpressions",
    "matchLabels"
})
@Generated("jsonschema2pojo")
public class LabelSelector {

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonPropertyDescription("matchExpressions is a list of label selector requirements. The requirements are ANDed.")
    private List<LabelSelectorRequirement> matchExpressions = new ArrayList<LabelSelectorRequirement>();
    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    @JsonPropertyDescription("matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
    private MatchLabels matchLabels;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LabelSelector() {
    }

    /**
     * 
     * @param source
     */
    public LabelSelector(LabelSelector source) {
        super();
        this.matchExpressions = source.matchExpressions;
        this.matchLabels = source.matchLabels;
    }

    /**
     * 
     * @param matchExpressions
     * @param matchLabels
     */
    public LabelSelector(List<LabelSelectorRequirement> matchExpressions, MatchLabels matchLabels) {
        super();
        this.matchExpressions = matchExpressions;
        this.matchLabels = matchLabels;
    }

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    public List<LabelSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    public MatchLabels getMatchLabels() {
        return matchLabels;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    public void setMatchLabels(MatchLabels matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LabelSelector.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchExpressions");
        sb.append('=');
        sb.append(((this.matchExpressions == null)?"<null>":this.matchExpressions));
        sb.append(',');
        sb.append("matchLabels");
        sb.append('=');
        sb.append(((this.matchLabels == null)?"<null>":this.matchLabels));
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
        result = ((result* 31)+((this.matchLabels == null)? 0 :this.matchLabels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LabelSelector) == false) {
            return false;
        }
        LabelSelector rhs = ((LabelSelector) other);
        return (((this.matchExpressions == rhs.matchExpressions)||((this.matchExpressions!= null)&&this.matchExpressions.equals(rhs.matchExpressions)))&&((this.matchLabels == rhs.matchLabels)||((this.matchLabels!= null)&&this.matchLabels.equals(rhs.matchLabels))));
    }

}
