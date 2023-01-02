
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items"
})
@Generated("jsonschema2pojo")
public class DownwardAPIProjection {

    /**
     * Items is a list of DownwardAPIVolume file
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("Items is a list of DownwardAPIVolume file")
    private List<DownwardAPIVolumeFile> items = new ArrayList<DownwardAPIVolumeFile>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownwardAPIProjection() {
    }

    /**
     * 
     * @param source
     */
    public DownwardAPIProjection(DownwardAPIProjection source) {
        super();
        this.items = source.items;
    }

    /**
     * 
     * @param items
     */
    public DownwardAPIProjection(List<DownwardAPIVolumeFile> items) {
        super();
        this.items = items;
    }

    /**
     * Items is a list of DownwardAPIVolume file
     * 
     */
    @JsonProperty("items")
    public List<DownwardAPIVolumeFile> getItems() {
        return items;
    }

    /**
     * Items is a list of DownwardAPIVolume file
     * 
     */
    @JsonProperty("items")
    public void setItems(List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DownwardAPIProjection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
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
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownwardAPIProjection) == false) {
            return false;
        }
        DownwardAPIProjection rhs = ((DownwardAPIProjection) other);
        return ((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items)));
    }

}
