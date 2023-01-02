
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "readOnly",
    "secretName",
    "shareName"
})
@Generated("jsonschema2pojo")
public class AzureFileVolumeSource {

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    private Boolean readOnly;
    /**
     * secretName is the  name of secret that contains Azure Storage Account Name and Key
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    @JsonPropertyDescription("secretName is the  name of secret that contains Azure Storage Account Name and Key")
    private String secretName;
    /**
     * shareName is the azure share Name
     * (Required)
     * 
     */
    @JsonProperty("shareName")
    @JsonPropertyDescription("shareName is the azure share Name")
    private String shareName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AzureFileVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public AzureFileVolumeSource(AzureFileVolumeSource source) {
        super();
        this.readOnly = source.readOnly;
        this.secretName = source.secretName;
        this.shareName = source.shareName;
    }

    /**
     * 
     * @param secretName
     * @param readOnly
     * @param shareName
     */
    public AzureFileVolumeSource(Boolean readOnly, String secretName, String shareName) {
        super();
        this.readOnly = readOnly;
        this.secretName = secretName;
        this.shareName = shareName;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretName is the  name of secret that contains Azure Storage Account Name and Key
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    public String getSecretName() {
        return secretName;
    }

    /**
     * secretName is the  name of secret that contains Azure Storage Account Name and Key
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    /**
     * shareName is the azure share Name
     * (Required)
     * 
     */
    @JsonProperty("shareName")
    public String getShareName() {
        return shareName;
    }

    /**
     * shareName is the azure share Name
     * (Required)
     * 
     */
    @JsonProperty("shareName")
    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureFileVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("secretName");
        sb.append('=');
        sb.append(((this.secretName == null)?"<null>":this.secretName));
        sb.append(',');
        sb.append("shareName");
        sb.append('=');
        sb.append(((this.shareName == null)?"<null>":this.shareName));
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
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.secretName == null)? 0 :this.secretName.hashCode()));
        result = ((result* 31)+((this.shareName == null)? 0 :this.shareName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureFileVolumeSource) == false) {
            return false;
        }
        AzureFileVolumeSource rhs = ((AzureFileVolumeSource) other);
        return ((((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly)))&&((this.secretName == rhs.secretName)||((this.secretName!= null)&&this.secretName.equals(rhs.secretName))))&&((this.shareName == rhs.shareName)||((this.shareName!= null)&&this.shareName.equals(rhs.shareName))));
    }

}
