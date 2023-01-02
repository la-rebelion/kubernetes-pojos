
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodResourceClaim references exactly one ResourceClaim through a ClaimSource. It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "source"
})
@Generated("jsonschema2pojo")
public class PodResourceClaim {

    /**
     * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.")
    private String name;
    /**
     * ClaimSource describes a reference to a ResourceClaim.
     * 
     * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("ClaimSource describes a reference to a ResourceClaim.\n\nExactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.")
    private ClaimSource source;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodResourceClaim() {
    }

    /**
     * 
     * @param source
     */
    public PodResourceClaim(PodResourceClaim source) {
        super();
        this.name = source.name;
        this.source = source.source;
    }

    /**
     * 
     * @param name
     * @param source
     */
    public PodResourceClaim(String name, ClaimSource source) {
        super();
        this.name = name;
        this.source = source;
    }

    /**
     * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ClaimSource describes a reference to a ResourceClaim.
     * 
     * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
     * 
     */
    @JsonProperty("source")
    public ClaimSource getSource() {
        return source;
    }

    /**
     * ClaimSource describes a reference to a ResourceClaim.
     * 
     * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
     * 
     */
    @JsonProperty("source")
    public void setSource(ClaimSource source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodResourceClaim.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodResourceClaim) == false) {
            return false;
        }
        PodResourceClaim rhs = ((PodResourceClaim) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
