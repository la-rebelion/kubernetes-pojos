
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "datasetName",
    "datasetUUID"
})
@Generated("jsonschema2pojo")
public class FlockerVolumeSource {

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
     * 
     */
    @JsonProperty("datasetName")
    @JsonPropertyDescription("datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
    private String datasetName;
    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    @JsonProperty("datasetUUID")
    @JsonPropertyDescription("datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset")
    private String datasetUUID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlockerVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public FlockerVolumeSource(FlockerVolumeSource source) {
        super();
        this.datasetName = source.datasetName;
        this.datasetUUID = source.datasetUUID;
    }

    /**
     * 
     * @param datasetName
     * @param datasetUUID
     */
    public FlockerVolumeSource(String datasetName, String datasetUUID) {
        super();
        this.datasetName = datasetName;
        this.datasetUUID = datasetUUID;
    }

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
     * 
     */
    @JsonProperty("datasetName")
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
     * 
     */
    @JsonProperty("datasetName")
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    @JsonProperty("datasetUUID")
    public String getDatasetUUID() {
        return datasetUUID;
    }

    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    @JsonProperty("datasetUUID")
    public void setDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlockerVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datasetName");
        sb.append('=');
        sb.append(((this.datasetName == null)?"<null>":this.datasetName));
        sb.append(',');
        sb.append("datasetUUID");
        sb.append('=');
        sb.append(((this.datasetUUID == null)?"<null>":this.datasetUUID));
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
        result = ((result* 31)+((this.datasetName == null)? 0 :this.datasetName.hashCode()));
        result = ((result* 31)+((this.datasetUUID == null)? 0 :this.datasetUUID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlockerVolumeSource) == false) {
            return false;
        }
        FlockerVolumeSource rhs = ((FlockerVolumeSource) other);
        return (((this.datasetName == rhs.datasetName)||((this.datasetName!= null)&&this.datasetName.equals(rhs.datasetName)))&&((this.datasetUUID == rhs.datasetUUID)||((this.datasetUUID!= null)&&this.datasetUUID.equals(rhs.datasetUUID))));
    }

}
