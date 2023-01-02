
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodDNSConfigOption defines DNS resolver options of a pod.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value"
})
@Generated("jsonschema2pojo")
public class PodDNSConfigOption {

    /**
     * Required.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Required.")
    private String name;
    @JsonProperty("value")
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodDNSConfigOption() {
    }

    /**
     * 
     * @param source
     */
    public PodDNSConfigOption(PodDNSConfigOption source) {
        super();
        this.name = source.name;
        this.value = source.value;
    }

    /**
     * 
     * @param name
     * @param value
     */
    public PodDNSConfigOption(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    /**
     * Required.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Required.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodDNSConfigOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodDNSConfigOption) == false) {
            return false;
        }
        PodDNSConfigOption rhs = ((PodDNSConfigOption) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
