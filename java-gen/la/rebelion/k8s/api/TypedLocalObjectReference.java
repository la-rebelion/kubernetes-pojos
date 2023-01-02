
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiGroup",
    "kind",
    "name"
})
@Generated("jsonschema2pojo")
public class TypedLocalObjectReference {

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @JsonProperty("apiGroup")
    @JsonPropertyDescription("APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.")
    private String apiGroup;
    /**
     * Kind is the type of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Kind is the type of resource being referenced")
    private String kind;
    /**
     * Name is the name of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of resource being referenced")
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TypedLocalObjectReference() {
    }

    /**
     * 
     * @param source
     */
    public TypedLocalObjectReference(TypedLocalObjectReference source) {
        super();
        this.apiGroup = source.apiGroup;
        this.kind = source.kind;
        this.name = source.name;
    }

    /**
     * 
     * @param apiGroup
     * @param kind
     * @param name
     */
    public TypedLocalObjectReference(String apiGroup, String kind, String name) {
        super();
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
    }

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @JsonProperty("apiGroup")
    public String getApiGroup() {
        return apiGroup;
    }

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @JsonProperty("apiGroup")
    public void setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
    }

    /**
     * Kind is the type of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Kind is the type of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Name is the name of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of resource being referenced
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TypedLocalObjectReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiGroup");
        sb.append('=');
        sb.append(((this.apiGroup == null)?"<null>":this.apiGroup));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.apiGroup == null)? 0 :this.apiGroup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TypedLocalObjectReference) == false) {
            return false;
        }
        TypedLocalObjectReference rhs = ((TypedLocalObjectReference) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.apiGroup == rhs.apiGroup)||((this.apiGroup!= null)&&this.apiGroup.equals(rhs.apiGroup))));
    }

}
