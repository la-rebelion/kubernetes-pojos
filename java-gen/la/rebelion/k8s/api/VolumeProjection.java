
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Projection that may be projected along with other supported volume types
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMap",
    "downwardAPI",
    "secret",
    "serviceAccountToken"
})
@Generated("jsonschema2pojo")
public class VolumeProjection {

    /**
     * Adapts a ConfigMap into a projected volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("Adapts a ConfigMap into a projected volume.\n\nThe contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.")
    private ConfigMapProjection configMap;
    /**
     * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
     * 
     */
    @JsonProperty("downwardAPI")
    @JsonPropertyDescription("Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")
    private DownwardAPIProjection downwardAPI;
    /**
     * Adapts a secret into a projected volume.
     * 
     * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("Adapts a secret into a projected volume.\n\nThe contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.")
    private SecretProjection secret;
    /**
     * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
     * 
     */
    @JsonProperty("serviceAccountToken")
    @JsonPropertyDescription("ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).")
    private ServiceAccountTokenProjection serviceAccountToken;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VolumeProjection() {
    }

    /**
     * 
     * @param source
     */
    public VolumeProjection(VolumeProjection source) {
        super();
        this.configMap = source.configMap;
        this.downwardAPI = source.downwardAPI;
        this.secret = source.secret;
        this.serviceAccountToken = source.serviceAccountToken;
    }

    /**
     * 
     * @param downwardAPI
     * @param configMap
     * @param secret
     * @param serviceAccountToken
     */
    public VolumeProjection(ConfigMapProjection configMap, DownwardAPIProjection downwardAPI, SecretProjection secret, ServiceAccountTokenProjection serviceAccountToken) {
        super();
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
        this.serviceAccountToken = serviceAccountToken;
    }

    /**
     * Adapts a ConfigMap into a projected volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
     * 
     */
    @JsonProperty("configMap")
    public ConfigMapProjection getConfigMap() {
        return configMap;
    }

    /**
     * Adapts a ConfigMap into a projected volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
     * 
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMapProjection configMap) {
        this.configMap = configMap;
    }

    /**
     * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
     * 
     */
    @JsonProperty("downwardAPI")
    public DownwardAPIProjection getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
     * 
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * Adapts a secret into a projected volume.
     * 
     * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
     * 
     */
    @JsonProperty("secret")
    public SecretProjection getSecret() {
        return secret;
    }

    /**
     * Adapts a secret into a projected volume.
     * 
     * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
     * 
     */
    @JsonProperty("secret")
    public void setSecret(SecretProjection secret) {
        this.secret = secret;
    }

    /**
     * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
     * 
     */
    @JsonProperty("serviceAccountToken")
    public ServiceAccountTokenProjection getServiceAccountToken() {
        return serviceAccountToken;
    }

    /**
     * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
     * 
     */
    @JsonProperty("serviceAccountToken")
    public void setServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VolumeProjection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configMap");
        sb.append('=');
        sb.append(((this.configMap == null)?"<null>":this.configMap));
        sb.append(',');
        sb.append("downwardAPI");
        sb.append('=');
        sb.append(((this.downwardAPI == null)?"<null>":this.downwardAPI));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("serviceAccountToken");
        sb.append('=');
        sb.append(((this.serviceAccountToken == null)?"<null>":this.serviceAccountToken));
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
        result = ((result* 31)+((this.downwardAPI == null)? 0 :this.downwardAPI.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.serviceAccountToken == null)? 0 :this.serviceAccountToken.hashCode()));
        result = ((result* 31)+((this.configMap == null)? 0 :this.configMap.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeProjection) == false) {
            return false;
        }
        VolumeProjection rhs = ((VolumeProjection) other);
        return (((((this.downwardAPI == rhs.downwardAPI)||((this.downwardAPI!= null)&&this.downwardAPI.equals(rhs.downwardAPI)))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.serviceAccountToken == rhs.serviceAccountToken)||((this.serviceAccountToken!= null)&&this.serviceAccountToken.equals(rhs.serviceAccountToken))))&&((this.configMap == rhs.configMap)||((this.configMap!= null)&&this.configMap.equals(rhs.configMap))));
    }

}
