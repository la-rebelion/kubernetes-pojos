
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceClaim describes which resources are needed by a resource consumer. Its status tracks whether the resource has been allocated and what the resulting attributes are.
 * 
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "spec",
    "status"
})
@Generated("jsonschema2pojo")
public class ResourceClaim {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
    private String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
    private String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")
    private ObjectMeta metadata;
    /**
     * ResourceClaimSpec defines how a resource is to be allocated.
     * (Required)
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("ResourceClaimSpec defines how a resource is to be allocated.")
    private ResourceClaimSpec spec;
    /**
     * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.")
    private ResourceClaimStatus status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceClaim() {
    }

    /**
     * 
     * @param source
     */
    public ResourceClaim(ResourceClaim source) {
        super();
        this.apiVersion = source.apiVersion;
        this.kind = source.kind;
        this.metadata = source.metadata;
        this.spec = source.spec;
        this.status = source.status;
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param spec
     * @param status
     */
    public ResourceClaim(String apiVersion, String kind, ObjectMeta metadata, ResourceClaimSpec spec, ResourceClaimStatus status) {
        super();
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * ResourceClaimSpec defines how a resource is to be allocated.
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public ResourceClaimSpec getSpec() {
        return spec;
    }

    /**
     * ResourceClaimSpec defines how a resource is to be allocated.
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setSpec(ResourceClaimSpec spec) {
        this.spec = spec;
    }

    /**
     * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
     * 
     */
    @JsonProperty("status")
    public ResourceClaimStatus getStatus() {
        return status;
    }

    /**
     * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ResourceClaimStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceClaim.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceClaim) == false) {
            return false;
        }
        ResourceClaim rhs = ((ResourceClaim) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
