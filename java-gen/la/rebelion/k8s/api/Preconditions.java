
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceVersion",
    "uid"
})
@Generated("jsonschema2pojo")
public class Preconditions {

    /**
     * Specifies the target ResourceVersion
     * 
     */
    @JsonProperty("resourceVersion")
    @JsonPropertyDescription("Specifies the target ResourceVersion")
    private String resourceVersion;
    /**
     * Specifies the target UID.
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("Specifies the target UID.")
    private String uid;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Preconditions() {
    }

    /**
     * 
     * @param source
     */
    public Preconditions(Preconditions source) {
        super();
        this.resourceVersion = source.resourceVersion;
        this.uid = source.uid;
    }

    /**
     * 
     * @param uid
     * @param resourceVersion
     */
    public Preconditions(String resourceVersion, String uid) {
        super();
        this.resourceVersion = resourceVersion;
        this.uid = uid;
    }

    /**
     * Specifies the target ResourceVersion
     * 
     */
    @JsonProperty("resourceVersion")
    public String getResourceVersion() {
        return resourceVersion;
    }

    /**
     * Specifies the target ResourceVersion
     * 
     */
    @JsonProperty("resourceVersion")
    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
     * Specifies the target UID.
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Specifies the target UID.
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Preconditions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceVersion");
        sb.append('=');
        sb.append(((this.resourceVersion == null)?"<null>":this.resourceVersion));
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
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.resourceVersion == null)? 0 :this.resourceVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Preconditions) == false) {
            return false;
        }
        Preconditions rhs = ((Preconditions) other);
        return (((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.resourceVersion == rhs.resourceVersion)||((this.resourceVersion!= null)&&this.resourceVersion.equals(rhs.resourceVersion))));
    }

}
