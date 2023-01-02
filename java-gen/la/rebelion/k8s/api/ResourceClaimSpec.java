
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceClaimSpec defines how a resource is to be allocated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allocationMode",
    "parametersRef",
    "resourceClassName"
})
@Generated("jsonschema2pojo")
public class ResourceClaimSpec {

    /**
     * Allocation can start immediately or when a Pod wants to use the resource. "WaitForFirstConsumer" is the default.
     * 
     */
    @JsonProperty("allocationMode")
    @JsonPropertyDescription("Allocation can start immediately or when a Pod wants to use the resource. \"WaitForFirstConsumer\" is the default.")
    private String allocationMode;
    /**
     * ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.
     * 
     */
    @JsonProperty("parametersRef")
    @JsonPropertyDescription("ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.")
    private ResourceClaimParametersReference parametersRef;
    /**
     * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
     * (Required)
     * 
     */
    @JsonProperty("resourceClassName")
    @JsonPropertyDescription("ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.")
    private String resourceClassName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceClaimSpec() {
    }

    /**
     * 
     * @param source
     */
    public ResourceClaimSpec(ResourceClaimSpec source) {
        super();
        this.allocationMode = source.allocationMode;
        this.parametersRef = source.parametersRef;
        this.resourceClassName = source.resourceClassName;
    }

    /**
     * 
     * @param allocationMode
     * @param resourceClassName
     * @param parametersRef
     */
    public ResourceClaimSpec(String allocationMode, ResourceClaimParametersReference parametersRef, String resourceClassName) {
        super();
        this.allocationMode = allocationMode;
        this.parametersRef = parametersRef;
        this.resourceClassName = resourceClassName;
    }

    /**
     * Allocation can start immediately or when a Pod wants to use the resource. "WaitForFirstConsumer" is the default.
     * 
     */
    @JsonProperty("allocationMode")
    public String getAllocationMode() {
        return allocationMode;
    }

    /**
     * Allocation can start immediately or when a Pod wants to use the resource. "WaitForFirstConsumer" is the default.
     * 
     */
    @JsonProperty("allocationMode")
    public void setAllocationMode(String allocationMode) {
        this.allocationMode = allocationMode;
    }

    /**
     * ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.
     * 
     */
    @JsonProperty("parametersRef")
    public ResourceClaimParametersReference getParametersRef() {
        return parametersRef;
    }

    /**
     * ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim. The object must be in the same namespace as the ResourceClaim.
     * 
     */
    @JsonProperty("parametersRef")
    public void setParametersRef(ResourceClaimParametersReference parametersRef) {
        this.parametersRef = parametersRef;
    }

    /**
     * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
     * (Required)
     * 
     */
    @JsonProperty("resourceClassName")
    public String getResourceClassName() {
        return resourceClassName;
    }

    /**
     * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
     * (Required)
     * 
     */
    @JsonProperty("resourceClassName")
    public void setResourceClassName(String resourceClassName) {
        this.resourceClassName = resourceClassName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceClaimSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allocationMode");
        sb.append('=');
        sb.append(((this.allocationMode == null)?"<null>":this.allocationMode));
        sb.append(',');
        sb.append("parametersRef");
        sb.append('=');
        sb.append(((this.parametersRef == null)?"<null>":this.parametersRef));
        sb.append(',');
        sb.append("resourceClassName");
        sb.append('=');
        sb.append(((this.resourceClassName == null)?"<null>":this.resourceClassName));
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
        result = ((result* 31)+((this.allocationMode == null)? 0 :this.allocationMode.hashCode()));
        result = ((result* 31)+((this.parametersRef == null)? 0 :this.parametersRef.hashCode()));
        result = ((result* 31)+((this.resourceClassName == null)? 0 :this.resourceClassName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceClaimSpec) == false) {
            return false;
        }
        ResourceClaimSpec rhs = ((ResourceClaimSpec) other);
        return ((((this.allocationMode == rhs.allocationMode)||((this.allocationMode!= null)&&this.allocationMode.equals(rhs.allocationMode)))&&((this.parametersRef == rhs.parametersRef)||((this.parametersRef!= null)&&this.parametersRef.equals(rhs.parametersRef))))&&((this.resourceClassName == rhs.resourceClassName)||((this.resourceClassName!= null)&&this.resourceClassName.equals(rhs.resourceClassName))));
    }

}
