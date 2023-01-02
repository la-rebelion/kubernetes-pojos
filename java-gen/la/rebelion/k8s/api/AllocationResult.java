
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AllocationResult contains attributed of an allocated resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availableOnNodes",
    "resourceHandle",
    "shareable"
})
@Generated("jsonschema2pojo")
public class AllocationResult {

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("availableOnNodes")
    @JsonPropertyDescription("A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.")
    private NodeSelector availableOnNodes;
    /**
     * ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("resourceHandle")
    @JsonPropertyDescription("ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.\n\nThe maximum size of this field is 16KiB. This may get increased in the future, but not reduced.")
    private String resourceHandle;
    /**
     * Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    @JsonProperty("shareable")
    @JsonPropertyDescription("Shareable determines whether the resource supports more than one consumer at a time.")
    private Boolean shareable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllocationResult() {
    }

    /**
     * 
     * @param source
     */
    public AllocationResult(AllocationResult source) {
        super();
        this.availableOnNodes = source.availableOnNodes;
        this.resourceHandle = source.resourceHandle;
        this.shareable = source.shareable;
    }

    /**
     * 
     * @param shareable
     * @param resourceHandle
     * @param availableOnNodes
     */
    public AllocationResult(NodeSelector availableOnNodes, String resourceHandle, Boolean shareable) {
        super();
        this.availableOnNodes = availableOnNodes;
        this.resourceHandle = resourceHandle;
        this.shareable = shareable;
    }

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("availableOnNodes")
    public NodeSelector getAvailableOnNodes() {
        return availableOnNodes;
    }

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    @JsonProperty("availableOnNodes")
    public void setAvailableOnNodes(NodeSelector availableOnNodes) {
        this.availableOnNodes = availableOnNodes;
    }

    /**
     * ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("resourceHandle")
    public String getResourceHandle() {
        return resourceHandle;
    }

    /**
     * ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * The maximum size of this field is 16KiB. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("resourceHandle")
    public void setResourceHandle(String resourceHandle) {
        this.resourceHandle = resourceHandle;
    }

    /**
     * Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    @JsonProperty("shareable")
    public Boolean getShareable() {
        return shareable;
    }

    /**
     * Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    @JsonProperty("shareable")
    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AllocationResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("availableOnNodes");
        sb.append('=');
        sb.append(((this.availableOnNodes == null)?"<null>":this.availableOnNodes));
        sb.append(',');
        sb.append("resourceHandle");
        sb.append('=');
        sb.append(((this.resourceHandle == null)?"<null>":this.resourceHandle));
        sb.append(',');
        sb.append("shareable");
        sb.append('=');
        sb.append(((this.shareable == null)?"<null>":this.shareable));
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
        result = ((result* 31)+((this.shareable == null)? 0 :this.shareable.hashCode()));
        result = ((result* 31)+((this.resourceHandle == null)? 0 :this.resourceHandle.hashCode()));
        result = ((result* 31)+((this.availableOnNodes == null)? 0 :this.availableOnNodes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllocationResult) == false) {
            return false;
        }
        AllocationResult rhs = ((AllocationResult) other);
        return ((((this.shareable == rhs.shareable)||((this.shareable!= null)&&this.shareable.equals(rhs.shareable)))&&((this.resourceHandle == rhs.resourceHandle)||((this.resourceHandle!= null)&&this.resourceHandle.equals(rhs.resourceHandle))))&&((this.availableOnNodes == rhs.availableOnNodes)||((this.availableOnNodes!= null)&&this.availableOnNodes.equals(rhs.availableOnNodes))));
    }

}
