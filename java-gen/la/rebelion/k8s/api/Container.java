
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A single application container that you want to run within a pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "args",
    "command",
    "env",
    "envFrom",
    "image",
    "imagePullPolicy",
    "lifecycle",
    "livenessProbe",
    "name",
    "ports",
    "readinessProbe",
    "resources",
    "securityContext",
    "startupProbe",
    "stdin",
    "stdinOnce",
    "terminationMessagePath",
    "terminationMessagePolicy",
    "tty",
    "volumeDevices",
    "volumeMounts",
    "workingDir"
})
@Generated("jsonschema2pojo")
public class Container {

    /**
     * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    private List<String> args = new ArrayList<String>();
    /**
     * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    private List<String> command = new ArrayList<String>();
    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the container. Cannot be updated.")
    private List<EnvVar> env = new ArrayList<EnvVar>();
    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    @JsonPropertyDescription("List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
    private List<EnvFromSource> envFrom = new ArrayList<EnvFromSource>();
    /**
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
    private String image;
    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * 
     * 
     */
    @JsonProperty("imagePullPolicy")
    @JsonPropertyDescription("Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images\n\n")
    private String imagePullPolicy;
    /**
     * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
     * 
     */
    @JsonProperty("lifecycle")
    @JsonPropertyDescription("Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.")
    private Lifecycle lifecycle;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("livenessProbe")
    @JsonPropertyDescription("Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
    private Probe livenessProbe;
    /**
     * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
    private String name;
    /**
     * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    @JsonPropertyDescription("List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.")
    private List<ContainerPort> ports = new ArrayList<ContainerPort>();
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("readinessProbe")
    @JsonPropertyDescription("Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
    private Probe readinessProbe;
    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("ResourceRequirements describes the compute resource requirements.")
    private ResourceRequirements resources;
    /**
     * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")
    private SecurityContext securityContext;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("startupProbe")
    @JsonPropertyDescription("Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
    private Probe startupProbe;
    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    @JsonProperty("stdin")
    @JsonPropertyDescription("Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
    private Boolean stdin;
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    @JsonPropertyDescription("Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
    private Boolean stdinOnce;
    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    @JsonPropertyDescription("Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
    private String terminationMessagePath;
    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * 
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    @JsonPropertyDescription("Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.\n\n")
    private String terminationMessagePolicy;
    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    @JsonProperty("tty")
    @JsonPropertyDescription("Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
    private Boolean tty;
    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    @JsonProperty("volumeDevices")
    @JsonPropertyDescription("volumeDevices is the list of block devices to be used by the container.")
    private List<VolumeDevice> volumeDevices = new ArrayList<VolumeDevice>();
    /**
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("Pod volumes to mount into the container's filesystem. Cannot be updated.")
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    @JsonPropertyDescription("Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
    private String workingDir;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Container() {
    }

    /**
     * 
     * @param source
     */
    public Container(Container source) {
        super();
        this.args = source.args;
        this.command = source.command;
        this.env = source.env;
        this.envFrom = source.envFrom;
        this.image = source.image;
        this.imagePullPolicy = source.imagePullPolicy;
        this.lifecycle = source.lifecycle;
        this.livenessProbe = source.livenessProbe;
        this.name = source.name;
        this.ports = source.ports;
        this.readinessProbe = source.readinessProbe;
        this.resources = source.resources;
        this.securityContext = source.securityContext;
        this.startupProbe = source.startupProbe;
        this.stdin = source.stdin;
        this.stdinOnce = source.stdinOnce;
        this.terminationMessagePath = source.terminationMessagePath;
        this.terminationMessagePolicy = source.terminationMessagePolicy;
        this.tty = source.tty;
        this.volumeDevices = source.volumeDevices;
        this.volumeMounts = source.volumeMounts;
        this.workingDir = source.workingDir;
    }

    /**
     * 
     * @param volumeDevices
     * @param image
     * @param imagePullPolicy
     * @param livenessProbe
     * @param stdin
     * @param terminationMessagePolicy
     * @param terminationMessagePath
     * @param workingDir
     * @param resources
     * @param securityContext
     * @param startupProbe
     * @param env
     * @param ports
     * @param command
     * @param volumeMounts
     * @param args
     * @param lifecycle
     * @param name
     * @param tty
     * @param readinessProbe
     * @param stdinOnce
     * @param envFrom
     */
    public Container(List<String> args, List<String> command, List<EnvVar> env, List<EnvFromSource> envFrom, String image, String imagePullPolicy, Lifecycle lifecycle, Probe livenessProbe, String name, List<ContainerPort> ports, Probe readinessProbe, ResourceRequirements resources, SecurityContext securityContext, Probe startupProbe, Boolean stdin, Boolean stdinOnce, String terminationMessagePath, String terminationMessagePolicy, Boolean tty, List<VolumeDevice> volumeDevices, List<VolumeMount> volumeMounts, String workingDir) {
        super();
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<EnvVar> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    /**
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * 
     * 
     */
    @JsonProperty("imagePullPolicy")
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * 
     * 
     */
    @JsonProperty("imagePullPolicy")
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
     * 
     */
    @JsonProperty("lifecycle")
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
     * 
     */
    @JsonProperty("lifecycle")
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("livenessProbe")
    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("livenessProbe")
    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    public List<ContainerPort> getPorts() {
        return ports;
    }

    /**
     * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    public void setPorts(List<ContainerPort> ports) {
        this.ports = ports;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("readinessProbe")
    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("readinessProbe")
    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("startupProbe")
    public Probe getStartupProbe() {
        return startupProbe;
    }

    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    @JsonProperty("startupProbe")
    public void setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
    }

    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    @JsonProperty("stdin")
    public Boolean getStdin() {
        return stdin;
    }

    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    @JsonProperty("stdin")
    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * 
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * 
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    @JsonProperty("tty")
    public Boolean getTty() {
        return tty;
    }

    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    @JsonProperty("tty")
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    @JsonProperty("volumeDevices")
    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    @JsonProperty("volumeDevices")
    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    /**
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("args");
        sb.append('=');
        sb.append(((this.args == null)?"<null>":this.args));
        sb.append(',');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null)?"<null>":this.command));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("envFrom");
        sb.append('=');
        sb.append(((this.envFrom == null)?"<null>":this.envFrom));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("imagePullPolicy");
        sb.append('=');
        sb.append(((this.imagePullPolicy == null)?"<null>":this.imagePullPolicy));
        sb.append(',');
        sb.append("lifecycle");
        sb.append('=');
        sb.append(((this.lifecycle == null)?"<null>":this.lifecycle));
        sb.append(',');
        sb.append("livenessProbe");
        sb.append('=');
        sb.append(((this.livenessProbe == null)?"<null>":this.livenessProbe));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ports");
        sb.append('=');
        sb.append(((this.ports == null)?"<null>":this.ports));
        sb.append(',');
        sb.append("readinessProbe");
        sb.append('=');
        sb.append(((this.readinessProbe == null)?"<null>":this.readinessProbe));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("startupProbe");
        sb.append('=');
        sb.append(((this.startupProbe == null)?"<null>":this.startupProbe));
        sb.append(',');
        sb.append("stdin");
        sb.append('=');
        sb.append(((this.stdin == null)?"<null>":this.stdin));
        sb.append(',');
        sb.append("stdinOnce");
        sb.append('=');
        sb.append(((this.stdinOnce == null)?"<null>":this.stdinOnce));
        sb.append(',');
        sb.append("terminationMessagePath");
        sb.append('=');
        sb.append(((this.terminationMessagePath == null)?"<null>":this.terminationMessagePath));
        sb.append(',');
        sb.append("terminationMessagePolicy");
        sb.append('=');
        sb.append(((this.terminationMessagePolicy == null)?"<null>":this.terminationMessagePolicy));
        sb.append(',');
        sb.append("tty");
        sb.append('=');
        sb.append(((this.tty == null)?"<null>":this.tty));
        sb.append(',');
        sb.append("volumeDevices");
        sb.append('=');
        sb.append(((this.volumeDevices == null)?"<null>":this.volumeDevices));
        sb.append(',');
        sb.append("volumeMounts");
        sb.append('=');
        sb.append(((this.volumeMounts == null)?"<null>":this.volumeMounts));
        sb.append(',');
        sb.append("workingDir");
        sb.append('=');
        sb.append(((this.workingDir == null)?"<null>":this.workingDir));
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
        result = ((result* 31)+((this.volumeDevices == null)? 0 :this.volumeDevices.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.imagePullPolicy == null)? 0 :this.imagePullPolicy.hashCode()));
        result = ((result* 31)+((this.livenessProbe == null)? 0 :this.livenessProbe.hashCode()));
        result = ((result* 31)+((this.stdin == null)? 0 :this.stdin.hashCode()));
        result = ((result* 31)+((this.terminationMessagePolicy == null)? 0 :this.terminationMessagePolicy.hashCode()));
        result = ((result* 31)+((this.terminationMessagePath == null)? 0 :this.terminationMessagePath.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.startupProbe == null)? 0 :this.startupProbe.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.ports == null)? 0 :this.ports.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.lifecycle == null)? 0 :this.lifecycle.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tty == null)? 0 :this.tty.hashCode()));
        result = ((result* 31)+((this.readinessProbe == null)? 0 :this.readinessProbe.hashCode()));
        result = ((result* 31)+((this.stdinOnce == null)? 0 :this.stdinOnce.hashCode()));
        result = ((result* 31)+((this.envFrom == null)? 0 :this.envFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Container) == false) {
            return false;
        }
        Container rhs = ((Container) other);
        return (((((((((((((((((((((((this.volumeDevices == rhs.volumeDevices)||((this.volumeDevices!= null)&&this.volumeDevices.equals(rhs.volumeDevices)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.imagePullPolicy == rhs.imagePullPolicy)||((this.imagePullPolicy!= null)&&this.imagePullPolicy.equals(rhs.imagePullPolicy))))&&((this.livenessProbe == rhs.livenessProbe)||((this.livenessProbe!= null)&&this.livenessProbe.equals(rhs.livenessProbe))))&&((this.stdin == rhs.stdin)||((this.stdin!= null)&&this.stdin.equals(rhs.stdin))))&&((this.terminationMessagePolicy == rhs.terminationMessagePolicy)||((this.terminationMessagePolicy!= null)&&this.terminationMessagePolicy.equals(rhs.terminationMessagePolicy))))&&((this.terminationMessagePath == rhs.terminationMessagePath)||((this.terminationMessagePath!= null)&&this.terminationMessagePath.equals(rhs.terminationMessagePath))))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.startupProbe == rhs.startupProbe)||((this.startupProbe!= null)&&this.startupProbe.equals(rhs.startupProbe))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.ports == rhs.ports)||((this.ports!= null)&&this.ports.equals(rhs.ports))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.lifecycle == rhs.lifecycle)||((this.lifecycle!= null)&&this.lifecycle.equals(rhs.lifecycle))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tty == rhs.tty)||((this.tty!= null)&&this.tty.equals(rhs.tty))))&&((this.readinessProbe == rhs.readinessProbe)||((this.readinessProbe!= null)&&this.readinessProbe.equals(rhs.readinessProbe))))&&((this.stdinOnce == rhs.stdinOnce)||((this.stdinOnce!= null)&&this.stdinOnce.equals(rhs.stdinOnce))))&&((this.envFrom == rhs.envFrom)||((this.envFrom!= null)&&this.envFrom.equals(rhs.envFrom))));
    }

}
