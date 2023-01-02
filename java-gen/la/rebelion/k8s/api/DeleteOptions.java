
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DeleteOptions may be provided when deleting an API object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "dryRun",
    "gracePeriodSeconds",
    "kind",
    "orphanDependents",
    "preconditions",
    "propagationPolicy"
})
@Generated("jsonschema2pojo")
public class DeleteOptions {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
    private String apiVersion;
    /**
     * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
     * 
     */
    @JsonProperty("dryRun")
    @JsonPropertyDescription("When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed")
    private List<String> dryRun = new ArrayList<String>();
    /**
     * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
     * 
     */
    @JsonProperty("gracePeriodSeconds")
    @JsonPropertyDescription("The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.")
    private Integer gracePeriodSeconds;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
    private String kind;
    /**
     * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
     * 
     */
    @JsonProperty("orphanDependents")
    @JsonPropertyDescription("Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.")
    private Boolean orphanDependents;
    /**
     * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
     * 
     */
    @JsonProperty("preconditions")
    @JsonPropertyDescription("Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")
    private Preconditions preconditions;
    /**
     * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
     * 
     */
    @JsonProperty("propagationPolicy")
    @JsonPropertyDescription("Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.")
    private String propagationPolicy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeleteOptions() {
    }

    /**
     * 
     * @param source
     */
    public DeleteOptions(DeleteOptions source) {
        super();
        this.apiVersion = source.apiVersion;
        this.dryRun = source.dryRun;
        this.gracePeriodSeconds = source.gracePeriodSeconds;
        this.kind = source.kind;
        this.orphanDependents = source.orphanDependents;
        this.preconditions = source.preconditions;
        this.propagationPolicy = source.propagationPolicy;
    }

    /**
     * 
     * @param orphanDependents
     * @param apiVersion
     * @param dryRun
     * @param kind
     * @param preconditions
     * @param gracePeriodSeconds
     * @param propagationPolicy
     */
    public DeleteOptions(String apiVersion, List<String> dryRun, Integer gracePeriodSeconds, String kind, Boolean orphanDependents, Preconditions preconditions, String propagationPolicy) {
        super();
        this.apiVersion = apiVersion;
        this.dryRun = dryRun;
        this.gracePeriodSeconds = gracePeriodSeconds;
        this.kind = kind;
        this.orphanDependents = orphanDependents;
        this.preconditions = preconditions;
        this.propagationPolicy = propagationPolicy;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
     * 
     */
    @JsonProperty("dryRun")
    public List<String> getDryRun() {
        return dryRun;
    }

    /**
     * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
     * 
     */
    @JsonProperty("dryRun")
    public void setDryRun(List<String> dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
     * 
     */
    @JsonProperty("gracePeriodSeconds")
    public Integer getGracePeriodSeconds() {
        return gracePeriodSeconds;
    }

    /**
     * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
     * 
     */
    @JsonProperty("gracePeriodSeconds")
    public void setGracePeriodSeconds(Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
     * 
     */
    @JsonProperty("orphanDependents")
    public Boolean getOrphanDependents() {
        return orphanDependents;
    }

    /**
     * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
     * 
     */
    @JsonProperty("orphanDependents")
    public void setOrphanDependents(Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
    }

    /**
     * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
     * 
     */
    @JsonProperty("preconditions")
    public Preconditions getPreconditions() {
        return preconditions;
    }

    /**
     * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
     * 
     */
    @JsonProperty("preconditions")
    public void setPreconditions(Preconditions preconditions) {
        this.preconditions = preconditions;
    }

    /**
     * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
     * 
     */
    @JsonProperty("propagationPolicy")
    public String getPropagationPolicy() {
        return propagationPolicy;
    }

    /**
     * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
     * 
     */
    @JsonProperty("propagationPolicy")
    public void setPropagationPolicy(String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeleteOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("dryRun");
        sb.append('=');
        sb.append(((this.dryRun == null)?"<null>":this.dryRun));
        sb.append(',');
        sb.append("gracePeriodSeconds");
        sb.append('=');
        sb.append(((this.gracePeriodSeconds == null)?"<null>":this.gracePeriodSeconds));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("orphanDependents");
        sb.append('=');
        sb.append(((this.orphanDependents == null)?"<null>":this.orphanDependents));
        sb.append(',');
        sb.append("preconditions");
        sb.append('=');
        sb.append(((this.preconditions == null)?"<null>":this.preconditions));
        sb.append(',');
        sb.append("propagationPolicy");
        sb.append('=');
        sb.append(((this.propagationPolicy == null)?"<null>":this.propagationPolicy));
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
        result = ((result* 31)+((this.orphanDependents == null)? 0 :this.orphanDependents.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.dryRun == null)? 0 :this.dryRun.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.preconditions == null)? 0 :this.preconditions.hashCode()));
        result = ((result* 31)+((this.gracePeriodSeconds == null)? 0 :this.gracePeriodSeconds.hashCode()));
        result = ((result* 31)+((this.propagationPolicy == null)? 0 :this.propagationPolicy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeleteOptions) == false) {
            return false;
        }
        DeleteOptions rhs = ((DeleteOptions) other);
        return ((((((((this.orphanDependents == rhs.orphanDependents)||((this.orphanDependents!= null)&&this.orphanDependents.equals(rhs.orphanDependents)))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.dryRun == rhs.dryRun)||((this.dryRun!= null)&&this.dryRun.equals(rhs.dryRun))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.preconditions == rhs.preconditions)||((this.preconditions!= null)&&this.preconditions.equals(rhs.preconditions))))&&((this.gracePeriodSeconds == rhs.gracePeriodSeconds)||((this.gracePeriodSeconds!= null)&&this.gracePeriodSeconds.equals(rhs.gracePeriodSeconds))))&&((this.propagationPolicy == rhs.propagationPolicy)||((this.propagationPolicy!= null)&&this.propagationPolicy.equals(rhs.propagationPolicy))));
    }

}
