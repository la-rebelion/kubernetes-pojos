
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fsGroup",
    "fsGroupChangePolicy",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "seccompProfile",
    "supplementalGroups",
    "sysctls",
    "windowsOptions"
})
@Generated("jsonschema2pojo")
public class PodSecurityContext {

    /**
     * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     *  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroup")
    @JsonPropertyDescription("A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:\n\n1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----\n\nIf unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.")
    private Integer fsGroup;
    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroupChangePolicy")
    @JsonPropertyDescription("fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \"OnRootMismatch\" and \"Always\". If not specified, \"Always\" is used. Note that this field cannot be set when spec.os.name is windows.")
    private String fsGroupChangePolicy;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    @JsonPropertyDescription("The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
    private Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    @JsonPropertyDescription("Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
    private Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    @JsonPropertyDescription("The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
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
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("supplementalGroups")
    @JsonPropertyDescription("A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.")
    private List<Integer> supplementalGroups = new ArrayList<Integer>();
    /**
     * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("sysctls")
    @JsonPropertyDescription("Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.")
    private List<Sysctl> sysctls = new ArrayList<Sysctl>();
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
    public PodSecurityContext() {
    }

    /**
     * 
     * @param source
     */
    public PodSecurityContext(PodSecurityContext source) {
        super();
        this.fsGroup = source.fsGroup;
        this.fsGroupChangePolicy = source.fsGroupChangePolicy;
        this.runAsGroup = source.runAsGroup;
        this.runAsNonRoot = source.runAsNonRoot;
        this.runAsUser = source.runAsUser;
        this.seLinuxOptions = source.seLinuxOptions;
        this.seccompProfile = source.seccompProfile;
        this.supplementalGroups = source.supplementalGroups;
        this.sysctls = source.sysctls;
        this.windowsOptions = source.windowsOptions;
    }

    /**
     * 
     * @param runAsUser
     * @param seLinuxOptions
     * @param fsGroup
     * @param seccompProfile
     * @param windowsOptions
     * @param fsGroupChangePolicy
     * @param supplementalGroups
     * @param runAsGroup
     * @param runAsNonRoot
     * @param sysctls
     */
    public PodSecurityContext(Integer fsGroup, String fsGroupChangePolicy, Integer runAsGroup, Boolean runAsNonRoot, Integer runAsUser, SELinuxOptions seLinuxOptions, SeccompProfile seccompProfile, List<Integer> supplementalGroups, List<Sysctl> sysctls, WindowsSecurityContextOptions windowsOptions) {
        super();
        this.fsGroup = fsGroup;
        this.fsGroupChangePolicy = fsGroupChangePolicy;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
        this.windowsOptions = windowsOptions;
    }

    /**
     * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     *  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroup")
    public Integer getFsGroup() {
        return fsGroup;
    }

    /**
     * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     *  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroup")
    public void setFsGroup(Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroupChangePolicy")
    public String getFsGroupChangePolicy() {
        return fsGroupChangePolicy;
    }

    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("fsGroupChangePolicy")
    public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
        this.fsGroupChangePolicy = fsGroupChangePolicy;
    }

    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
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
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("supplementalGroups")
    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process. If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("supplementalGroups")
    public void setSupplementalGroups(List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    /**
     * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("sysctls")
    public List<Sysctl> getSysctls() {
        return sysctls;
    }

    /**
     * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("sysctls")
    public void setSysctls(List<Sysctl> sysctls) {
        this.sysctls = sysctls;
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
        sb.append(PodSecurityContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsGroup");
        sb.append('=');
        sb.append(((this.fsGroup == null)?"<null>":this.fsGroup));
        sb.append(',');
        sb.append("fsGroupChangePolicy");
        sb.append('=');
        sb.append(((this.fsGroupChangePolicy == null)?"<null>":this.fsGroupChangePolicy));
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
        sb.append("supplementalGroups");
        sb.append('=');
        sb.append(((this.supplementalGroups == null)?"<null>":this.supplementalGroups));
        sb.append(',');
        sb.append("sysctls");
        sb.append('=');
        sb.append(((this.sysctls == null)?"<null>":this.sysctls));
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
        result = ((result* 31)+((this.runAsUser == null)? 0 :this.runAsUser.hashCode()));
        result = ((result* 31)+((this.seLinuxOptions == null)? 0 :this.seLinuxOptions.hashCode()));
        result = ((result* 31)+((this.fsGroup == null)? 0 :this.fsGroup.hashCode()));
        result = ((result* 31)+((this.seccompProfile == null)? 0 :this.seccompProfile.hashCode()));
        result = ((result* 31)+((this.windowsOptions == null)? 0 :this.windowsOptions.hashCode()));
        result = ((result* 31)+((this.fsGroupChangePolicy == null)? 0 :this.fsGroupChangePolicy.hashCode()));
        result = ((result* 31)+((this.supplementalGroups == null)? 0 :this.supplementalGroups.hashCode()));
        result = ((result* 31)+((this.runAsGroup == null)? 0 :this.runAsGroup.hashCode()));
        result = ((result* 31)+((this.runAsNonRoot == null)? 0 :this.runAsNonRoot.hashCode()));
        result = ((result* 31)+((this.sysctls == null)? 0 :this.sysctls.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodSecurityContext) == false) {
            return false;
        }
        PodSecurityContext rhs = ((PodSecurityContext) other);
        return (((((((((((this.runAsUser == rhs.runAsUser)||((this.runAsUser!= null)&&this.runAsUser.equals(rhs.runAsUser)))&&((this.seLinuxOptions == rhs.seLinuxOptions)||((this.seLinuxOptions!= null)&&this.seLinuxOptions.equals(rhs.seLinuxOptions))))&&((this.fsGroup == rhs.fsGroup)||((this.fsGroup!= null)&&this.fsGroup.equals(rhs.fsGroup))))&&((this.seccompProfile == rhs.seccompProfile)||((this.seccompProfile!= null)&&this.seccompProfile.equals(rhs.seccompProfile))))&&((this.windowsOptions == rhs.windowsOptions)||((this.windowsOptions!= null)&&this.windowsOptions.equals(rhs.windowsOptions))))&&((this.fsGroupChangePolicy == rhs.fsGroupChangePolicy)||((this.fsGroupChangePolicy!= null)&&this.fsGroupChangePolicy.equals(rhs.fsGroupChangePolicy))))&&((this.supplementalGroups == rhs.supplementalGroups)||((this.supplementalGroups!= null)&&this.supplementalGroups.equals(rhs.supplementalGroups))))&&((this.runAsGroup == rhs.runAsGroup)||((this.runAsGroup!= null)&&this.runAsGroup.equals(rhs.runAsGroup))))&&((this.runAsNonRoot == rhs.runAsNonRoot)||((this.runAsNonRoot!= null)&&this.runAsNonRoot.equals(rhs.runAsNonRoot))))&&((this.sysctls == rhs.sysctls)||((this.sysctls!= null)&&this.sysctls.equals(rhs.sysctls))));
    }

}
