
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "continue",
    "remainingItemCount",
    "resourceVersion",
    "selfLink"
})
@Generated("jsonschema2pojo")
public class ListMeta {

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    @JsonProperty("continue")
    @JsonPropertyDescription("continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.")
    private String _continue;
    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    @JsonProperty("remainingItemCount")
    @JsonPropertyDescription("remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.")
    private Integer remainingItemCount;
    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @JsonProperty("resourceVersion")
    @JsonPropertyDescription("String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency")
    private String resourceVersion;
    /**
     * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    @JsonProperty("selfLink")
    @JsonPropertyDescription("Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.")
    private String selfLink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListMeta() {
    }

    /**
     * 
     * @param source
     */
    public ListMeta(ListMeta source) {
        super();
        this._continue = source._continue;
        this.remainingItemCount = source.remainingItemCount;
        this.resourceVersion = source.resourceVersion;
        this.selfLink = source.selfLink;
    }

    /**
     * 
     * @param _continue
     * @param remainingItemCount
     * @param resourceVersion
     * @param selfLink
     */
    public ListMeta(String _continue, Integer remainingItemCount, String resourceVersion, String selfLink) {
        super();
        this._continue = _continue;
        this.remainingItemCount = remainingItemCount;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    @JsonProperty("continue")
    public String getContinue() {
        return _continue;
    }

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    @JsonProperty("continue")
    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    @JsonProperty("remainingItemCount")
    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    @JsonProperty("remainingItemCount")
    public void setRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @JsonProperty("resourceVersion")
    public String getResourceVersion() {
        return resourceVersion;
    }

    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @JsonProperty("resourceVersion")
    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
     * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListMeta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_continue");
        sb.append('=');
        sb.append(((this._continue == null)?"<null>":this._continue));
        sb.append(',');
        sb.append("remainingItemCount");
        sb.append('=');
        sb.append(((this.remainingItemCount == null)?"<null>":this.remainingItemCount));
        sb.append(',');
        sb.append("resourceVersion");
        sb.append('=');
        sb.append(((this.resourceVersion == null)?"<null>":this.resourceVersion));
        sb.append(',');
        sb.append("selfLink");
        sb.append('=');
        sb.append(((this.selfLink == null)?"<null>":this.selfLink));
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
        result = ((result* 31)+((this._continue == null)? 0 :this._continue.hashCode()));
        result = ((result* 31)+((this.remainingItemCount == null)? 0 :this.remainingItemCount.hashCode()));
        result = ((result* 31)+((this.resourceVersion == null)? 0 :this.resourceVersion.hashCode()));
        result = ((result* 31)+((this.selfLink == null)? 0 :this.selfLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListMeta) == false) {
            return false;
        }
        ListMeta rhs = ((ListMeta) other);
        return (((((this._continue == rhs._continue)||((this._continue!= null)&&this._continue.equals(rhs._continue)))&&((this.remainingItemCount == rhs.remainingItemCount)||((this.remainingItemCount!= null)&&this.remainingItemCount.equals(rhs.remainingItemCount))))&&((this.resourceVersion == rhs.resourceVersion)||((this.resourceVersion!= null)&&this.resourceVersion.equals(rhs.resourceVersion))))&&((this.selfLink == rhs.selfLink)||((this.selfLink!= null)&&this.selfLink.equals(rhs.selfLink))));
    }

}
