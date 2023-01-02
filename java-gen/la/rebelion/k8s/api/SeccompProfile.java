
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "localhostProfile",
    "type"
})
@Generated("jsonschema2pojo")
public class SeccompProfile {

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
     */
    @JsonProperty("localhostProfile")
    @JsonPropertyDescription("localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is \"Localhost\".")
    private String localhostProfile;
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("type indicates which kind of seccomp profile will be applied. Valid options are:\n\nLocalhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.\n\n")
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SeccompProfile() {
    }

    /**
     * 
     * @param source
     */
    public SeccompProfile(SeccompProfile source) {
        super();
        this.localhostProfile = source.localhostProfile;
        this.type = source.type;
    }

    /**
     * 
     * @param localhostProfile
     * @param type
     */
    public SeccompProfile(String localhostProfile, String type) {
        super();
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
     */
    @JsonProperty("localhostProfile")
    public String getLocalhostProfile() {
        return localhostProfile;
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
     */
    @JsonProperty("localhostProfile")
    public void setLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SeccompProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localhostProfile");
        sb.append('=');
        sb.append(((this.localhostProfile == null)?"<null>":this.localhostProfile));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.localhostProfile == null)? 0 :this.localhostProfile.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeccompProfile) == false) {
            return false;
        }
        SeccompProfile rhs = ((SeccompProfile) other);
        return (((this.localhostProfile == rhs.localhostProfile)||((this.localhostProfile!= null)&&this.localhostProfile.equals(rhs.localhostProfile)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
