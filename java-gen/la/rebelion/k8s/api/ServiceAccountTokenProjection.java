
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "audience",
    "expirationSeconds",
    "path"
})
@Generated("jsonschema2pojo")
public class ServiceAccountTokenProjection {

    /**
     * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     * 
     */
    @JsonProperty("audience")
    @JsonPropertyDescription("audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")
    private String audience;
    /**
     * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * 
     */
    @JsonProperty("expirationSeconds")
    @JsonPropertyDescription("expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")
    private Integer expirationSeconds;
    /**
     * path is the path relative to the mount point of the file to project the token into.
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("path is the path relative to the mount point of the file to project the token into.")
    private String path;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceAccountTokenProjection() {
    }

    /**
     * 
     * @param source
     */
    public ServiceAccountTokenProjection(ServiceAccountTokenProjection source) {
        super();
        this.audience = source.audience;
        this.expirationSeconds = source.expirationSeconds;
        this.path = source.path;
    }

    /**
     * 
     * @param path
     * @param audience
     * @param expirationSeconds
     */
    public ServiceAccountTokenProjection(String audience, Integer expirationSeconds, String path) {
        super();
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
        this.path = path;
    }

    /**
     * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     * 
     */
    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    /**
     * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     * 
     */
    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * 
     */
    @JsonProperty("expirationSeconds")
    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    /**
     * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * 
     */
    @JsonProperty("expirationSeconds")
    public void setExpirationSeconds(Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * path is the path relative to the mount point of the file to project the token into.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * path is the path relative to the mount point of the file to project the token into.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceAccountTokenProjection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("audience");
        sb.append('=');
        sb.append(((this.audience == null)?"<null>":this.audience));
        sb.append(',');
        sb.append("expirationSeconds");
        sb.append('=');
        sb.append(((this.expirationSeconds == null)?"<null>":this.expirationSeconds));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.audience == null)? 0 :this.audience.hashCode()));
        result = ((result* 31)+((this.expirationSeconds == null)? 0 :this.expirationSeconds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceAccountTokenProjection) == false) {
            return false;
        }
        ServiceAccountTokenProjection rhs = ((ServiceAccountTokenProjection) other);
        return ((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.audience == rhs.audience)||((this.audience!= null)&&this.audience.equals(rhs.audience))))&&((this.expirationSeconds == rhs.expirationSeconds)||((this.expirationSeconds!= null)&&this.expirationSeconds.equals(rhs.expirationSeconds))));
    }

}
