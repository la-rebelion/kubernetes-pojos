
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value",
    "valueFrom"
})
@Generated("jsonschema2pojo")
public class EnvVar {

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the environment variable. Must be a C_IDENTIFIER.")
    private String name;
    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
    private String value;
    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     * 
     */
    @JsonProperty("valueFrom")
    @JsonPropertyDescription("EnvVarSource represents a source for the value of an EnvVar.")
    private EnvVarSource valueFrom;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvVar() {
    }

    /**
     * 
     * @param source
     */
    public EnvVar(EnvVar source) {
        super();
        this.name = source.name;
        this.value = source.value;
        this.valueFrom = source.valueFrom;
    }

    /**
     * 
     * @param name
     * @param value
     * @param valueFrom
     */
    public EnvVar(String name, String value, EnvVarSource valueFrom) {
        super();
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     * 
     */
    @JsonProperty("valueFrom")
    public EnvVarSource getValueFrom() {
        return valueFrom;
    }

    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     * 
     */
    @JsonProperty("valueFrom")
    public void setValueFrom(EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvVar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("valueFrom");
        sb.append('=');
        sb.append(((this.valueFrom == null)?"<null>":this.valueFrom));
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
        result = ((result* 31)+((this.valueFrom == null)? 0 :this.valueFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvVar) == false) {
            return false;
        }
        EnvVar rhs = ((EnvVar) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.valueFrom == rhs.valueFrom)||((this.valueFrom!= null)&&this.valueFrom.equals(rhs.valueFrom))));
    }

}
