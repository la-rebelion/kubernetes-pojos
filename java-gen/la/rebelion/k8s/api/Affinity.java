
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Affinity is a group of affinity scheduling rules.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodeAffinity",
    "podAffinity",
    "podAntiAffinity"
})
@Generated("jsonschema2pojo")
public class Affinity {

    /**
     * Node affinity is a group of node affinity scheduling rules.
     * 
     */
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("Node affinity is a group of node affinity scheduling rules.")
    private NodeAffinity nodeAffinity;
    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     * 
     */
    @JsonProperty("podAffinity")
    @JsonPropertyDescription("Pod affinity is a group of inter pod affinity scheduling rules.")
    private PodAffinity podAffinity;
    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     * 
     */
    @JsonProperty("podAntiAffinity")
    @JsonPropertyDescription("Pod anti affinity is a group of inter pod anti affinity scheduling rules.")
    private PodAntiAffinity podAntiAffinity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Affinity() {
    }

    /**
     * 
     * @param source
     */
    public Affinity(Affinity source) {
        super();
        this.nodeAffinity = source.nodeAffinity;
        this.podAffinity = source.podAffinity;
        this.podAntiAffinity = source.podAntiAffinity;
    }

    /**
     * 
     * @param nodeAffinity
     * @param podAffinity
     * @param podAntiAffinity
     */
    public Affinity(NodeAffinity nodeAffinity, PodAffinity podAffinity, PodAntiAffinity podAntiAffinity) {
        super();
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    /**
     * Node affinity is a group of node affinity scheduling rules.
     * 
     */
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * Node affinity is a group of node affinity scheduling rules.
     * 
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     * 
     */
    @JsonProperty("podAffinity")
    public PodAffinity getPodAffinity() {
        return podAffinity;
    }

    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     * 
     */
    @JsonProperty("podAffinity")
    public void setPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     * 
     */
    @JsonProperty("podAntiAffinity")
    public PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     * 
     */
    @JsonProperty("podAntiAffinity")
    public void setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Affinity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nodeAffinity");
        sb.append('=');
        sb.append(((this.nodeAffinity == null)?"<null>":this.nodeAffinity));
        sb.append(',');
        sb.append("podAffinity");
        sb.append('=');
        sb.append(((this.podAffinity == null)?"<null>":this.podAffinity));
        sb.append(',');
        sb.append("podAntiAffinity");
        sb.append('=');
        sb.append(((this.podAntiAffinity == null)?"<null>":this.podAntiAffinity));
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
        result = ((result* 31)+((this.nodeAffinity == null)? 0 :this.nodeAffinity.hashCode()));
        result = ((result* 31)+((this.podAffinity == null)? 0 :this.podAffinity.hashCode()));
        result = ((result* 31)+((this.podAntiAffinity == null)? 0 :this.podAntiAffinity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Affinity) == false) {
            return false;
        }
        Affinity rhs = ((Affinity) other);
        return ((((this.nodeAffinity == rhs.nodeAffinity)||((this.nodeAffinity!= null)&&this.nodeAffinity.equals(rhs.nodeAffinity)))&&((this.podAffinity == rhs.podAffinity)||((this.podAffinity!= null)&&this.podAffinity.equals(rhs.podAffinity))))&&((this.podAntiAffinity == rhs.podAntiAffinity)||((this.podAntiAffinity!= null)&&this.podAntiAffinity.equals(rhs.podAntiAffinity))));
    }

}
