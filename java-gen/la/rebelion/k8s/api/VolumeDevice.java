
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * volumeDevice describes a mapping of a raw block device within a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "devicePath",
    "name"
})
@Generated("jsonschema2pojo")
public class VolumeDevice {

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    @JsonPropertyDescription("devicePath is the path inside of the container that the device will be mapped to.")
    private String devicePath;
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name must match the name of a persistentVolumeClaim in the pod")
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VolumeDevice() {
    }

    /**
     * 
     * @param source
     */
    public VolumeDevice(VolumeDevice source) {
        super();
        this.devicePath = source.devicePath;
        this.name = source.name;
    }

    /**
     * 
     * @param devicePath
     * @param name
     */
    public VolumeDevice(String devicePath, String name) {
        super();
        this.devicePath = devicePath;
        this.name = name;
    }

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    public String getDevicePath() {
        return devicePath;
    }

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VolumeDevice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("devicePath");
        sb.append('=');
        sb.append(((this.devicePath == null)?"<null>":this.devicePath));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.devicePath == null)? 0 :this.devicePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeDevice) == false) {
            return false;
        }
        VolumeDevice rhs = ((VolumeDevice) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.devicePath == rhs.devicePath)||((this.devicePath!= null)&&this.devicePath.equals(rhs.devicePath))));
    }

}
