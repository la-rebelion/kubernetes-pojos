
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gmsaCredentialSpec",
    "gmsaCredentialSpecName",
    "hostProcess",
    "runAsUserName"
})
@Generated("jsonschema2pojo")
public class WindowsSecurityContextOptions {

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    @JsonPropertyDescription("GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.")
    private String gmsaCredentialSpec;
    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    @JsonPropertyDescription("GMSACredentialSpecName is the name of the GMSA credential spec to use.")
    private String gmsaCredentialSpecName;
    /**
     * HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    @JsonPropertyDescription("HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.")
    private Boolean hostProcess;
    /**
     * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    @JsonPropertyDescription("The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
    private String runAsUserName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WindowsSecurityContextOptions() {
    }

    /**
     * 
     * @param source
     */
    public WindowsSecurityContextOptions(WindowsSecurityContextOptions source) {
        super();
        this.gmsaCredentialSpec = source.gmsaCredentialSpec;
        this.gmsaCredentialSpecName = source.gmsaCredentialSpecName;
        this.hostProcess = source.hostProcess;
        this.runAsUserName = source.runAsUserName;
    }

    /**
     * 
     * @param gmsaCredentialSpec
     * @param runAsUserName
     * @param hostProcess
     * @param gmsaCredentialSpecName
     */
    public WindowsSecurityContextOptions(String gmsaCredentialSpec, String gmsaCredentialSpecName, Boolean hostProcess, String runAsUserName) {
        super();
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        this.hostProcess = hostProcess;
        this.runAsUserName = runAsUserName;
    }

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    public String getGmsaCredentialSpec() {
        return gmsaCredentialSpec;
    }

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    public String getGmsaCredentialSpecName() {
        return gmsaCredentialSpecName;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    /**
     * HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    public Boolean getHostProcess() {
        return hostProcess;
    }

    /**
     * HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    public void setHostProcess(Boolean hostProcess) {
        this.hostProcess = hostProcess;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    public String getRunAsUserName() {
        return runAsUserName;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    public void setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WindowsSecurityContextOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmsaCredentialSpec");
        sb.append('=');
        sb.append(((this.gmsaCredentialSpec == null)?"<null>":this.gmsaCredentialSpec));
        sb.append(',');
        sb.append("gmsaCredentialSpecName");
        sb.append('=');
        sb.append(((this.gmsaCredentialSpecName == null)?"<null>":this.gmsaCredentialSpecName));
        sb.append(',');
        sb.append("hostProcess");
        sb.append('=');
        sb.append(((this.hostProcess == null)?"<null>":this.hostProcess));
        sb.append(',');
        sb.append("runAsUserName");
        sb.append('=');
        sb.append(((this.runAsUserName == null)?"<null>":this.runAsUserName));
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
        result = ((result* 31)+((this.gmsaCredentialSpec == null)? 0 :this.gmsaCredentialSpec.hashCode()));
        result = ((result* 31)+((this.hostProcess == null)? 0 :this.hostProcess.hashCode()));
        result = ((result* 31)+((this.runAsUserName == null)? 0 :this.runAsUserName.hashCode()));
        result = ((result* 31)+((this.gmsaCredentialSpecName == null)? 0 :this.gmsaCredentialSpecName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WindowsSecurityContextOptions) == false) {
            return false;
        }
        WindowsSecurityContextOptions rhs = ((WindowsSecurityContextOptions) other);
        return (((((this.gmsaCredentialSpec == rhs.gmsaCredentialSpec)||((this.gmsaCredentialSpec!= null)&&this.gmsaCredentialSpec.equals(rhs.gmsaCredentialSpec)))&&((this.hostProcess == rhs.hostProcess)||((this.hostProcess!= null)&&this.hostProcess.equals(rhs.hostProcess))))&&((this.runAsUserName == rhs.runAsUserName)||((this.runAsUserName!= null)&&this.runAsUserName.equals(rhs.runAsUserName))))&&((this.gmsaCredentialSpecName == rhs.gmsaCredentialSpecName)||((this.gmsaCredentialSpecName!= null)&&this.gmsaCredentialSpecName.equals(rhs.gmsaCredentialSpecName))));
    }

}
