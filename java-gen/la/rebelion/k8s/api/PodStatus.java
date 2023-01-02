
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conditions",
    "containerStatuses",
    "ephemeralContainerStatuses",
    "hostIP",
    "initContainerStatuses",
    "message",
    "nominatedNodeName",
    "phase",
    "podIP",
    "podIPs",
    "qosClass",
    "reason",
    "startTime"
})
@Generated("jsonschema2pojo")
public class PodStatus {

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
    private List<PodCondition> conditions = new ArrayList<PodCondition>();
    /**
     * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("containerStatuses")
    @JsonPropertyDescription("The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
    private List<ContainerStatus> containerStatuses = new ArrayList<ContainerStatus>();
    /**
     * Status for any ephemeral containers that have run in this pod.
     * 
     */
    @JsonProperty("ephemeralContainerStatuses")
    @JsonPropertyDescription("Status for any ephemeral containers that have run in this pod.")
    private List<ContainerStatus> ephemeralContainerStatuses = new ArrayList<ContainerStatus>();
    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    @JsonProperty("hostIP")
    @JsonPropertyDescription("IP address of the host to which the pod is assigned. Empty if not yet scheduled.")
    private String hostIP;
    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("initContainerStatuses")
    @JsonPropertyDescription("The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
    private List<ContainerStatus> initContainerStatuses = new ArrayList<ContainerStatus>();
    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("A human readable message indicating details about why the pod is in this condition.")
    private String message;
    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    @JsonProperty("nominatedNodeName")
    @JsonPropertyDescription("nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.")
    private String nominatedNodeName;
    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:\n\nPending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.\n\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase\n\n")
    private String phase;
    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    @JsonProperty("podIP")
    @JsonPropertyDescription("IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
    private String podIP;
    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    @JsonProperty("podIPs")
    @JsonPropertyDescription("podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.")
    private List<PodIP> podIPs = new ArrayList<PodIP>();
    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * 
     * 
     */
    @JsonProperty("qosClass")
    @JsonPropertyDescription("The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md\n\n")
    private String qosClass;
    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")
    private String reason;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    private Date startTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodStatus() {
    }

    /**
     * 
     * @param source
     */
    public PodStatus(PodStatus source) {
        super();
        this.conditions = source.conditions;
        this.containerStatuses = source.containerStatuses;
        this.ephemeralContainerStatuses = source.ephemeralContainerStatuses;
        this.hostIP = source.hostIP;
        this.initContainerStatuses = source.initContainerStatuses;
        this.message = source.message;
        this.nominatedNodeName = source.nominatedNodeName;
        this.phase = source.phase;
        this.podIP = source.podIP;
        this.podIPs = source.podIPs;
        this.qosClass = source.qosClass;
        this.reason = source.reason;
        this.startTime = source.startTime;
    }

    /**
     * 
     * @param phase
     * @param reason
     * @param containerStatuses
     * @param hostIP
     * @param nominatedNodeName
     * @param message
     * @param podIPs
     * @param podIP
     * @param ephemeralContainerStatuses
     * @param startTime
     * @param qosClass
     * @param conditions
     * @param initContainerStatuses
     */
    public PodStatus(List<PodCondition> conditions, List<ContainerStatus> containerStatuses, List<ContainerStatus> ephemeralContainerStatuses, String hostIP, List<ContainerStatus> initContainerStatuses, String message, String nominatedNodeName, String phase, String podIP, List<PodIP> podIPs, String qosClass, String reason, Date startTime) {
        super();
        this.conditions = conditions;
        this.containerStatuses = containerStatuses;
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        this.hostIP = hostIP;
        this.initContainerStatuses = initContainerStatuses;
        this.message = message;
        this.nominatedNodeName = nominatedNodeName;
        this.phase = phase;
        this.podIP = podIP;
        this.podIPs = podIPs;
        this.qosClass = qosClass;
        this.reason = reason;
        this.startTime = startTime;
    }

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @JsonProperty("conditions")
    public List<PodCondition> getConditions() {
        return conditions;
    }

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<PodCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("containerStatuses")
    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    /**
     * The list has one entry per container in the manifest. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("containerStatuses")
    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    /**
     * Status for any ephemeral containers that have run in this pod.
     * 
     */
    @JsonProperty("ephemeralContainerStatuses")
    public List<ContainerStatus> getEphemeralContainerStatuses() {
        return ephemeralContainerStatuses;
    }

    /**
     * Status for any ephemeral containers that have run in this pod.
     * 
     */
    @JsonProperty("ephemeralContainerStatuses")
    public void setEphemeralContainerStatuses(List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    }

    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    @JsonProperty("hostIP")
    public String getHostIP() {
        return hostIP;
    }

    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    @JsonProperty("hostIP")
    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("initContainerStatuses")
    public List<ContainerStatus> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @JsonProperty("initContainerStatuses")
    public void setInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
    }

    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    @JsonProperty("nominatedNodeName")
    public String getNominatedNodeName() {
        return nominatedNodeName;
    }

    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    @JsonProperty("nominatedNodeName")
    public void setNominatedNodeName(String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
    }

    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * 
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    @JsonProperty("podIP")
    public String getPodIP() {
        return podIP;
    }

    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    @JsonProperty("podIP")
    public void setPodIP(String podIP) {
        this.podIP = podIP;
    }

    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    @JsonProperty("podIPs")
    public List<PodIP> getPodIPs() {
        return podIPs;
    }

    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    @JsonProperty("podIPs")
    public void setPodIPs(List<PodIP> podIPs) {
        this.podIPs = podIPs;
    }

    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * 
     * 
     */
    @JsonProperty("qosClass")
    public String getQosClass() {
        return qosClass;
    }

    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * 
     * 
     */
    @JsonProperty("qosClass")
    public void setQosClass(String qosClass) {
        this.qosClass = qosClass;
    }

    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("containerStatuses");
        sb.append('=');
        sb.append(((this.containerStatuses == null)?"<null>":this.containerStatuses));
        sb.append(',');
        sb.append("ephemeralContainerStatuses");
        sb.append('=');
        sb.append(((this.ephemeralContainerStatuses == null)?"<null>":this.ephemeralContainerStatuses));
        sb.append(',');
        sb.append("hostIP");
        sb.append('=');
        sb.append(((this.hostIP == null)?"<null>":this.hostIP));
        sb.append(',');
        sb.append("initContainerStatuses");
        sb.append('=');
        sb.append(((this.initContainerStatuses == null)?"<null>":this.initContainerStatuses));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("nominatedNodeName");
        sb.append('=');
        sb.append(((this.nominatedNodeName == null)?"<null>":this.nominatedNodeName));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("podIP");
        sb.append('=');
        sb.append(((this.podIP == null)?"<null>":this.podIP));
        sb.append(',');
        sb.append("podIPs");
        sb.append('=');
        sb.append(((this.podIPs == null)?"<null>":this.podIPs));
        sb.append(',');
        sb.append("qosClass");
        sb.append('=');
        sb.append(((this.qosClass == null)?"<null>":this.qosClass));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
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
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.containerStatuses == null)? 0 :this.containerStatuses.hashCode()));
        result = ((result* 31)+((this.hostIP == null)? 0 :this.hostIP.hashCode()));
        result = ((result* 31)+((this.nominatedNodeName == null)? 0 :this.nominatedNodeName.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.podIPs == null)? 0 :this.podIPs.hashCode()));
        result = ((result* 31)+((this.podIP == null)? 0 :this.podIP.hashCode()));
        result = ((result* 31)+((this.ephemeralContainerStatuses == null)? 0 :this.ephemeralContainerStatuses.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.qosClass == null)? 0 :this.qosClass.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.initContainerStatuses == null)? 0 :this.initContainerStatuses.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodStatus) == false) {
            return false;
        }
        PodStatus rhs = ((PodStatus) other);
        return ((((((((((((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.containerStatuses == rhs.containerStatuses)||((this.containerStatuses!= null)&&this.containerStatuses.equals(rhs.containerStatuses))))&&((this.hostIP == rhs.hostIP)||((this.hostIP!= null)&&this.hostIP.equals(rhs.hostIP))))&&((this.nominatedNodeName == rhs.nominatedNodeName)||((this.nominatedNodeName!= null)&&this.nominatedNodeName.equals(rhs.nominatedNodeName))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.podIPs == rhs.podIPs)||((this.podIPs!= null)&&this.podIPs.equals(rhs.podIPs))))&&((this.podIP == rhs.podIP)||((this.podIP!= null)&&this.podIP.equals(rhs.podIP))))&&((this.ephemeralContainerStatuses == rhs.ephemeralContainerStatuses)||((this.ephemeralContainerStatuses!= null)&&this.ephemeralContainerStatuses.equals(rhs.ephemeralContainerStatuses))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.qosClass == rhs.qosClass)||((this.qosClass!= null)&&this.qosClass.equals(rhs.qosClass))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.initContainerStatuses == rhs.initContainerStatuses)||((this.initContainerStatuses!= null)&&this.initContainerStatuses.equals(rhs.initContainerStatuses))));
    }

}
