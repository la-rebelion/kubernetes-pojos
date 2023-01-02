
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerStatus contains details for the current status of this container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerID",
    "image",
    "imageID",
    "lastState",
    "name",
    "ready",
    "restartCount",
    "started",
    "state"
})
@Generated("jsonschema2pojo")
public class ContainerStatus {

    /**
     * Container's ID in the format '<type>://<container_id>'.
     * 
     */
    @JsonProperty("containerID")
    @JsonPropertyDescription("Container's ID in the format '<type>://<container_id>'.")
    private String containerID;
    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * (Required)
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.")
    private String image;
    /**
     * ImageID of the container's image.
     * (Required)
     * 
     */
    @JsonProperty("imageID")
    @JsonPropertyDescription("ImageID of the container's image.")
    private String imageID;
    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("lastState")
    @JsonPropertyDescription("ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")
    private ContainerState lastState;
    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
    private String name;
    /**
     * Specifies whether the container has passed its readiness probe.
     * (Required)
     * 
     */
    @JsonProperty("ready")
    @JsonPropertyDescription("Specifies whether the container has passed its readiness probe.")
    private Boolean ready;
    /**
     * The number of times the container has been restarted.
     * (Required)
     * 
     */
    @JsonProperty("restartCount")
    @JsonPropertyDescription("The number of times the container has been restarted.")
    private Integer restartCount;
    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @JsonProperty("started")
    @JsonPropertyDescription("Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.")
    private Boolean started;
    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")
    private ContainerState state;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerStatus() {
    }

    /**
     * 
     * @param source
     */
    public ContainerStatus(ContainerStatus source) {
        super();
        this.containerID = source.containerID;
        this.image = source.image;
        this.imageID = source.imageID;
        this.lastState = source.lastState;
        this.name = source.name;
        this.ready = source.ready;
        this.restartCount = source.restartCount;
        this.started = source.started;
        this.state = source.state;
    }

    /**
     * 
     * @param image
     * @param imageID
     * @param restartCount
     * @param ready
     * @param name
     * @param started
     * @param state
     * @param containerID
     * @param lastState
     */
    public ContainerStatus(String containerID, String image, String imageID, ContainerState lastState, String name, Boolean ready, Integer restartCount, Boolean started, ContainerState state) {
        super();
        this.containerID = containerID;
        this.image = image;
        this.imageID = imageID;
        this.lastState = lastState;
        this.name = name;
        this.ready = ready;
        this.restartCount = restartCount;
        this.started = started;
        this.state = state;
    }

    /**
     * Container's ID in the format '<type>://<container_id>'.
     * 
     */
    @JsonProperty("containerID")
    public String getContainerID() {
        return containerID;
    }

    /**
     * Container's ID in the format '<type>://<container_id>'.
     * 
     */
    @JsonProperty("containerID")
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ImageID of the container's image.
     * (Required)
     * 
     */
    @JsonProperty("imageID")
    public String getImageID() {
        return imageID;
    }

    /**
     * ImageID of the container's image.
     * (Required)
     * 
     */
    @JsonProperty("imageID")
    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("lastState")
    public ContainerState getLastState() {
        return lastState;
    }

    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("lastState")
    public void setLastState(ContainerState lastState) {
        this.lastState = lastState;
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     * (Required)
     * 
     */
    @JsonProperty("ready")
    public Boolean getReady() {
        return ready;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     * (Required)
     * 
     */
    @JsonProperty("ready")
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    /**
     * The number of times the container has been restarted.
     * (Required)
     * 
     */
    @JsonProperty("restartCount")
    public Integer getRestartCount() {
        return restartCount;
    }

    /**
     * The number of times the container has been restarted.
     * (Required)
     * 
     */
    @JsonProperty("restartCount")
    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @JsonProperty("started")
    public Boolean getStarted() {
        return started;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @JsonProperty("started")
    public void setStarted(Boolean started) {
        this.started = started;
    }

    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("state")
    public ContainerState getState() {
        return state;
    }

    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    @JsonProperty("state")
    public void setState(ContainerState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerID");
        sb.append('=');
        sb.append(((this.containerID == null)?"<null>":this.containerID));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("imageID");
        sb.append('=');
        sb.append(((this.imageID == null)?"<null>":this.imageID));
        sb.append(',');
        sb.append("lastState");
        sb.append('=');
        sb.append(((this.lastState == null)?"<null>":this.lastState));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ready");
        sb.append('=');
        sb.append(((this.ready == null)?"<null>":this.ready));
        sb.append(',');
        sb.append("restartCount");
        sb.append('=');
        sb.append(((this.restartCount == null)?"<null>":this.restartCount));
        sb.append(',');
        sb.append("started");
        sb.append('=');
        sb.append(((this.started == null)?"<null>":this.started));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.imageID == null)? 0 :this.imageID.hashCode()));
        result = ((result* 31)+((this.restartCount == null)? 0 :this.restartCount.hashCode()));
        result = ((result* 31)+((this.ready == null)? 0 :this.ready.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.started == null)? 0 :this.started.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.containerID == null)? 0 :this.containerID.hashCode()));
        result = ((result* 31)+((this.lastState == null)? 0 :this.lastState.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerStatus) == false) {
            return false;
        }
        ContainerStatus rhs = ((ContainerStatus) other);
        return ((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.imageID == rhs.imageID)||((this.imageID!= null)&&this.imageID.equals(rhs.imageID))))&&((this.restartCount == rhs.restartCount)||((this.restartCount!= null)&&this.restartCount.equals(rhs.restartCount))))&&((this.ready == rhs.ready)||((this.ready!= null)&&this.ready.equals(rhs.ready))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.started == rhs.started)||((this.started!= null)&&this.started.equals(rhs.started))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.containerID == rhs.containerID)||((this.containerID!= null)&&this.containerID.equals(rhs.containerID))))&&((this.lastState == rhs.lastState)||((this.lastState!= null)&&this.lastState.equals(rhs.lastState))));
    }

}
