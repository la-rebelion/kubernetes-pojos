
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JobSpec describes how the job execution will look like.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "activeDeadlineSeconds",
    "backoffLimit",
    "completionMode",
    "completions",
    "manualSelector",
    "parallelism",
    "podFailurePolicy",
    "selector",
    "suspend",
    "template",
    "ttlSecondsAfterFinished"
})
@Generated("jsonschema2pojo")
public class JobSpec {

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    @JsonPropertyDescription("Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.")
    private Integer activeDeadlineSeconds;
    /**
     * Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    @JsonProperty("backoffLimit")
    @JsonPropertyDescription("Specifies the number of retries before marking this job failed. Defaults to 6")
    private Integer backoffLimit;
    /**
     * CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    @JsonProperty("completionMode")
    @JsonPropertyDescription("CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.\n\n`NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.\n\n`Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.\n\nMore completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.")
    private String completionMode;
    /**
     * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("completions")
    @JsonPropertyDescription("Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
    private Integer completions;
    /**
     * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    @JsonProperty("manualSelector")
    @JsonPropertyDescription("manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")
    private Boolean manualSelector;
    /**
     * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("parallelism")
    @JsonPropertyDescription("Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
    private Integer parallelism;
    /**
     * PodFailurePolicy describes how failed pods influence the backoffLimit.
     * 
     */
    @JsonProperty("podFailurePolicy")
    @JsonPropertyDescription("PodFailurePolicy describes how failed pods influence the backoffLimit.")
    private PodFailurePolicy podFailurePolicy;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("selector")
    @JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    private LabelSelector selector;
    /**
     * Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    @JsonProperty("suspend")
    @JsonPropertyDescription("Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.")
    private Boolean suspend;
    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    @JsonProperty("template")
    @JsonPropertyDescription("PodTemplateSpec describes the data a pod should have when created from a template")
    private PodTemplateSpec template;
    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    @JsonProperty("ttlSecondsAfterFinished")
    @JsonPropertyDescription("ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.")
    private Integer ttlSecondsAfterFinished;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobSpec() {
    }

    /**
     * 
     * @param source
     */
    public JobSpec(JobSpec source) {
        super();
        this.activeDeadlineSeconds = source.activeDeadlineSeconds;
        this.backoffLimit = source.backoffLimit;
        this.completionMode = source.completionMode;
        this.completions = source.completions;
        this.manualSelector = source.manualSelector;
        this.parallelism = source.parallelism;
        this.podFailurePolicy = source.podFailurePolicy;
        this.selector = source.selector;
        this.suspend = source.suspend;
        this.template = source.template;
        this.ttlSecondsAfterFinished = source.ttlSecondsAfterFinished;
    }

    /**
     * 
     * @param suspend
     * @param template
     * @param backoffLimit
     * @param manualSelector
     * @param parallelism
     * @param completions
     * @param completionMode
     * @param selector
     * @param activeDeadlineSeconds
     * @param podFailurePolicy
     * @param ttlSecondsAfterFinished
     */
    public JobSpec(Integer activeDeadlineSeconds, Integer backoffLimit, String completionMode, Integer completions, Boolean manualSelector, Integer parallelism, PodFailurePolicy podFailurePolicy, LabelSelector selector, Boolean suspend, PodTemplateSpec template, Integer ttlSecondsAfterFinished) {
        super();
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completionMode = completionMode;
        this.completions = completions;
        this.manualSelector = manualSelector;
        this.parallelism = parallelism;
        this.podFailurePolicy = podFailurePolicy;
        this.selector = selector;
        this.suspend = suspend;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    @JsonProperty("backoffLimit")
    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    /**
     * Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    @JsonProperty("backoffLimit")
    public void setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    /**
     * CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    @JsonProperty("completionMode")
    public String getCompletionMode() {
        return completionMode;
    }

    /**
     * CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    @JsonProperty("completionMode")
    public void setCompletionMode(String completionMode) {
        this.completionMode = completionMode;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("completions")
    public Integer getCompletions() {
        return completions;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("completions")
    public void setCompletions(Integer completions) {
        this.completions = completions;
    }

    /**
     * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    @JsonProperty("manualSelector")
    public Boolean getManualSelector() {
        return manualSelector;
    }

    /**
     * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    @JsonProperty("manualSelector")
    public void setManualSelector(Boolean manualSelector) {
        this.manualSelector = manualSelector;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("parallelism")
    public Integer getParallelism() {
        return parallelism;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @JsonProperty("parallelism")
    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    /**
     * PodFailurePolicy describes how failed pods influence the backoffLimit.
     * 
     */
    @JsonProperty("podFailurePolicy")
    public PodFailurePolicy getPodFailurePolicy() {
        return podFailurePolicy;
    }

    /**
     * PodFailurePolicy describes how failed pods influence the backoffLimit.
     * 
     */
    @JsonProperty("podFailurePolicy")
    public void setPodFailurePolicy(PodFailurePolicy podFailurePolicy) {
        this.podFailurePolicy = podFailurePolicy;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("selector")
    public LabelSelector getSelector() {
        return selector;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("selector")
    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

    /**
     * Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    @JsonProperty("suspend")
    public Boolean getSuspend() {
        return suspend;
    }

    /**
     * Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    @JsonProperty("suspend")
    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
    }

    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    @JsonProperty("template")
    public PodTemplateSpec getTemplate() {
        return template;
    }

    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    @JsonProperty("template")
    public void setTemplate(PodTemplateSpec template) {
        this.template = template;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    @JsonProperty("ttlSecondsAfterFinished")
    public Integer getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    @JsonProperty("ttlSecondsAfterFinished")
    public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeDeadlineSeconds");
        sb.append('=');
        sb.append(((this.activeDeadlineSeconds == null)?"<null>":this.activeDeadlineSeconds));
        sb.append(',');
        sb.append("backoffLimit");
        sb.append('=');
        sb.append(((this.backoffLimit == null)?"<null>":this.backoffLimit));
        sb.append(',');
        sb.append("completionMode");
        sb.append('=');
        sb.append(((this.completionMode == null)?"<null>":this.completionMode));
        sb.append(',');
        sb.append("completions");
        sb.append('=');
        sb.append(((this.completions == null)?"<null>":this.completions));
        sb.append(',');
        sb.append("manualSelector");
        sb.append('=');
        sb.append(((this.manualSelector == null)?"<null>":this.manualSelector));
        sb.append(',');
        sb.append("parallelism");
        sb.append('=');
        sb.append(((this.parallelism == null)?"<null>":this.parallelism));
        sb.append(',');
        sb.append("podFailurePolicy");
        sb.append('=');
        sb.append(((this.podFailurePolicy == null)?"<null>":this.podFailurePolicy));
        sb.append(',');
        sb.append("selector");
        sb.append('=');
        sb.append(((this.selector == null)?"<null>":this.selector));
        sb.append(',');
        sb.append("suspend");
        sb.append('=');
        sb.append(((this.suspend == null)?"<null>":this.suspend));
        sb.append(',');
        sb.append("template");
        sb.append('=');
        sb.append(((this.template == null)?"<null>":this.template));
        sb.append(',');
        sb.append("ttlSecondsAfterFinished");
        sb.append('=');
        sb.append(((this.ttlSecondsAfterFinished == null)?"<null>":this.ttlSecondsAfterFinished));
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
        result = ((result* 31)+((this.suspend == null)? 0 :this.suspend.hashCode()));
        result = ((result* 31)+((this.template == null)? 0 :this.template.hashCode()));
        result = ((result* 31)+((this.backoffLimit == null)? 0 :this.backoffLimit.hashCode()));
        result = ((result* 31)+((this.manualSelector == null)? 0 :this.manualSelector.hashCode()));
        result = ((result* 31)+((this.parallelism == null)? 0 :this.parallelism.hashCode()));
        result = ((result* 31)+((this.completions == null)? 0 :this.completions.hashCode()));
        result = ((result* 31)+((this.completionMode == null)? 0 :this.completionMode.hashCode()));
        result = ((result* 31)+((this.selector == null)? 0 :this.selector.hashCode()));
        result = ((result* 31)+((this.activeDeadlineSeconds == null)? 0 :this.activeDeadlineSeconds.hashCode()));
        result = ((result* 31)+((this.podFailurePolicy == null)? 0 :this.podFailurePolicy.hashCode()));
        result = ((result* 31)+((this.ttlSecondsAfterFinished == null)? 0 :this.ttlSecondsAfterFinished.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobSpec) == false) {
            return false;
        }
        JobSpec rhs = ((JobSpec) other);
        return ((((((((((((this.suspend == rhs.suspend)||((this.suspend!= null)&&this.suspend.equals(rhs.suspend)))&&((this.template == rhs.template)||((this.template!= null)&&this.template.equals(rhs.template))))&&((this.backoffLimit == rhs.backoffLimit)||((this.backoffLimit!= null)&&this.backoffLimit.equals(rhs.backoffLimit))))&&((this.manualSelector == rhs.manualSelector)||((this.manualSelector!= null)&&this.manualSelector.equals(rhs.manualSelector))))&&((this.parallelism == rhs.parallelism)||((this.parallelism!= null)&&this.parallelism.equals(rhs.parallelism))))&&((this.completions == rhs.completions)||((this.completions!= null)&&this.completions.equals(rhs.completions))))&&((this.completionMode == rhs.completionMode)||((this.completionMode!= null)&&this.completionMode.equals(rhs.completionMode))))&&((this.selector == rhs.selector)||((this.selector!= null)&&this.selector.equals(rhs.selector))))&&((this.activeDeadlineSeconds == rhs.activeDeadlineSeconds)||((this.activeDeadlineSeconds!= null)&&this.activeDeadlineSeconds.equals(rhs.activeDeadlineSeconds))))&&((this.podFailurePolicy == rhs.podFailurePolicy)||((this.podFailurePolicy!= null)&&this.podFailurePolicy.equals(rhs.podFailurePolicy))))&&((this.ttlSecondsAfterFinished == rhs.ttlSecondsAfterFinished)||((this.ttlSecondsAfterFinished!= null)&&this.ttlSecondsAfterFinished.equals(rhs.ttlSecondsAfterFinished))));
    }

}
