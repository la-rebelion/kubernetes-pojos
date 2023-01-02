
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preference",
    "weight"
})
@Generated("jsonschema2pojo")
public class PreferredSchedulingTerm {

    /**
     * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
     * (Required)
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.")
    private NodeSelectorTerm preference;
    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
    private Integer weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PreferredSchedulingTerm() {
    }

    /**
     * 
     * @param source
     */
    public PreferredSchedulingTerm(PreferredSchedulingTerm source) {
        super();
        this.preference = source.preference;
        this.weight = source.weight;
    }

    /**
     * 
     * @param preference
     * @param weight
     */
    public PreferredSchedulingTerm(NodeSelectorTerm preference, Integer weight) {
        super();
        this.preference = preference;
        this.weight = weight;
    }

    /**
     * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
     * (Required)
     * 
     */
    @JsonProperty("preference")
    public NodeSelectorTerm getPreference() {
        return preference;
    }

    /**
     * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
     * (Required)
     * 
     */
    @JsonProperty("preference")
    public void setPreference(NodeSelectorTerm preference) {
        this.preference = preference;
    }

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PreferredSchedulingTerm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
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
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreferredSchedulingTerm) == false) {
            return false;
        }
        PreferredSchedulingTerm rhs = ((PreferredSchedulingTerm) other);
        return (((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
