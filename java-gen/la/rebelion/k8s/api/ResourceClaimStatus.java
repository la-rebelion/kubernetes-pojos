
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allocation",
    "deallocationRequested",
    "driverName",
    "reservedFor"
})
@Generated("jsonschema2pojo")
public class ResourceClaimStatus {

    /**
     * AllocationResult contains attributed of an allocated resource.
     * 
     */
    @JsonProperty("allocation")
    @JsonPropertyDescription("AllocationResult contains attributed of an allocated resource.")
    private AllocationResult allocation;
    /**
     * DeallocationRequested indicates that a ResourceClaim is to be deallocated.
     * 
     * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
     * 
     * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
     * 
     */
    @JsonProperty("deallocationRequested")
    @JsonPropertyDescription("DeallocationRequested indicates that a ResourceClaim is to be deallocated.\n\nThe driver then must deallocate this claim and reset the field together with clearing the Allocation field.\n\nWhile DeallocationRequested is set, no new consumers may be added to ReservedFor.")
    private Boolean deallocationRequested;
    /**
     * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
     * 
     */
    @JsonProperty("driverName")
    @JsonPropertyDescription("DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.")
    private String driverName;
    /**
     * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
     * 
     * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("reservedFor")
    @JsonPropertyDescription("ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.\n\nThere can be at most 32 such reservations. This may get increased in the future, but not reduced.")
    private List<ResourceClaimConsumerReference> reservedFor = new ArrayList<ResourceClaimConsumerReference>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceClaimStatus() {
    }

    /**
     * 
     * @param source
     */
    public ResourceClaimStatus(ResourceClaimStatus source) {
        super();
        this.allocation = source.allocation;
        this.deallocationRequested = source.deallocationRequested;
        this.driverName = source.driverName;
        this.reservedFor = source.reservedFor;
    }

    /**
     * 
     * @param allocation
     * @param reservedFor
     * @param driverName
     * @param deallocationRequested
     */
    public ResourceClaimStatus(AllocationResult allocation, Boolean deallocationRequested, String driverName, List<ResourceClaimConsumerReference> reservedFor) {
        super();
        this.allocation = allocation;
        this.deallocationRequested = deallocationRequested;
        this.driverName = driverName;
        this.reservedFor = reservedFor;
    }

    /**
     * AllocationResult contains attributed of an allocated resource.
     * 
     */
    @JsonProperty("allocation")
    public AllocationResult getAllocation() {
        return allocation;
    }

    /**
     * AllocationResult contains attributed of an allocated resource.
     * 
     */
    @JsonProperty("allocation")
    public void setAllocation(AllocationResult allocation) {
        this.allocation = allocation;
    }

    /**
     * DeallocationRequested indicates that a ResourceClaim is to be deallocated.
     * 
     * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
     * 
     * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
     * 
     */
    @JsonProperty("deallocationRequested")
    public Boolean getDeallocationRequested() {
        return deallocationRequested;
    }

    /**
     * DeallocationRequested indicates that a ResourceClaim is to be deallocated.
     * 
     * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
     * 
     * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
     * 
     */
    @JsonProperty("deallocationRequested")
    public void setDeallocationRequested(Boolean deallocationRequested) {
        this.deallocationRequested = deallocationRequested;
    }

    /**
     * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
     * 
     */
    @JsonProperty("driverName")
    public String getDriverName() {
        return driverName;
    }

    /**
     * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
     * 
     */
    @JsonProperty("driverName")
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
     * 
     * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("reservedFor")
    public List<ResourceClaimConsumerReference> getReservedFor() {
        return reservedFor;
    }

    /**
     * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
     * 
     * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
     * 
     */
    @JsonProperty("reservedFor")
    public void setReservedFor(List<ResourceClaimConsumerReference> reservedFor) {
        this.reservedFor = reservedFor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceClaimStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allocation");
        sb.append('=');
        sb.append(((this.allocation == null)?"<null>":this.allocation));
        sb.append(',');
        sb.append("deallocationRequested");
        sb.append('=');
        sb.append(((this.deallocationRequested == null)?"<null>":this.deallocationRequested));
        sb.append(',');
        sb.append("driverName");
        sb.append('=');
        sb.append(((this.driverName == null)?"<null>":this.driverName));
        sb.append(',');
        sb.append("reservedFor");
        sb.append('=');
        sb.append(((this.reservedFor == null)?"<null>":this.reservedFor));
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
        result = ((result* 31)+((this.allocation == null)? 0 :this.allocation.hashCode()));
        result = ((result* 31)+((this.driverName == null)? 0 :this.driverName.hashCode()));
        result = ((result* 31)+((this.reservedFor == null)? 0 :this.reservedFor.hashCode()));
        result = ((result* 31)+((this.deallocationRequested == null)? 0 :this.deallocationRequested.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceClaimStatus) == false) {
            return false;
        }
        ResourceClaimStatus rhs = ((ResourceClaimStatus) other);
        return (((((this.allocation == rhs.allocation)||((this.allocation!= null)&&this.allocation.equals(rhs.allocation)))&&((this.driverName == rhs.driverName)||((this.driverName!= null)&&this.driverName.equals(rhs.driverName))))&&((this.reservedFor == rhs.reservedFor)||((this.reservedFor!= null)&&this.reservedFor.equals(rhs.reservedFor))))&&((this.deallocationRequested == rhs.deallocationRequested)||((this.deallocationRequested!= null)&&this.deallocationRequested.equals(rhs.deallocationRequested))));
    }

}
