
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ClaimSource describes a reference to a ResourceClaim.
 * 
 * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceClaimName",
    "resourceClaimTemplateName"
})
@Generated("jsonschema2pojo")
public class ClaimSource {

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     */
    @JsonProperty("resourceClaimName")
    @JsonPropertyDescription("ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.")
    private String resourceClaimName;
    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * 
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     */
    @JsonProperty("resourceClaimTemplateName")
    @JsonPropertyDescription("ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.\n\nThe template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).\n\nAn existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.\n\nThis field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.")
    private String resourceClaimTemplateName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClaimSource() {
    }

    /**
     * 
     * @param source
     */
    public ClaimSource(ClaimSource source) {
        super();
        this.resourceClaimName = source.resourceClaimName;
        this.resourceClaimTemplateName = source.resourceClaimTemplateName;
    }

    /**
     * 
     * @param resourceClaimName
     * @param resourceClaimTemplateName
     */
    public ClaimSource(String resourceClaimName, String resourceClaimTemplateName) {
        super();
        this.resourceClaimName = resourceClaimName;
        this.resourceClaimTemplateName = resourceClaimTemplateName;
    }

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     */
    @JsonProperty("resourceClaimName")
    public String getResourceClaimName() {
        return resourceClaimName;
    }

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     * 
     */
    @JsonProperty("resourceClaimName")
    public void setResourceClaimName(String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
    }

    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * 
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     */
    @JsonProperty("resourceClaimTemplateName")
    public String getResourceClaimTemplateName() {
        return resourceClaimTemplateName;
    }

    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * 
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * 
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * 
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     * 
     */
    @JsonProperty("resourceClaimTemplateName")
    public void setResourceClaimTemplateName(String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceClaimName");
        sb.append('=');
        sb.append(((this.resourceClaimName == null)?"<null>":this.resourceClaimName));
        sb.append(',');
        sb.append("resourceClaimTemplateName");
        sb.append('=');
        sb.append(((this.resourceClaimTemplateName == null)?"<null>":this.resourceClaimTemplateName));
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
        result = ((result* 31)+((this.resourceClaimTemplateName == null)? 0 :this.resourceClaimTemplateName.hashCode()));
        result = ((result* 31)+((this.resourceClaimName == null)? 0 :this.resourceClaimName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimSource) == false) {
            return false;
        }
        ClaimSource rhs = ((ClaimSource) other);
        return (((this.resourceClaimTemplateName == rhs.resourceClaimTemplateName)||((this.resourceClaimTemplateName!= null)&&this.resourceClaimTemplateName.equals(rhs.resourceClaimTemplateName)))&&((this.resourceClaimName == rhs.resourceClaimName)||((this.resourceClaimName!= null)&&this.resourceClaimName.equals(rhs.resourceClaimName))));
    }

}
