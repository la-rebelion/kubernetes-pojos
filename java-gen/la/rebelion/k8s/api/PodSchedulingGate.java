
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodSchedulingGate is associated to a Pod to guard its scheduling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name"
})
@Generated("jsonschema2pojo")
public class PodSchedulingGate {

    /**
     * Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the scheduling gate. Each scheduling gate must have a unique name field.")
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSchedulingGate() {
    }

    /**
     * 
     * @param source
     */
    public PodSchedulingGate(PodSchedulingGate source) {
        super();
        this.name = source.name;
    }

    /**
     * 
     * @param name
     */
    public PodSchedulingGate(String name) {
        super();
        this.name = name;
    }

    /**
     * Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodSchedulingGate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodSchedulingGate) == false) {
            return false;
        }
        PodSchedulingGate rhs = ((PodSchedulingGate) other);
        return ((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)));
    }

}
