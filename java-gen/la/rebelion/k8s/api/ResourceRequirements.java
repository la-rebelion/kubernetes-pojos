
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceRequirements describes the compute resource requirements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "claims",
    "limits",
    "requests"
})
@Generated("jsonschema2pojo")
public class ResourceRequirements {

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("claims")
    @JsonPropertyDescription("Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.\n\nThis is an alpha field and requires enabling the DynamicResourceAllocation feature gate.\n\nThis field is immutable.")
    private List<ResourceClaim> claims = new ArrayList<ResourceClaim>();
    /**
     * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    @JsonPropertyDescription("Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    private Limits limits;
    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    @JsonPropertyDescription("Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    private Requests requests;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceRequirements() {
    }

    /**
     * 
     * @param source
     */
    public ResourceRequirements(ResourceRequirements source) {
        super();
        this.claims = source.claims;
        this.limits = source.limits;
        this.requests = source.requests;
    }

    /**
     * 
     * @param claims
     * @param requests
     * @param limits
     */
    public ResourceRequirements(List<ResourceClaim> claims, Limits limits, Requests requests) {
        super();
        this.claims = claims;
        this.limits = limits;
        this.requests = requests;
    }

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("claims")
    public List<ResourceClaim> getClaims() {
        return claims;
    }

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("claims")
    public void setClaims(List<ResourceClaim> claims) {
        this.claims = claims;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    public Requests getRequests() {
        return requests;
    }

    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    public void setRequests(Requests requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceRequirements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claims");
        sb.append('=');
        sb.append(((this.claims == null)?"<null>":this.claims));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("requests");
        sb.append('=');
        sb.append(((this.requests == null)?"<null>":this.requests));
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
        result = ((result* 31)+((this.claims == null)? 0 :this.claims.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.requests == null)? 0 :this.requests.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceRequirements) == false) {
            return false;
        }
        ResourceRequirements rhs = ((ResourceRequirements) other);
        return ((((this.claims == rhs.claims)||((this.claims!= null)&&this.claims.equals(rhs.claims)))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.requests == rhs.requests)||((this.requests!= null)&&this.requests.equals(rhs.requests))));
    }

}
