
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Kubernetes Schema 1.25
 * <p>
 * The schema for K1s - Ref: https://github.com/kubernetes-sigs/reference-docs/tree/master/gen-apidocs/config/v1_25
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NamespaceList",
    "Info",
    "PodList",
    "DeleteOptions",
    "Patch",
    "JobList"
})
@Generated("jsonschema2pojo")
public class K8sApiSchema {

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    @JsonPropertyDescription("NamespaceList is a list of Namespaces.")
    private NamespaceList namespaceList;
    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    @JsonPropertyDescription("Info contains versioning information. how we'll want to distribute that information.")
    private Info info;
    /**
     * PodList is a list of Pods.
     * 
     */
    @JsonProperty("PodList")
    @JsonPropertyDescription("PodList is a list of Pods.")
    private PodList podList;
    /**
     * DeleteOptions may be provided when deleting an API object.
     * 
     */
    @JsonProperty("DeleteOptions")
    @JsonPropertyDescription("DeleteOptions may be provided when deleting an API object.")
    private DeleteOptions deleteOptions;
    /**
     * Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.
     * 
     */
    @JsonProperty("Patch")
    @JsonPropertyDescription("Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.")
    private Patch patch;
    /**
     * JobList is a collection of jobs.
     * 
     */
    @JsonProperty("JobList")
    @JsonPropertyDescription("JobList is a collection of jobs.")
    private JobList jobList;

    /**
     * No args constructor for use in serialization
     * 
     */
    public K8sApiSchema() {
    }

    /**
     * 
     * @param source
     */
    public K8sApiSchema(K8sApiSchema source) {
        super();
        this.namespaceList = source.namespaceList;
        this.info = source.info;
        this.podList = source.podList;
        this.deleteOptions = source.deleteOptions;
        this.patch = source.patch;
        this.jobList = source.jobList;
    }

    /**
     * 
     * @param patch
     * @param deleteOptions
     * @param podList
     * @param jobList
     * @param namespaceList
     * @param info
     */
    public K8sApiSchema(NamespaceList namespaceList, Info info, PodList podList, DeleteOptions deleteOptions, Patch patch, JobList jobList) {
        super();
        this.namespaceList = namespaceList;
        this.info = info;
        this.podList = podList;
        this.deleteOptions = deleteOptions;
        this.patch = patch;
        this.jobList = jobList;
    }

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    public NamespaceList getNamespaceList() {
        return namespaceList;
    }

    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    @JsonProperty("NamespaceList")
    public void setNamespaceList(NamespaceList namespaceList) {
        this.namespaceList = namespaceList;
    }

    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     * PodList is a list of Pods.
     * 
     */
    @JsonProperty("PodList")
    public PodList getPodList() {
        return podList;
    }

    /**
     * PodList is a list of Pods.
     * 
     */
    @JsonProperty("PodList")
    public void setPodList(PodList podList) {
        this.podList = podList;
    }

    /**
     * DeleteOptions may be provided when deleting an API object.
     * 
     */
    @JsonProperty("DeleteOptions")
    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    /**
     * DeleteOptions may be provided when deleting an API object.
     * 
     */
    @JsonProperty("DeleteOptions")
    public void setDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
    }

    /**
     * Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.
     * 
     */
    @JsonProperty("Patch")
    public Patch getPatch() {
        return patch;
    }

    /**
     * Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.
     * 
     */
    @JsonProperty("Patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * JobList is a collection of jobs.
     * 
     */
    @JsonProperty("JobList")
    public JobList getJobList() {
        return jobList;
    }

    /**
     * JobList is a collection of jobs.
     * 
     */
    @JsonProperty("JobList")
    public void setJobList(JobList jobList) {
        this.jobList = jobList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K8sApiSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("namespaceList");
        sb.append('=');
        sb.append(((this.namespaceList == null)?"<null>":this.namespaceList));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("podList");
        sb.append('=');
        sb.append(((this.podList == null)?"<null>":this.podList));
        sb.append(',');
        sb.append("deleteOptions");
        sb.append('=');
        sb.append(((this.deleteOptions == null)?"<null>":this.deleteOptions));
        sb.append(',');
        sb.append("patch");
        sb.append('=');
        sb.append(((this.patch == null)?"<null>":this.patch));
        sb.append(',');
        sb.append("jobList");
        sb.append('=');
        sb.append(((this.jobList == null)?"<null>":this.jobList));
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
        result = ((result* 31)+((this.patch == null)? 0 :this.patch.hashCode()));
        result = ((result* 31)+((this.podList == null)? 0 :this.podList.hashCode()));
        result = ((result* 31)+((this.deleteOptions == null)? 0 :this.deleteOptions.hashCode()));
        result = ((result* 31)+((this.jobList == null)? 0 :this.jobList.hashCode()));
        result = ((result* 31)+((this.namespaceList == null)? 0 :this.namespaceList.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof K8sApiSchema) == false) {
            return false;
        }
        K8sApiSchema rhs = ((K8sApiSchema) other);
        return (((((((this.patch == rhs.patch)||((this.patch!= null)&&this.patch.equals(rhs.patch)))&&((this.podList == rhs.podList)||((this.podList!= null)&&this.podList.equals(rhs.podList))))&&((this.deleteOptions == rhs.deleteOptions)||((this.deleteOptions!= null)&&this.deleteOptions.equals(rhs.deleteOptions))))&&((this.jobList == rhs.jobList)||((this.jobList!= null)&&this.jobList.equals(rhs.jobList))))&&((this.namespaceList == rhs.namespaceList)||((this.namespaceList!= null)&&this.namespaceList.equals(rhs.namespaceList))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))));
    }

}
