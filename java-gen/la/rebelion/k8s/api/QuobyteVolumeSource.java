
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group",
    "readOnly",
    "registry",
    "tenant",
    "user",
    "volume"
})
@Generated("jsonschema2pojo")
public class QuobyteVolumeSource {

    /**
     * group to map volume access to Default is no group
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("group to map volume access to Default is no group")
    private String group;
    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
    private Boolean readOnly;
    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * (Required)
     * 
     */
    @JsonProperty("registry")
    @JsonPropertyDescription("registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
    private String registry;
    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    @JsonProperty("tenant")
    @JsonPropertyDescription("tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")
    private String tenant;
    /**
     * user to map volume access to Defaults to serivceaccount user
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("user to map volume access to Defaults to serivceaccount user")
    private String user;
    /**
     * volume is a string that references an already created Quobyte volume by name.
     * (Required)
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("volume is a string that references an already created Quobyte volume by name.")
    private String volume;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuobyteVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public QuobyteVolumeSource(QuobyteVolumeSource source) {
        super();
        this.group = source.group;
        this.readOnly = source.readOnly;
        this.registry = source.registry;
        this.tenant = source.tenant;
        this.user = source.user;
        this.volume = source.volume;
    }

    /**
     * 
     * @param volume
     * @param registry
     * @param readOnly
     * @param user
     * @param tenant
     * @param group
     */
    public QuobyteVolumeSource(String group, Boolean readOnly, String registry, String tenant, String user, String volume) {
        super();
        this.group = group;
        this.readOnly = readOnly;
        this.registry = registry;
        this.tenant = tenant;
        this.user = user;
        this.volume = volume;
    }

    /**
     * group to map volume access to Default is no group
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * group to map volume access to Default is no group
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * (Required)
     * 
     */
    @JsonProperty("registry")
    public String getRegistry() {
        return registry;
    }

    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * (Required)
     * 
     */
    @JsonProperty("registry")
    public void setRegistry(String registry) {
        this.registry = registry;
    }

    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    @JsonProperty("tenant")
    public String getTenant() {
        return tenant;
    }

    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    @JsonProperty("tenant")
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    /**
     * user to map volume access to Defaults to serivceaccount user
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * user to map volume access to Defaults to serivceaccount user
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * volume is a string that references an already created Quobyte volume by name.
     * (Required)
     * 
     */
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    /**
     * volume is a string that references an already created Quobyte volume by name.
     * (Required)
     * 
     */
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuobyteVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("registry");
        sb.append('=');
        sb.append(((this.registry == null)?"<null>":this.registry));
        sb.append(',');
        sb.append("tenant");
        sb.append('=');
        sb.append(((this.tenant == null)?"<null>":this.tenant));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.registry == null)? 0 :this.registry.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.tenant == null)? 0 :this.tenant.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuobyteVolumeSource) == false) {
            return false;
        }
        QuobyteVolumeSource rhs = ((QuobyteVolumeSource) other);
        return (((((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.registry == rhs.registry)||((this.registry!= null)&&this.registry.equals(rhs.registry))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.tenant == rhs.tenant)||((this.tenant!= null)&&this.tenant.equals(rhs.tenant))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
