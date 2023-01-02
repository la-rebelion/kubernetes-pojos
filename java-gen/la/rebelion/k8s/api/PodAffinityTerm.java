
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "labelSelector",
    "namespaceSelector",
    "namespaces",
    "topologyKey"
})
@Generated("jsonschema2pojo")
public class PodAffinityTerm {

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("labelSelector")
    @JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    private LabelSelector labelSelector;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("namespaceSelector")
    @JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    private LabelSelector namespaceSelector;
    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
     * 
     */
    @JsonProperty("namespaces")
    @JsonPropertyDescription("namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \"this pod's namespace\".")
    private List<String> namespaces = new ArrayList<String>();
    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    @JsonPropertyDescription("This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
    private String topologyKey;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodAffinityTerm() {
    }

    /**
     * 
     * @param source
     */
    public PodAffinityTerm(PodAffinityTerm source) {
        super();
        this.labelSelector = source.labelSelector;
        this.namespaceSelector = source.namespaceSelector;
        this.namespaces = source.namespaces;
        this.topologyKey = source.topologyKey;
    }

    /**
     * 
     * @param labelSelector
     * @param namespaceSelector
     * @param topologyKey
     * @param namespaces
     */
    public PodAffinityTerm(LabelSelector labelSelector, LabelSelector namespaceSelector, List<String> namespaces, String topologyKey) {
        super();
        this.labelSelector = labelSelector;
        this.namespaceSelector = namespaceSelector;
        this.namespaces = namespaces;
        this.topologyKey = topologyKey;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("labelSelector")
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("labelSelector")
    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("namespaceSelector")
    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
     * 
     */
    @JsonProperty("namespaces")
    public List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
     * 
     */
    @JsonProperty("namespaces")
    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    public String getTopologyKey() {
        return topologyKey;
    }

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodAffinityTerm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("labelSelector");
        sb.append('=');
        sb.append(((this.labelSelector == null)?"<null>":this.labelSelector));
        sb.append(',');
        sb.append("namespaceSelector");
        sb.append('=');
        sb.append(((this.namespaceSelector == null)?"<null>":this.namespaceSelector));
        sb.append(',');
        sb.append("namespaces");
        sb.append('=');
        sb.append(((this.namespaces == null)?"<null>":this.namespaces));
        sb.append(',');
        sb.append("topologyKey");
        sb.append('=');
        sb.append(((this.topologyKey == null)?"<null>":this.topologyKey));
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
        result = ((result* 31)+((this.labelSelector == null)? 0 :this.labelSelector.hashCode()));
        result = ((result* 31)+((this.namespaceSelector == null)? 0 :this.namespaceSelector.hashCode()));
        result = ((result* 31)+((this.topologyKey == null)? 0 :this.topologyKey.hashCode()));
        result = ((result* 31)+((this.namespaces == null)? 0 :this.namespaces.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodAffinityTerm) == false) {
            return false;
        }
        PodAffinityTerm rhs = ((PodAffinityTerm) other);
        return (((((this.labelSelector == rhs.labelSelector)||((this.labelSelector!= null)&&this.labelSelector.equals(rhs.labelSelector)))&&((this.namespaceSelector == rhs.namespaceSelector)||((this.namespaceSelector!= null)&&this.namespaceSelector.equals(rhs.namespaceSelector))))&&((this.topologyKey == rhs.topologyKey)||((this.topologyKey!= null)&&this.topologyKey.equals(rhs.topologyKey))))&&((this.namespaces == rhs.namespaces)||((this.namespaces!= null)&&this.namespaces.equals(rhs.namespaces))));
    }

}
