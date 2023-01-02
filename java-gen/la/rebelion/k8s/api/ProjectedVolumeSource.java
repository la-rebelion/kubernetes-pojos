
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a projected volume source
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defaultMode",
    "sources"
})
@Generated("jsonschema2pojo")
public class ProjectedVolumeSource {

    /**
     * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    @JsonPropertyDescription("defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    private Integer defaultMode;
    /**
     * sources is the list of volume projections
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("sources is the list of volume projections")
    private List<VolumeProjection> sources = new ArrayList<VolumeProjection>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProjectedVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public ProjectedVolumeSource(ProjectedVolumeSource source) {
        super();
        this.defaultMode = source.defaultMode;
        this.sources = source.sources;
    }

    /**
     * 
     * @param sources
     * @param defaultMode
     */
    public ProjectedVolumeSource(Integer defaultMode, List<VolumeProjection> sources) {
        super();
        this.defaultMode = defaultMode;
        this.sources = sources;
    }

    /**
     * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public Integer getDefaultMode() {
        return defaultMode;
    }

    /**
     * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @JsonProperty("defaultMode")
    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * sources is the list of volume projections
     * 
     */
    @JsonProperty("sources")
    public List<VolumeProjection> getSources() {
        return sources;
    }

    /**
     * sources is the list of volume projections
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<VolumeProjection> sources) {
        this.sources = sources;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectedVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaultMode");
        sb.append('=');
        sb.append(((this.defaultMode == null)?"<null>":this.defaultMode));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
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
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.defaultMode == null)? 0 :this.defaultMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectedVolumeSource) == false) {
            return false;
        }
        ProjectedVolumeSource rhs = ((ProjectedVolumeSource) other);
        return (((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources)))&&((this.defaultMode == rhs.defaultMode)||((this.defaultMode!= null)&&this.defaultMode.equals(rhs.defaultMode))));
    }

}
