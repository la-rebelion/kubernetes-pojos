
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferredDuringSchedulingIgnoredDuringExecution",
    "requiredDuringSchedulingIgnoredDuringExecution"
})
@Generated("jsonschema2pojo")
public class PodAntiAffinity {

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.")
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTerm>();
    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.")
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTerm>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodAntiAffinity() {
    }

    /**
     * 
     * @param source
     */
    public PodAntiAffinity(PodAntiAffinity source) {
        super();
        this.preferredDuringSchedulingIgnoredDuringExecution = source.preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = source.requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param preferredDuringSchedulingIgnoredDuringExecution
     */
    public PodAntiAffinity(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution, List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        super();
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public void setRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodAntiAffinity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof PodAntiAffinity) == false) {
            return false;
        }
        PodAntiAffinity rhs = ((PodAntiAffinity) other);
        return (((this.requiredDuringSchedulingIgnoredDuringExecution == rhs.requiredDuringSchedulingIgnoredDuringExecution)||((this.requiredDuringSchedulingIgnoredDuringExecution!= null)&&this.requiredDuringSchedulingIgnoredDuringExecution.equals(rhs.requiredDuringSchedulingIgnoredDuringExecution)))&&((this.preferredDuringSchedulingIgnoredDuringExecution == rhs.preferredDuringSchedulingIgnoredDuringExecution)||((this.preferredDuringSchedulingIgnoredDuringExecution!= null)&&this.preferredDuringSchedulingIgnoredDuringExecution.equals(rhs.preferredDuringSchedulingIgnoredDuringExecution))));
    }

}
