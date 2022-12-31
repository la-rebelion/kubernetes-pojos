
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NamespaceSpec describes the attributes on a Namespace.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finalizers"
})
@Generated("jsonschema2pojo")
public class NamespaceSpec {

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     */
    @JsonProperty("finalizers")
    @JsonPropertyDescription("Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
    private List<String> finalizers = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NamespaceSpec() {
    }

    /**
     * 
     * @param source
     */
    public NamespaceSpec(NamespaceSpec source) {
        super();
        this.finalizers = source.finalizers;
    }

    /**
     * 
     * @param finalizers
     */
    public NamespaceSpec(List<String> finalizers) {
        super();
        this.finalizers = finalizers;
    }

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     */
    @JsonProperty("finalizers")
    public List<String> getFinalizers() {
        return finalizers;
    }

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     */
    @JsonProperty("finalizers")
    public void setFinalizers(List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NamespaceSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finalizers");
        sb.append('=');
        sb.append(((this.finalizers == null)?"<null>":this.finalizers));
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
        result = ((result* 31)+((this.finalizers == null)? 0 :this.finalizers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NamespaceSpec) == false) {
            return false;
        }
        NamespaceSpec rhs = ((NamespaceSpec) other);
        return ((this.finalizers == rhs.finalizers)||((this.finalizers!= null)&&this.finalizers.equals(rhs.finalizers)));
    }

}
