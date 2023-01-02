
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Adds and removes POSIX capabilities from running containers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "add",
    "drop"
})
@Generated("jsonschema2pojo")
public class Capabilities {

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    @JsonPropertyDescription("Added capabilities")
    private List<String> add = new ArrayList<String>();
    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    @JsonPropertyDescription("Removed capabilities")
    private List<String> drop = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Capabilities() {
    }

    /**
     * 
     * @param source
     */
    public Capabilities(Capabilities source) {
        super();
        this.add = source.add;
        this.drop = source.drop;
    }

    /**
     * 
     * @param add
     * @param drop
     */
    public Capabilities(List<String> add, List<String> drop) {
        super();
        this.add = add;
        this.drop = drop;
    }

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    public List<String> getAdd() {
        return add;
    }

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    public void setAdd(List<String> add) {
        this.add = add;
    }

    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    public List<String> getDrop() {
        return drop;
    }

    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    public void setDrop(List<String> drop) {
        this.drop = drop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Capabilities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("add");
        sb.append('=');
        sb.append(((this.add == null)?"<null>":this.add));
        sb.append(',');
        sb.append("drop");
        sb.append('=');
        sb.append(((this.drop == null)?"<null>":this.drop));
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
        result = ((result* 31)+((this.add == null)? 0 :this.add.hashCode()));
        result = ((result* 31)+((this.drop == null)? 0 :this.drop.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Capabilities) == false) {
            return false;
        }
        Capabilities rhs = ((Capabilities) other);
        return (((this.add == rhs.add)||((this.add!= null)&&this.add.equals(rhs.add)))&&((this.drop == rhs.drop)||((this.drop!= null)&&this.drop.equals(rhs.drop))));
    }

}
