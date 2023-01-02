
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiGroup",
    "name",
    "resource",
    "uid"
})
@Generated("jsonschema2pojo")
public class ResourceClaimConsumerReference {

    /**
     * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    @JsonProperty("apiGroup")
    @JsonPropertyDescription("APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.")
    private String apiGroup;
    /**
     * Name is the name of resource being referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of resource being referenced.")
    private String name;
    /**
     * Resource is the type of resource being referenced, for example "pods".
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("Resource is the type of resource being referenced, for example \"pods\".")
    private String resource;
    /**
     * UID identifies exactly one incarnation of the resource.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("UID identifies exactly one incarnation of the resource.")
    private String uid;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceClaimConsumerReference() {
    }

    /**
     * 
     * @param source
     */
    public ResourceClaimConsumerReference(ResourceClaimConsumerReference source) {
        super();
        this.apiGroup = source.apiGroup;
        this.name = source.name;
        this.resource = source.resource;
        this.uid = source.uid;
    }

    /**
     * 
     * @param uid
     * @param apiGroup
     * @param resource
     * @param name
     */
    public ResourceClaimConsumerReference(String apiGroup, String name, String resource, String uid) {
        super();
        this.apiGroup = apiGroup;
        this.name = name;
        this.resource = resource;
        this.uid = uid;
    }

    /**
     * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    @JsonProperty("apiGroup")
    public String getApiGroup() {
        return apiGroup;
    }

    /**
     * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     * 
     */
    @JsonProperty("apiGroup")
    public void setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
    }

    /**
     * Name is the name of resource being referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of resource being referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Resource is the type of resource being referenced, for example "pods".
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Resource is the type of resource being referenced, for example "pods".
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * UID identifies exactly one incarnation of the resource.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * UID identifies exactly one incarnation of the resource.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceClaimConsumerReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiGroup");
        sb.append('=');
        sb.append(((this.apiGroup == null)?"<null>":this.apiGroup));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
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
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.apiGroup == null)? 0 :this.apiGroup.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceClaimConsumerReference) == false) {
            return false;
        }
        ResourceClaimConsumerReference rhs = ((ResourceClaimConsumerReference) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.apiGroup == rhs.apiGroup)||((this.apiGroup!= null)&&this.apiGroup.equals(rhs.apiGroup))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))));
    }

}
