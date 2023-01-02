
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "operator",
    "values"
})
@Generated("jsonschema2pojo")
public class LabelSelectorRequirement {

    /**
     * key is the label key that the selector applies to.
     * (Required)
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("key is the label key that the selector applies to.")
    private String key;
    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.")
    private String operator;
    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    @JsonProperty("values")
    @JsonPropertyDescription("values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
    private List<String> values = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LabelSelectorRequirement() {
    }

    /**
     * 
     * @param source
     */
    public LabelSelectorRequirement(LabelSelectorRequirement source) {
        super();
        this.key = source.key;
        this.operator = source.operator;
        this.values = source.values;
    }

    /**
     * 
     * @param values
     * @param key
     * @param operator
     */
    public LabelSelectorRequirement(String key, String operator, List<String> values) {
        super();
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    /**
     * key is the label key that the selector applies to.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * key is the label key that the selector applies to.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * (Required)
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LabelSelectorRequirement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
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
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.values == null)? 0 :this.values.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LabelSelectorRequirement) == false) {
            return false;
        }
        LabelSelectorRequirement rhs = ((LabelSelectorRequirement) other);
        return ((((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key)))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.values == rhs.values)||((this.values!= null)&&this.values.equals(rhs.values))));
    }

}
