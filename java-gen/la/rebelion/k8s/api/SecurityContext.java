
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowPrivilegeEscalation",
    "capabilities",
    "privileged",
    "procMount",
    "readOnlyRootFilesystem",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "seccompProfile",
    "windowsOptions"
})
@Generated("jsonschema2pojo")
public class SecurityContext {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    @JsonPropertyDescription("AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.")
    private Boolean allowPrivilegeEscalation;
    /**
     * Adds and removes POSIX capabilities from running containers.
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("Adds and removes POSIX capabilities from running containers.")
    private Capabilities capabilities;
    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    @JsonPropertyDescription("Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.")
    private Boolean privileged;
    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    @JsonPropertyDescription("procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.")
    private String procMount;
    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    @JsonPropertyDescription("Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.")
    private Boolean readOnlyRootFilesystem;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    @JsonPropertyDescription("The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
    private Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    @JsonPropertyDescription("Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
    private Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    @JsonPropertyDescription("The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
    private Integer runAsUser;
    /**
     * SELinuxOptions are the labels to be applied to the container
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("SELinuxOptions are the labels to be applied to the container")
    private SELinuxOptions seLinuxOptions;
    /**
     * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
     * 
     */
    @JsonProperty("seccompProfile")
    @JsonPropertyDescription("SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.")
    private SeccompProfile seccompProfile;
    /**
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    @JsonProperty("windowsOptions")
    @JsonPropertyDescription("WindowsSecurityContextOptions contain Windows-specific options and credentials.")
    private WindowsSecurityContextOptions windowsOptions;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityContext() {
    }

    /**
     * 
     * @param source
     */
    public SecurityContext(SecurityContext source) {
        super();
        this.allowPrivilegeEscalation = source.allowPrivilegeEscalation;
        this.capabilities = source.capabilities;
        this.privileged = source.privileged;
        this.procMount = source.procMount;
        this.readOnlyRootFilesystem = source.readOnlyRootFilesystem;
        this.runAsGroup = source.runAsGroup;
        this.runAsNonRoot = source.runAsNonRoot;
        this.runAsUser = source.runAsUser;
        this.seLinuxOptions = source.seLinuxOptions;
        this.seccompProfile = source.seccompProfile;
        this.windowsOptions = source.windowsOptions;
    }

    /**
     * 
     * @param privileged
     * @param runAsUser
     * @param capabilities
     * @param seLinuxOptions
     * @param seccompProfile
     * @param windowsOptions
     * @param procMount
     * @param allowPrivilegeEscalation
     * @param runAsGroup
     * @param runAsNonRoot
     * @param readOnlyRootFilesystem
     */
    public SecurityContext(Boolean allowPrivilegeEscalation, Capabilities capabilities, Boolean privileged, String procMount, Boolean readOnlyRootFilesystem, Integer runAsGroup, Boolean runAsNonRoot, Integer runAsUser, SELinuxOptions seLinuxOptions, SeccompProfile seccompProfile, WindowsSecurityContextOptions windowsOptions) {
        super();
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.windowsOptions = windowsOptions;
    }

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    /**
     * Adds and removes POSIX capabilities from running containers.
     * 
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Adds and removes POSIX capabilities from running containers.
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    public String getProcMount() {
        return procMount;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * SELinuxOptions are the labels to be applied to the container
     * 
     */
    @JsonProperty("seLinuxOptions")
    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * SELinuxOptions are the labels to be applied to the container
     * 
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
     * 
     */
    @JsonProperty("seccompProfile")
    public SeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    /**
     * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
     * 
     */
    @JsonProperty("seccompProfile")
    public void setSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    /**
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    @JsonProperty("windowsOptions")
    public WindowsSecurityContextOptions getWindowsOptions() {
        return windowsOptions;
    }

    /**
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    @JsonProperty("windowsOptions")
    public void setWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allowPrivilegeEscalation");
        sb.append('=');
        sb.append(((this.allowPrivilegeEscalation == null)?"<null>":this.allowPrivilegeEscalation));
        sb.append(',');
        sb.append("capabilities");
        sb.append('=');
        sb.append(((this.capabilities == null)?"<null>":this.capabilities));
        sb.append(',');
        sb.append("privileged");
        sb.append('=');
        sb.append(((this.privileged == null)?"<null>":this.privileged));
        sb.append(',');
        sb.append("procMount");
        sb.append('=');
        sb.append(((this.procMount == null)?"<null>":this.procMount));
        sb.append(',');
        sb.append("readOnlyRootFilesystem");
        sb.append('=');
        sb.append(((this.readOnlyRootFilesystem == null)?"<null>":this.readOnlyRootFilesystem));
        sb.append(',');
        sb.append("runAsGroup");
        sb.append('=');
        sb.append(((this.runAsGroup == null)?"<null>":this.runAsGroup));
        sb.append(',');
        sb.append("runAsNonRoot");
        sb.append('=');
        sb.append(((this.runAsNonRoot == null)?"<null>":this.runAsNonRoot));
        sb.append(',');
        sb.append("runAsUser");
        sb.append('=');
        sb.append(((this.runAsUser == null)?"<null>":this.runAsUser));
        sb.append(',');
        sb.append("seLinuxOptions");
        sb.append('=');
        sb.append(((this.seLinuxOptions == null)?"<null>":this.seLinuxOptions));
        sb.append(',');
        sb.append("seccompProfile");
        sb.append('=');
        sb.append(((this.seccompProfile == null)?"<null>":this.seccompProfile));
        sb.append(',');
        sb.append("windowsOptions");
        sb.append('=');
        sb.append(((this.windowsOptions == null)?"<null>":this.windowsOptions));
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
        result = ((result* 31)+((this.privileged == null)? 0 :this.privileged.hashCode()));
        result = ((result* 31)+((this.runAsUser == null)? 0 :this.runAsUser.hashCode()));
        result = ((result* 31)+((this.capabilities == null)? 0 :this.capabilities.hashCode()));
        result = ((result* 31)+((this.seLinuxOptions == null)? 0 :this.seLinuxOptions.hashCode()));
        result = ((result* 31)+((this.seccompProfile == null)? 0 :this.seccompProfile.hashCode()));
        result = ((result* 31)+((this.windowsOptions == null)? 0 :this.windowsOptions.hashCode()));
        result = ((result* 31)+((this.procMount == null)? 0 :this.procMount.hashCode()));
        result = ((result* 31)+((this.allowPrivilegeEscalation == null)? 0 :this.allowPrivilegeEscalation.hashCode()));
        result = ((result* 31)+((this.runAsGroup == null)? 0 :this.runAsGroup.hashCode()));
        result = ((result* 31)+((this.runAsNonRoot == null)? 0 :this.runAsNonRoot.hashCode()));
        result = ((result* 31)+((this.readOnlyRootFilesystem == null)? 0 :this.readOnlyRootFilesystem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityContext) == false) {
            return false;
        }
        SecurityContext rhs = ((SecurityContext) other);
        return ((((((((((((this.privileged == rhs.privileged)||((this.privileged!= null)&&this.privileged.equals(rhs.privileged)))&&((this.runAsUser == rhs.runAsUser)||((this.runAsUser!= null)&&this.runAsUser.equals(rhs.runAsUser))))&&((this.capabilities == rhs.capabilities)||((this.capabilities!= null)&&this.capabilities.equals(rhs.capabilities))))&&((this.seLinuxOptions == rhs.seLinuxOptions)||((this.seLinuxOptions!= null)&&this.seLinuxOptions.equals(rhs.seLinuxOptions))))&&((this.seccompProfile == rhs.seccompProfile)||((this.seccompProfile!= null)&&this.seccompProfile.equals(rhs.seccompProfile))))&&((this.windowsOptions == rhs.windowsOptions)||((this.windowsOptions!= null)&&this.windowsOptions.equals(rhs.windowsOptions))))&&((this.procMount == rhs.procMount)||((this.procMount!= null)&&this.procMount.equals(rhs.procMount))))&&((this.allowPrivilegeEscalation == rhs.allowPrivilegeEscalation)||((this.allowPrivilegeEscalation!= null)&&this.allowPrivilegeEscalation.equals(rhs.allowPrivilegeEscalation))))&&((this.runAsGroup == rhs.runAsGroup)||((this.runAsGroup!= null)&&this.runAsGroup.equals(rhs.runAsGroup))))&&((this.runAsNonRoot == rhs.runAsNonRoot)||((this.runAsNonRoot!= null)&&this.runAsNonRoot.equals(rhs.runAsNonRoot))))&&((this.readOnlyRootFilesystem == rhs.readOnlyRootFilesystem)||((this.readOnlyRootFilesystem!= null)&&this.readOnlyRootFilesystem.equals(rhs.readOnlyRootFilesystem))));
    }

}
