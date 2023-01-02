
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SELinuxOptions are the labels to be applied to the container
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "role",
    "type",
    "user"
})
@Generated("jsonschema2pojo")
public class SELinuxOptions {

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("Level is SELinux level label that applies to the container.")
    private String level;
    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Role is a SELinux role label that applies to the container.")
    private String role;
    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is a SELinux type label that applies to the container.")
    private String type;
    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("User is a SELinux user label that applies to the container.")
    private String user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SELinuxOptions() {
    }

    /**
     * 
     * @param source
     */
    public SELinuxOptions(SELinuxOptions source) {
        super();
        this.level = source.level;
        this.role = source.role;
        this.type = source.type;
        this.user = source.user;
    }

    /**
     * 
     * @param role
     * @param level
     * @param type
     * @param user
     */
    public SELinuxOptions(String level, String role, String type, String user) {
        super();
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SELinuxOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SELinuxOptions) == false) {
            return false;
        }
        SELinuxOptions rhs = ((SELinuxOptions) other);
        return (((((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
