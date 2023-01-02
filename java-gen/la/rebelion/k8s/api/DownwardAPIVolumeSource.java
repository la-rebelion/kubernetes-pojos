
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defaultMode",
    "items"
})
@Generated("jsonschema2pojo")
public class DownwardAPIVolumeSource {

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    @JsonPropertyDescription("Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    private Integer defaultMode;
    /**
     * Items is a list of downward API volume file
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("Items is a list of downward API volume file")
    private List<DownwardAPIVolumeFile> items = new ArrayList<DownwardAPIVolumeFile>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownwardAPIVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public DownwardAPIVolumeSource(DownwardAPIVolumeSource source) {
        super();
        this.defaultMode = source.defaultMode;
        this.items = source.items;
    }

    /**
     * 
     * @param defaultMode
     * @param items
     */
    public DownwardAPIVolumeSource(Integer defaultMode, List<DownwardAPIVolumeFile> items) {
        super();
        this.defaultMode = defaultMode;
        this.items = items;
    }

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public Integer getDefaultMode() {
        return defaultMode;
    }

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * Items is a list of downward API volume file
     * 
     */
    @JsonProperty("items")
    public List<DownwardAPIVolumeFile> getItems() {
        return items;
    }

    /**
     * Items is a list of downward API volume file
     * 
     */
    @JsonProperty("items")
    public void setItems(List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DownwardAPIVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaultMode");
        sb.append('=');
        sb.append(((this.defaultMode == null)?"<null>":this.defaultMode));
        sb.append(',');
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
        result = ((result* 31)+((this.defaultMode == null)? 0 :this.defaultMode.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownwardAPIVolumeSource) == false) {
            return false;
        }
        DownwardAPIVolumeSource rhs = ((DownwardAPIVolumeSource) other);
        return (((this.defaultMode == rhs.defaultMode)||((this.defaultMode!= null)&&this.defaultMode.equals(rhs.defaultMode)))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))));
    }

}
