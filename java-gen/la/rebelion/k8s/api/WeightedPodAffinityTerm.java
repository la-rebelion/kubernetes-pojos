
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "podAffinityTerm",
    "weight"
})
@Generated("jsonschema2pojo")
public class WeightedPodAffinityTerm {

    /**
     * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
     * (Required)
     * 
     */
    @JsonProperty("podAffinityTerm")
    @JsonPropertyDescription("Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")
    private PodAffinityTerm podAffinityTerm;
    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")
    private Integer weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeightedPodAffinityTerm() {
    }

    /**
     * 
     * @param source
     */
    public WeightedPodAffinityTerm(WeightedPodAffinityTerm source) {
        super();
        this.podAffinityTerm = source.podAffinityTerm;
        this.weight = source.weight;
    }

    /**
     * 
     * @param podAffinityTerm
     * @param weight
     */
    public WeightedPodAffinityTerm(PodAffinityTerm podAffinityTerm, Integer weight) {
        super();
        this.podAffinityTerm = podAffinityTerm;
        this.weight = weight;
    }

    /**
     * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
     * (Required)
     * 
     */
    @JsonProperty("podAffinityTerm")
    public PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    /**
     * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
     * (Required)
     * 
     */
    @JsonProperty("podAffinityTerm")
    public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
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
        sb.append(WeightedPodAffinityTerm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("podAffinityTerm");
        sb.append('=');
        sb.append(((this.podAffinityTerm == null)?"<null>":this.podAffinityTerm));
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
        result = ((result* 31)+((this.podAffinityTerm == null)? 0 :this.podAffinityTerm.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeightedPodAffinityTerm) == false) {
            return false;
        }
        WeightedPodAffinityTerm rhs = ((WeightedPodAffinityTerm) other);
        return (((this.podAffinityTerm == rhs.podAffinityTerm)||((this.podAffinityTerm!= null)&&this.podAffinityTerm.equals(rhs.podAffinityTerm)))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))));
    }

}
