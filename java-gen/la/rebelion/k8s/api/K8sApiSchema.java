
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Kubernetes Schema
 * <p>
 * The schema for K1s
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NamespaceList",
    "Info"
})
@Generated("jsonschema2pojo")
public class K8sApiSchema {

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    @JsonPropertyDescription("NamespaceList is a list of Namespaces.")
    private NamespaceList namespaceList;
    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    @JsonPropertyDescription("Info contains versioning information. how we'll want to distribute that information.")
    private Info info;

    /**
     * No args constructor for use in serialization
     * 
     */
    public K8sApiSchema() {
    }

    /**
     * 
     * @param source
     */
    public K8sApiSchema(K8sApiSchema source) {
        super();
        this.namespaceList = source.namespaceList;
        this.info = source.info;
    }

    /**
     * 
     * @param namespaceList
     * @param info
     */
    public K8sApiSchema(NamespaceList namespaceList, Info info) {
        super();
        this.namespaceList = namespaceList;
        this.info = info;
    }

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    public NamespaceList getNamespaceList() {
        return namespaceList;
    }

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    public void setNamespaceList(NamespaceList namespaceList) {
        this.namespaceList = namespaceList;
    }

    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K8sApiSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("namespaceList");
        sb.append('=');
        sb.append(((this.namespaceList == null)?"<null>":this.namespaceList));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
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
        result = ((result* 31)+((this.namespaceList == null)? 0 :this.namespaceList.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof K8sApiSchema) == false) {
            return false;
        }
        K8sApiSchema rhs = ((K8sApiSchema) other);
        return (((this.namespaceList == rhs.namespaceList)||((this.namespaceList!= null)&&this.namespaceList.equals(rhs.namespaceList)))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))));
    }

}
