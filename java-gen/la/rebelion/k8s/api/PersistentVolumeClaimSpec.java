
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accessModes",
    "dataSource",
    "dataSourceRef",
    "resources",
    "selector",
    "storageClassName",
    "volumeMode",
    "volumeName"
})
@Generated("jsonschema2pojo")
public class PersistentVolumeClaimSpec {

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    @JsonProperty("accessModes")
    @JsonPropertyDescription("accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
    private List<String> accessModes = new ArrayList<String>();
    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    @JsonProperty("dataSource")
    @JsonPropertyDescription("TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.")
    private TypedLocalObjectReference dataSource;
    @JsonProperty("dataSourceRef")
    private TypedObjectReference dataSourceRef;
    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("ResourceRequirements describes the compute resource requirements.")
    private ResourceRequirements resources;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    @JsonProperty("selector")
    @JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    private LabelSelector selector;
    /**
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    @JsonProperty("storageClassName")
    @JsonPropertyDescription("storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
    private String storageClassName;
    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    @JsonProperty("volumeMode")
    @JsonPropertyDescription("volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
    private String volumeMode;
    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    @JsonProperty("volumeName")
    @JsonPropertyDescription("volumeName is the binding reference to the PersistentVolume backing this claim.")
    private String volumeName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersistentVolumeClaimSpec() {
    }

    /**
     * 
     * @param source
     */
    public PersistentVolumeClaimSpec(PersistentVolumeClaimSpec source) {
        super();
        this.accessModes = source.accessModes;
        this.dataSource = source.dataSource;
        this.dataSourceRef = source.dataSourceRef;
        this.resources = source.resources;
        this.selector = source.selector;
        this.storageClassName = source.storageClassName;
        this.volumeMode = source.volumeMode;
        this.volumeName = source.volumeName;
    }

    /**
     * 
     * @param storageClassName
     * @param dataSourceRef
     * @param volumeName
     * @param resources
     * @param selector
     * @param accessModes
     * @param dataSource
     * @param volumeMode
     */
    public PersistentVolumeClaimSpec(List<String> accessModes, TypedLocalObjectReference dataSource, TypedObjectReference dataSourceRef, ResourceRequirements resources, LabelSelector selector, String storageClassName, String volumeMode, String volumeName) {
        super();
        this.accessModes = accessModes;
        this.dataSource = dataSource;
        this.dataSourceRef = dataSourceRef;
        this.resources = resources;
        this.selector = selector;
        this.storageClassName = storageClassName;
        this.volumeMode = volumeMode;
        this.volumeName = volumeName;
    }

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    @JsonProperty("accessModes")
    public List<String> getAccessModes() {
        return accessModes;
    }

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    @JsonProperty("accessModes")
    public void setAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    @JsonProperty("dataSource")
    public TypedLocalObjectReference getDataSource() {
        return dataSource;
    }

    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    @JsonProperty("dataSource")
    public void setDataSource(TypedLocalObjectReference dataSource) {
        this.dataSource = dataSource;
    }

    @JsonProperty("dataSourceRef")
    public TypedObjectReference getDataSourceRef() {
        return dataSourceRef;
    }

    @JsonProperty("dataSourceRef")
    public void setDataSourceRef(TypedObjectReference dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
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
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    @JsonProperty("storageClassName")
    public String getStorageClassName() {
        return storageClassName;
    }

    /**
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    @JsonProperty("storageClassName")
    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    @JsonProperty("volumeMode")
    public String getVolumeMode() {
        return volumeMode;
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    @JsonProperty("volumeMode")
    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    @JsonProperty("volumeName")
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    @JsonProperty("volumeName")
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersistentVolumeClaimSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessModes");
        sb.append('=');
        sb.append(((this.accessModes == null)?"<null>":this.accessModes));
        sb.append(',');
        sb.append("dataSource");
        sb.append('=');
        sb.append(((this.dataSource == null)?"<null>":this.dataSource));
        sb.append(',');
        sb.append("dataSourceRef");
        sb.append('=');
        sb.append(((this.dataSourceRef == null)?"<null>":this.dataSourceRef));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("selector");
        sb.append('=');
        sb.append(((this.selector == null)?"<null>":this.selector));
        sb.append(',');
        sb.append("storageClassName");
        sb.append('=');
        sb.append(((this.storageClassName == null)?"<null>":this.storageClassName));
        sb.append(',');
        sb.append("volumeMode");
        sb.append('=');
        sb.append(((this.volumeMode == null)?"<null>":this.volumeMode));
        sb.append(',');
        sb.append("volumeName");
        sb.append('=');
        sb.append(((this.volumeName == null)?"<null>":this.volumeName));
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
        result = ((result* 31)+((this.storageClassName == null)? 0 :this.storageClassName.hashCode()));
        result = ((result* 31)+((this.dataSourceRef == null)? 0 :this.dataSourceRef.hashCode()));
        result = ((result* 31)+((this.volumeName == null)? 0 :this.volumeName.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.selector == null)? 0 :this.selector.hashCode()));
        result = ((result* 31)+((this.accessModes == null)? 0 :this.accessModes.hashCode()));
        result = ((result* 31)+((this.dataSource == null)? 0 :this.dataSource.hashCode()));
        result = ((result* 31)+((this.volumeMode == null)? 0 :this.volumeMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersistentVolumeClaimSpec) == false) {
            return false;
        }
        PersistentVolumeClaimSpec rhs = ((PersistentVolumeClaimSpec) other);
        return (((((((((this.storageClassName == rhs.storageClassName)||((this.storageClassName!= null)&&this.storageClassName.equals(rhs.storageClassName)))&&((this.dataSourceRef == rhs.dataSourceRef)||((this.dataSourceRef!= null)&&this.dataSourceRef.equals(rhs.dataSourceRef))))&&((this.volumeName == rhs.volumeName)||((this.volumeName!= null)&&this.volumeName.equals(rhs.volumeName))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.selector == rhs.selector)||((this.selector!= null)&&this.selector.equals(rhs.selector))))&&((this.accessModes == rhs.accessModes)||((this.accessModes!= null)&&this.accessModes.equals(rhs.accessModes))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))))&&((this.volumeMode == rhs.volumeMode)||((this.volumeMode!= null)&&this.volumeMode.equals(rhs.volumeMode))));
    }

}
