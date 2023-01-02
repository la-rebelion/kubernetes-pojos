
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodSpec is a description of a pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "activeDeadlineSeconds",
    "affinity",
    "automountServiceAccountToken",
    "containers",
    "dnsConfig",
    "dnsPolicy",
    "enableServiceLinks",
    "ephemeralContainers",
    "hostAliases",
    "hostIPC",
    "hostNetwork",
    "hostPID",
    "hostUsers",
    "hostname",
    "imagePullSecrets",
    "initContainers",
    "nodeName",
    "nodeSelector",
    "os",
    "overhead",
    "preemptionPolicy",
    "priority",
    "priorityClassName",
    "readinessGates",
    "resourceClaims",
    "restartPolicy",
    "runtimeClassName",
    "schedulerName",
    "schedulingGates",
    "securityContext",
    "serviceAccount",
    "serviceAccountName",
    "setHostnameAsFQDN",
    "shareProcessNamespace",
    "subdomain",
    "terminationGracePeriodSeconds",
    "tolerations",
    "topologySpreadConstraints",
    "volumes"
})
@Generated("jsonschema2pojo")
public class PodSpec {

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    @JsonPropertyDescription("Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
    private Integer activeDeadlineSeconds;
    /**
     * Affinity is a group of affinity scheduling rules.
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("Affinity is a group of affinity scheduling rules.")
    private Affinity affinity;
    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    @JsonPropertyDescription("AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
    private Boolean automountServiceAccountToken;
    /**
     * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("containers")
    @JsonPropertyDescription("List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
    private List<Container> containers = new ArrayList<Container>();
    /**
     * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    @JsonPropertyDescription("PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.")
    private PodDNSConfig dnsConfig;
    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * 
     * 
     * 
     */
    @JsonProperty("dnsPolicy")
    @JsonPropertyDescription("Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.\n\n")
    private String dnsPolicy;
    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    @JsonPropertyDescription("EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.")
    private Boolean enableServiceLinks;
    /**
     * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
     * 
     */
    @JsonProperty("ephemeralContainers")
    @JsonPropertyDescription("List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.")
    private List<EphemeralContainer> ephemeralContainers = new ArrayList<EphemeralContainer>();
    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    @JsonPropertyDescription("HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
    private List<HostAlias> hostAliases = new ArrayList<HostAlias>();
    /**
     * Use the host's ipc namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostIPC")
    @JsonPropertyDescription("Use the host's ipc namespace. Optional: Default to false.")
    private Boolean hostIPC;
    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     * 
     */
    @JsonProperty("hostNetwork")
    @JsonPropertyDescription("Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
    private Boolean hostNetwork;
    /**
     * Use the host's pid namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostPID")
    @JsonPropertyDescription("Use the host's pid namespace. Optional: Default to false.")
    private Boolean hostPID;
    /**
     * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
     * 
     */
    @JsonProperty("hostUsers")
    @JsonPropertyDescription("Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.")
    private Boolean hostUsers;
    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     * 
     */
    @JsonProperty("hostname")
    @JsonPropertyDescription("Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
    private String hostname;
    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @JsonProperty("imagePullSecrets")
    @JsonPropertyDescription("ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
    private List<LocalObjectReference> imagePullSecrets = new ArrayList<LocalObjectReference>();
    /**
     * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     * 
     */
    @JsonProperty("initContainers")
    @JsonPropertyDescription("List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
    private List<Container> initContainers = new ArrayList<Container>();
    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     * 
     */
    @JsonProperty("nodeName")
    @JsonPropertyDescription("NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
    private String nodeName;
    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    @JsonPropertyDescription("NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
    private NodeSelector__1 nodeSelector;
    /**
     * PodOS defines the OS parameters of a pod.
     * 
     */
    @JsonProperty("os")
    @JsonPropertyDescription("PodOS defines the OS parameters of a pod.")
    private PodOS os;
    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     * 
     */
    @JsonProperty("overhead")
    @JsonPropertyDescription("Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md")
    private Overhead overhead;
    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * 
     */
    @JsonProperty("preemptionPolicy")
    @JsonPropertyDescription("PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.")
    private String preemptionPolicy;
    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
    private Integer priority;
    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     * 
     */
    @JsonProperty("priorityClassName")
    @JsonPropertyDescription("If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
    private String priorityClassName;
    /**
     * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
     * 
     */
    @JsonProperty("readinessGates")
    @JsonPropertyDescription("If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates")
    private List<PodReadinessGate> readinessGates = new ArrayList<PodReadinessGate>();
    /**
     * ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("resourceClaims")
    @JsonPropertyDescription("ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.\n\nThis is an alpha field and requires enabling the DynamicResourceAllocation feature gate.\n\nThis field is immutable.")
    private List<PodResourceClaim> resourceClaims = new ArrayList<PodResourceClaim>();
    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * 
     * 
     * 
     */
    @JsonProperty("restartPolicy")
    @JsonPropertyDescription("Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy\n\n")
    private String restartPolicy;
    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     * 
     */
    @JsonProperty("runtimeClassName")
    @JsonPropertyDescription("RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class")
    private String runtimeClassName;
    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     * 
     */
    @JsonProperty("schedulerName")
    @JsonPropertyDescription("If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
    private String schedulerName;
    /**
     * SchedulingGates is an opaque list of values that if specified will block scheduling the pod. More info:  https://git.k8s.io/enhancements/keps/sig-scheduling/3521-pod-scheduling-readiness.
     * 
     * This is an alpha-level feature enabled by PodSchedulingReadiness feature gate.
     * 
     */
    @JsonProperty("schedulingGates")
    @JsonPropertyDescription("SchedulingGates is an opaque list of values that if specified will block scheduling the pod. More info:  https://git.k8s.io/enhancements/keps/sig-scheduling/3521-pod-scheduling-readiness.\n\nThis is an alpha-level feature enabled by PodSchedulingReadiness feature gate.")
    private List<PodSchedulingGate> schedulingGates = new ArrayList<PodSchedulingGate>();
    /**
     * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
    private PodSecurityContext securityContext;
    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     * 
     */
    @JsonProperty("serviceAccount")
    @JsonPropertyDescription("DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
    private String serviceAccount;
    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     * 
     */
    @JsonProperty("serviceAccountName")
    @JsonPropertyDescription("ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
    private String serviceAccountName;
    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     * 
     */
    @JsonProperty("setHostnameAsFQDN")
    @JsonPropertyDescription("If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.")
    private Boolean setHostnameAsFQDN;
    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     * 
     */
    @JsonProperty("shareProcessNamespace")
    @JsonPropertyDescription("Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.")
    private Boolean shareProcessNamespace;
    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     * 
     */
    @JsonProperty("subdomain")
    @JsonPropertyDescription("If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
    private String subdomain;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    @JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
    private Integer terminationGracePeriodSeconds;
    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    @JsonPropertyDescription("If specified, the pod's tolerations.")
    private List<Toleration> tolerations = new ArrayList<Toleration>();
    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    @JsonPropertyDescription("TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.")
    private List<TopologySpreadConstraint> topologySpreadConstraints = new ArrayList<TopologySpreadConstraint>();
    /**
     * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
     * 
     */
    @JsonProperty("volumes")
    @JsonPropertyDescription("List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
    private List<Volume> volumes = new ArrayList<Volume>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSpec() {
    }

    /**
     * 
     * @param source
     */
    public PodSpec(PodSpec source) {
        super();
        this.activeDeadlineSeconds = source.activeDeadlineSeconds;
        this.affinity = source.affinity;
        this.automountServiceAccountToken = source.automountServiceAccountToken;
        this.containers = source.containers;
        this.dnsConfig = source.dnsConfig;
        this.dnsPolicy = source.dnsPolicy;
        this.enableServiceLinks = source.enableServiceLinks;
        this.ephemeralContainers = source.ephemeralContainers;
        this.hostAliases = source.hostAliases;
        this.hostIPC = source.hostIPC;
        this.hostNetwork = source.hostNetwork;
        this.hostPID = source.hostPID;
        this.hostUsers = source.hostUsers;
        this.hostname = source.hostname;
        this.imagePullSecrets = source.imagePullSecrets;
        this.initContainers = source.initContainers;
        this.nodeName = source.nodeName;
        this.nodeSelector = source.nodeSelector;
        this.os = source.os;
        this.overhead = source.overhead;
        this.preemptionPolicy = source.preemptionPolicy;
        this.priority = source.priority;
        this.priorityClassName = source.priorityClassName;
        this.readinessGates = source.readinessGates;
        this.resourceClaims = source.resourceClaims;
        this.restartPolicy = source.restartPolicy;
        this.runtimeClassName = source.runtimeClassName;
        this.schedulerName = source.schedulerName;
        this.schedulingGates = source.schedulingGates;
        this.securityContext = source.securityContext;
        this.serviceAccount = source.serviceAccount;
        this.serviceAccountName = source.serviceAccountName;
        this.setHostnameAsFQDN = source.setHostnameAsFQDN;
        this.shareProcessNamespace = source.shareProcessNamespace;
        this.subdomain = source.subdomain;
        this.terminationGracePeriodSeconds = source.terminationGracePeriodSeconds;
        this.tolerations = source.tolerations;
        this.topologySpreadConstraints = source.topologySpreadConstraints;
        this.volumes = source.volumes;
    }

    /**
     * 
     * @param dnsPolicy
     * @param nodeName
     * @param terminationGracePeriodSeconds
     * @param dnsConfig
     * @param hostNetwork
     * @param readinessGates
     * @param serviceAccountName
     * @param imagePullSecrets
     * @param priorityClassName
     * @param hostAliases
     * @param securityContext
     * @param preemptionPolicy
     * @param nodeSelector
     * @param hostname
     * @param runtimeClassName
     * @param tolerations
     * @param automountServiceAccountToken
     * @param schedulingGates
     * @param schedulerName
     * @param activeDeadlineSeconds
     * @param os
     * @param setHostnameAsFQDN
     * @param enableServiceLinks
     * @param overhead
     * @param hostIPC
     * @param topologySpreadConstraints
     * @param volumes
     * @param ephemeralContainers
     * @param serviceAccount
     * @param priority
     * @param restartPolicy
     * @param shareProcessNamespace
     * @param hostUsers
     * @param resourceClaims
     * @param subdomain
     * @param containers
     * @param initContainers
     * @param affinity
     * @param hostPID
     */
    public PodSpec(Integer activeDeadlineSeconds, Affinity affinity, Boolean automountServiceAccountToken, List<Container> containers, PodDNSConfig dnsConfig, String dnsPolicy, Boolean enableServiceLinks, List<EphemeralContainer> ephemeralContainers, List<HostAlias> hostAliases, Boolean hostIPC, Boolean hostNetwork, Boolean hostPID, Boolean hostUsers, String hostname, List<LocalObjectReference> imagePullSecrets, List<Container> initContainers, String nodeName, NodeSelector__1 nodeSelector, PodOS os, Overhead overhead, String preemptionPolicy, Integer priority, String priorityClassName, List<PodReadinessGate> readinessGates, List<PodResourceClaim> resourceClaims, String restartPolicy, String runtimeClassName, String schedulerName, List<PodSchedulingGate> schedulingGates, PodSecurityContext securityContext, String serviceAccount, String serviceAccountName, Boolean setHostnameAsFQDN, Boolean shareProcessNamespace, String subdomain, Integer terminationGracePeriodSeconds, List<Toleration> tolerations, List<TopologySpreadConstraint> topologySpreadConstraints, List<Volume> volumes) {
        super();
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.affinity = affinity;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.containers = containers;
        this.dnsConfig = dnsConfig;
        this.dnsPolicy = dnsPolicy;
        this.enableServiceLinks = enableServiceLinks;
        this.ephemeralContainers = ephemeralContainers;
        this.hostAliases = hostAliases;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostUsers = hostUsers;
        this.hostname = hostname;
        this.imagePullSecrets = imagePullSecrets;
        this.initContainers = initContainers;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.os = os;
        this.overhead = overhead;
        this.preemptionPolicy = preemptionPolicy;
        this.priority = priority;
        this.priorityClassName = priorityClassName;
        this.readinessGates = readinessGates;
        this.resourceClaims = resourceClaims;
        this.restartPolicy = restartPolicy;
        this.runtimeClassName = runtimeClassName;
        this.schedulerName = schedulerName;
        this.schedulingGates = schedulingGates;
        this.securityContext = securityContext;
        this.serviceAccount = serviceAccount;
        this.serviceAccountName = serviceAccountName;
        this.setHostnameAsFQDN = setHostnameAsFQDN;
        this.shareProcessNamespace = shareProcessNamespace;
        this.subdomain = subdomain;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.tolerations = tolerations;
        this.topologySpreadConstraints = topologySpreadConstraints;
        this.volumes = volumes;
    }

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * Affinity is a group of affinity scheduling rules.
     * 
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * Affinity is a group of affinity scheduling rules.
     * 
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    /**
     * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("containers")
    public List<Container> getContainers() {
        return containers;
    }

    /**
     * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("containers")
    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    /**
     * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    public PodDNSConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    public void setDnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * 
     * 
     * 
     */
    @JsonProperty("dnsPolicy")
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * 
     * 
     * 
     */
    @JsonProperty("dnsPolicy")
    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    /**
     * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
     * 
     */
    @JsonProperty("ephemeralContainers")
    public List<EphemeralContainer> getEphemeralContainers() {
        return ephemeralContainers;
    }

    /**
     * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
     * 
     */
    @JsonProperty("ephemeralContainers")
    public void setEphemeralContainers(List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    public void setHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
    }

    /**
     * Use the host's ipc namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostIPC")
    public Boolean getHostIPC() {
        return hostIPC;
    }

    /**
     * Use the host's ipc namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostIPC")
    public void setHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     * 
     */
    @JsonProperty("hostNetwork")
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     * 
     */
    @JsonProperty("hostNetwork")
    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * Use the host's pid namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostPID")
    public Boolean getHostPID() {
        return hostPID;
    }

    /**
     * Use the host's pid namespace. Optional: Default to false.
     * 
     */
    @JsonProperty("hostPID")
    public void setHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
    }

    /**
     * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
     * 
     */
    @JsonProperty("hostUsers")
    public Boolean getHostUsers() {
        return hostUsers;
    }

    /**
     * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
     * 
     */
    @JsonProperty("hostUsers")
    public void setHostUsers(Boolean hostUsers) {
        this.hostUsers = hostUsers;
    }

    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     * 
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     * 
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @JsonProperty("imagePullSecrets")
    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @JsonProperty("imagePullSecrets")
    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     * 
     */
    @JsonProperty("initContainers")
    public List<Container> getInitContainers() {
        return initContainers;
    }

    /**
     * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     * 
     */
    @JsonProperty("initContainers")
    public void setInitContainers(List<Container> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     * 
     */
    @JsonProperty("nodeName")
    public String getNodeName() {
        return nodeName;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     * 
     */
    @JsonProperty("nodeName")
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    public NodeSelector__1 getNodeSelector() {
        return nodeSelector;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    public void setNodeSelector(NodeSelector__1 nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * PodOS defines the OS parameters of a pod.
     * 
     */
    @JsonProperty("os")
    public PodOS getOs() {
        return os;
    }

    /**
     * PodOS defines the OS parameters of a pod.
     * 
     */
    @JsonProperty("os")
    public void setOs(PodOS os) {
        this.os = os;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     * 
     */
    @JsonProperty("overhead")
    public Overhead getOverhead() {
        return overhead;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     * 
     */
    @JsonProperty("overhead")
    public void setOverhead(Overhead overhead) {
        this.overhead = overhead;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * 
     */
    @JsonProperty("preemptionPolicy")
    public String getPreemptionPolicy() {
        return preemptionPolicy;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * 
     */
    @JsonProperty("preemptionPolicy")
    public void setPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
    }

    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     * 
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     * 
     */
    @JsonProperty("priorityClassName")
    public String getPriorityClassName() {
        return priorityClassName;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     * 
     */
    @JsonProperty("priorityClassName")
    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
     * 
     */
    @JsonProperty("readinessGates")
    public List<PodReadinessGate> getReadinessGates() {
        return readinessGates;
    }

    /**
     * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
     * 
     */
    @JsonProperty("readinessGates")
    public void setReadinessGates(List<PodReadinessGate> readinessGates) {
        this.readinessGates = readinessGates;
    }

    /**
     * ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("resourceClaims")
    public List<PodResourceClaim> getResourceClaims() {
        return resourceClaims;
    }

    /**
     * ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable.
     * 
     */
    @JsonProperty("resourceClaims")
    public void setResourceClaims(List<PodResourceClaim> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * 
     * 
     * 
     */
    @JsonProperty("restartPolicy")
    public String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * 
     * 
     * 
     */
    @JsonProperty("restartPolicy")
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     * 
     */
    @JsonProperty("runtimeClassName")
    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     * 
     */
    @JsonProperty("runtimeClassName")
    public void setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     * 
     */
    @JsonProperty("schedulerName")
    public String getSchedulerName() {
        return schedulerName;
    }

    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     * 
     */
    @JsonProperty("schedulerName")
    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * SchedulingGates is an opaque list of values that if specified will block scheduling the pod. More info:  https://git.k8s.io/enhancements/keps/sig-scheduling/3521-pod-scheduling-readiness.
     * 
     * This is an alpha-level feature enabled by PodSchedulingReadiness feature gate.
     * 
     */
    @JsonProperty("schedulingGates")
    public List<PodSchedulingGate> getSchedulingGates() {
        return schedulingGates;
    }

    /**
     * SchedulingGates is an opaque list of values that if specified will block scheduling the pod. More info:  https://git.k8s.io/enhancements/keps/sig-scheduling/3521-pod-scheduling-readiness.
     * 
     * This is an alpha-level feature enabled by PodSchedulingReadiness feature gate.
     * 
     */
    @JsonProperty("schedulingGates")
    public void setSchedulingGates(List<PodSchedulingGate> schedulingGates) {
        this.schedulingGates = schedulingGates;
    }

    /**
     * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
     * 
     */
    @JsonProperty("securityContext")
    public PodSecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     * 
     */
    @JsonProperty("serviceAccount")
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     * 
     */
    @JsonProperty("serviceAccount")
    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     * 
     */
    @JsonProperty("serviceAccountName")
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     * 
     */
    @JsonProperty("serviceAccountName")
    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     * 
     */
    @JsonProperty("setHostnameAsFQDN")
    public Boolean getSetHostnameAsFQDN() {
        return setHostnameAsFQDN;
    }

    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     * 
     */
    @JsonProperty("setHostnameAsFQDN")
    public void setSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
        this.setHostnameAsFQDN = setHostnameAsFQDN;
    }

    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     * 
     */
    @JsonProperty("shareProcessNamespace")
    public Boolean getShareProcessNamespace() {
        return shareProcessNamespace;
    }

    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     * 
     */
    @JsonProperty("shareProcessNamespace")
    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
    }

    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     * 
     */
    @JsonProperty("subdomain")
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     * 
     */
    @JsonProperty("subdomain")
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    public void setTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
     * 
     */
    @JsonProperty("volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
     * 
     */
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeDeadlineSeconds");
        sb.append('=');
        sb.append(((this.activeDeadlineSeconds == null)?"<null>":this.activeDeadlineSeconds));
        sb.append(',');
        sb.append("affinity");
        sb.append('=');
        sb.append(((this.affinity == null)?"<null>":this.affinity));
        sb.append(',');
        sb.append("automountServiceAccountToken");
        sb.append('=');
        sb.append(((this.automountServiceAccountToken == null)?"<null>":this.automountServiceAccountToken));
        sb.append(',');
        sb.append("containers");
        sb.append('=');
        sb.append(((this.containers == null)?"<null>":this.containers));
        sb.append(',');
        sb.append("dnsConfig");
        sb.append('=');
        sb.append(((this.dnsConfig == null)?"<null>":this.dnsConfig));
        sb.append(',');
        sb.append("dnsPolicy");
        sb.append('=');
        sb.append(((this.dnsPolicy == null)?"<null>":this.dnsPolicy));
        sb.append(',');
        sb.append("enableServiceLinks");
        sb.append('=');
        sb.append(((this.enableServiceLinks == null)?"<null>":this.enableServiceLinks));
        sb.append(',');
        sb.append("ephemeralContainers");
        sb.append('=');
        sb.append(((this.ephemeralContainers == null)?"<null>":this.ephemeralContainers));
        sb.append(',');
        sb.append("hostAliases");
        sb.append('=');
        sb.append(((this.hostAliases == null)?"<null>":this.hostAliases));
        sb.append(',');
        sb.append("hostIPC");
        sb.append('=');
        sb.append(((this.hostIPC == null)?"<null>":this.hostIPC));
        sb.append(',');
        sb.append("hostNetwork");
        sb.append('=');
        sb.append(((this.hostNetwork == null)?"<null>":this.hostNetwork));
        sb.append(',');
        sb.append("hostPID");
        sb.append('=');
        sb.append(((this.hostPID == null)?"<null>":this.hostPID));
        sb.append(',');
        sb.append("hostUsers");
        sb.append('=');
        sb.append(((this.hostUsers == null)?"<null>":this.hostUsers));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("imagePullSecrets");
        sb.append('=');
        sb.append(((this.imagePullSecrets == null)?"<null>":this.imagePullSecrets));
        sb.append(',');
        sb.append("initContainers");
        sb.append('=');
        sb.append(((this.initContainers == null)?"<null>":this.initContainers));
        sb.append(',');
        sb.append("nodeName");
        sb.append('=');
        sb.append(((this.nodeName == null)?"<null>":this.nodeName));
        sb.append(',');
        sb.append("nodeSelector");
        sb.append('=');
        sb.append(((this.nodeSelector == null)?"<null>":this.nodeSelector));
        sb.append(',');
        sb.append("os");
        sb.append('=');
        sb.append(((this.os == null)?"<null>":this.os));
        sb.append(',');
        sb.append("overhead");
        sb.append('=');
        sb.append(((this.overhead == null)?"<null>":this.overhead));
        sb.append(',');
        sb.append("preemptionPolicy");
        sb.append('=');
        sb.append(((this.preemptionPolicy == null)?"<null>":this.preemptionPolicy));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("priorityClassName");
        sb.append('=');
        sb.append(((this.priorityClassName == null)?"<null>":this.priorityClassName));
        sb.append(',');
        sb.append("readinessGates");
        sb.append('=');
        sb.append(((this.readinessGates == null)?"<null>":this.readinessGates));
        sb.append(',');
        sb.append("resourceClaims");
        sb.append('=');
        sb.append(((this.resourceClaims == null)?"<null>":this.resourceClaims));
        sb.append(',');
        sb.append("restartPolicy");
        sb.append('=');
        sb.append(((this.restartPolicy == null)?"<null>":this.restartPolicy));
        sb.append(',');
        sb.append("runtimeClassName");
        sb.append('=');
        sb.append(((this.runtimeClassName == null)?"<null>":this.runtimeClassName));
        sb.append(',');
        sb.append("schedulerName");
        sb.append('=');
        sb.append(((this.schedulerName == null)?"<null>":this.schedulerName));
        sb.append(',');
        sb.append("schedulingGates");
        sb.append('=');
        sb.append(((this.schedulingGates == null)?"<null>":this.schedulingGates));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("serviceAccount");
        sb.append('=');
        sb.append(((this.serviceAccount == null)?"<null>":this.serviceAccount));
        sb.append(',');
        sb.append("serviceAccountName");
        sb.append('=');
        sb.append(((this.serviceAccountName == null)?"<null>":this.serviceAccountName));
        sb.append(',');
        sb.append("setHostnameAsFQDN");
        sb.append('=');
        sb.append(((this.setHostnameAsFQDN == null)?"<null>":this.setHostnameAsFQDN));
        sb.append(',');
        sb.append("shareProcessNamespace");
        sb.append('=');
        sb.append(((this.shareProcessNamespace == null)?"<null>":this.shareProcessNamespace));
        sb.append(',');
        sb.append("subdomain");
        sb.append('=');
        sb.append(((this.subdomain == null)?"<null>":this.subdomain));
        sb.append(',');
        sb.append("terminationGracePeriodSeconds");
        sb.append('=');
        sb.append(((this.terminationGracePeriodSeconds == null)?"<null>":this.terminationGracePeriodSeconds));
        sb.append(',');
        sb.append("tolerations");
        sb.append('=');
        sb.append(((this.tolerations == null)?"<null>":this.tolerations));
        sb.append(',');
        sb.append("topologySpreadConstraints");
        sb.append('=');
        sb.append(((this.topologySpreadConstraints == null)?"<null>":this.topologySpreadConstraints));
        sb.append(',');
        sb.append("volumes");
        sb.append('=');
        sb.append(((this.volumes == null)?"<null>":this.volumes));
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
        result = ((result* 31)+((this.dnsPolicy == null)? 0 :this.dnsPolicy.hashCode()));
        result = ((result* 31)+((this.nodeName == null)? 0 :this.nodeName.hashCode()));
        result = ((result* 31)+((this.terminationGracePeriodSeconds == null)? 0 :this.terminationGracePeriodSeconds.hashCode()));
        result = ((result* 31)+((this.dnsConfig == null)? 0 :this.dnsConfig.hashCode()));
        result = ((result* 31)+((this.hostNetwork == null)? 0 :this.hostNetwork.hashCode()));
        result = ((result* 31)+((this.readinessGates == null)? 0 :this.readinessGates.hashCode()));
        result = ((result* 31)+((this.serviceAccountName == null)? 0 :this.serviceAccountName.hashCode()));
        result = ((result* 31)+((this.imagePullSecrets == null)? 0 :this.imagePullSecrets.hashCode()));
        result = ((result* 31)+((this.priorityClassName == null)? 0 :this.priorityClassName.hashCode()));
        result = ((result* 31)+((this.hostAliases == null)? 0 :this.hostAliases.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.preemptionPolicy == null)? 0 :this.preemptionPolicy.hashCode()));
        result = ((result* 31)+((this.nodeSelector == null)? 0 :this.nodeSelector.hashCode()));
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.runtimeClassName == null)? 0 :this.runtimeClassName.hashCode()));
        result = ((result* 31)+((this.tolerations == null)? 0 :this.tolerations.hashCode()));
        result = ((result* 31)+((this.automountServiceAccountToken == null)? 0 :this.automountServiceAccountToken.hashCode()));
        result = ((result* 31)+((this.schedulingGates == null)? 0 :this.schedulingGates.hashCode()));
        result = ((result* 31)+((this.schedulerName == null)? 0 :this.schedulerName.hashCode()));
        result = ((result* 31)+((this.activeDeadlineSeconds == null)? 0 :this.activeDeadlineSeconds.hashCode()));
        result = ((result* 31)+((this.os == null)? 0 :this.os.hashCode()));
        result = ((result* 31)+((this.setHostnameAsFQDN == null)? 0 :this.setHostnameAsFQDN.hashCode()));
        result = ((result* 31)+((this.enableServiceLinks == null)? 0 :this.enableServiceLinks.hashCode()));
        result = ((result* 31)+((this.overhead == null)? 0 :this.overhead.hashCode()));
        result = ((result* 31)+((this.hostIPC == null)? 0 :this.hostIPC.hashCode()));
        result = ((result* 31)+((this.topologySpreadConstraints == null)? 0 :this.topologySpreadConstraints.hashCode()));
        result = ((result* 31)+((this.volumes == null)? 0 :this.volumes.hashCode()));
        result = ((result* 31)+((this.ephemeralContainers == null)? 0 :this.ephemeralContainers.hashCode()));
        result = ((result* 31)+((this.serviceAccount == null)? 0 :this.serviceAccount.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.restartPolicy == null)? 0 :this.restartPolicy.hashCode()));
        result = ((result* 31)+((this.shareProcessNamespace == null)? 0 :this.shareProcessNamespace.hashCode()));
        result = ((result* 31)+((this.hostUsers == null)? 0 :this.hostUsers.hashCode()));
        result = ((result* 31)+((this.resourceClaims == null)? 0 :this.resourceClaims.hashCode()));
        result = ((result* 31)+((this.subdomain == null)? 0 :this.subdomain.hashCode()));
        result = ((result* 31)+((this.containers == null)? 0 :this.containers.hashCode()));
        result = ((result* 31)+((this.initContainers == null)? 0 :this.initContainers.hashCode()));
        result = ((result* 31)+((this.affinity == null)? 0 :this.affinity.hashCode()));
        result = ((result* 31)+((this.hostPID == null)? 0 :this.hostPID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodSpec) == false) {
            return false;
        }
        PodSpec rhs = ((PodSpec) other);
        return ((((((((((((((((((((((((((((((((((((((((this.dnsPolicy == rhs.dnsPolicy)||((this.dnsPolicy!= null)&&this.dnsPolicy.equals(rhs.dnsPolicy)))&&((this.nodeName == rhs.nodeName)||((this.nodeName!= null)&&this.nodeName.equals(rhs.nodeName))))&&((this.terminationGracePeriodSeconds == rhs.terminationGracePeriodSeconds)||((this.terminationGracePeriodSeconds!= null)&&this.terminationGracePeriodSeconds.equals(rhs.terminationGracePeriodSeconds))))&&((this.dnsConfig == rhs.dnsConfig)||((this.dnsConfig!= null)&&this.dnsConfig.equals(rhs.dnsConfig))))&&((this.hostNetwork == rhs.hostNetwork)||((this.hostNetwork!= null)&&this.hostNetwork.equals(rhs.hostNetwork))))&&((this.readinessGates == rhs.readinessGates)||((this.readinessGates!= null)&&this.readinessGates.equals(rhs.readinessGates))))&&((this.serviceAccountName == rhs.serviceAccountName)||((this.serviceAccountName!= null)&&this.serviceAccountName.equals(rhs.serviceAccountName))))&&((this.imagePullSecrets == rhs.imagePullSecrets)||((this.imagePullSecrets!= null)&&this.imagePullSecrets.equals(rhs.imagePullSecrets))))&&((this.priorityClassName == rhs.priorityClassName)||((this.priorityClassName!= null)&&this.priorityClassName.equals(rhs.priorityClassName))))&&((this.hostAliases == rhs.hostAliases)||((this.hostAliases!= null)&&this.hostAliases.equals(rhs.hostAliases))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.preemptionPolicy == rhs.preemptionPolicy)||((this.preemptionPolicy!= null)&&this.preemptionPolicy.equals(rhs.preemptionPolicy))))&&((this.nodeSelector == rhs.nodeSelector)||((this.nodeSelector!= null)&&this.nodeSelector.equals(rhs.nodeSelector))))&&((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname))))&&((this.runtimeClassName == rhs.runtimeClassName)||((this.runtimeClassName!= null)&&this.runtimeClassName.equals(rhs.runtimeClassName))))&&((this.tolerations == rhs.tolerations)||((this.tolerations!= null)&&this.tolerations.equals(rhs.tolerations))))&&((this.automountServiceAccountToken == rhs.automountServiceAccountToken)||((this.automountServiceAccountToken!= null)&&this.automountServiceAccountToken.equals(rhs.automountServiceAccountToken))))&&((this.schedulingGates == rhs.schedulingGates)||((this.schedulingGates!= null)&&this.schedulingGates.equals(rhs.schedulingGates))))&&((this.schedulerName == rhs.schedulerName)||((this.schedulerName!= null)&&this.schedulerName.equals(rhs.schedulerName))))&&((this.activeDeadlineSeconds == rhs.activeDeadlineSeconds)||((this.activeDeadlineSeconds!= null)&&this.activeDeadlineSeconds.equals(rhs.activeDeadlineSeconds))))&&((this.os == rhs.os)||((this.os!= null)&&this.os.equals(rhs.os))))&&((this.setHostnameAsFQDN == rhs.setHostnameAsFQDN)||((this.setHostnameAsFQDN!= null)&&this.setHostnameAsFQDN.equals(rhs.setHostnameAsFQDN))))&&((this.enableServiceLinks == rhs.enableServiceLinks)||((this.enableServiceLinks!= null)&&this.enableServiceLinks.equals(rhs.enableServiceLinks))))&&((this.overhead == rhs.overhead)||((this.overhead!= null)&&this.overhead.equals(rhs.overhead))))&&((this.hostIPC == rhs.hostIPC)||((this.hostIPC!= null)&&this.hostIPC.equals(rhs.hostIPC))))&&((this.topologySpreadConstraints == rhs.topologySpreadConstraints)||((this.topologySpreadConstraints!= null)&&this.topologySpreadConstraints.equals(rhs.topologySpreadConstraints))))&&((this.volumes == rhs.volumes)||((this.volumes!= null)&&this.volumes.equals(rhs.volumes))))&&((this.ephemeralContainers == rhs.ephemeralContainers)||((this.ephemeralContainers!= null)&&this.ephemeralContainers.equals(rhs.ephemeralContainers))))&&((this.serviceAccount == rhs.serviceAccount)||((this.serviceAccount!= null)&&this.serviceAccount.equals(rhs.serviceAccount))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.restartPolicy == rhs.restartPolicy)||((this.restartPolicy!= null)&&this.restartPolicy.equals(rhs.restartPolicy))))&&((this.shareProcessNamespace == rhs.shareProcessNamespace)||((this.shareProcessNamespace!= null)&&this.shareProcessNamespace.equals(rhs.shareProcessNamespace))))&&((this.hostUsers == rhs.hostUsers)||((this.hostUsers!= null)&&this.hostUsers.equals(rhs.hostUsers))))&&((this.resourceClaims == rhs.resourceClaims)||((this.resourceClaims!= null)&&this.resourceClaims.equals(rhs.resourceClaims))))&&((this.subdomain == rhs.subdomain)||((this.subdomain!= null)&&this.subdomain.equals(rhs.subdomain))))&&((this.containers == rhs.containers)||((this.containers!= null)&&this.containers.equals(rhs.containers))))&&((this.initContainers == rhs.initContainers)||((this.initContainers!= null)&&this.initContainers.equals(rhs.initContainers))))&&((this.affinity == rhs.affinity)||((this.affinity!= null)&&this.affinity.equals(rhs.affinity))))&&((this.hostPID == rhs.hostPID)||((this.hostPID!= null)&&this.hostPID.equals(rhs.hostPID))));
    }

}
