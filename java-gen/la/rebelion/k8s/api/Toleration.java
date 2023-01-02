
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "effect",
    "key",
    "operator",
    "tolerationSeconds",
    "value"
})
@Generated("jsonschema2pojo")
public class Toleration {

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * 
     * 
     */
    @JsonProperty("effect")
    @JsonPropertyDescription("Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.\n\n")
    private String effect;
    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.")
    private String key;
    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * 
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.\n\n")
    private String operator;
    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    @JsonPropertyDescription("TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.")
    private Integer tolerationSeconds;
    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.")
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Toleration() {
    }

    /**
     * 
     * @param source
     */
    public Toleration(Toleration source) {
        super();
        this.effect = source.effect;
        this.key = source.key;
        this.operator = source.operator;
        this.tolerationSeconds = source.tolerationSeconds;
        this.value = source.value;
    }

    /**
     * 
     * @param effect
     * @param tolerationSeconds
     * @param value
     * @param key
     * @param operator
     */
    public Toleration(String effect, String key, String operator, Integer tolerationSeconds, String value) {
        super();
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.tolerationSeconds = tolerationSeconds;
        this.value = value;
    }

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * 
     * 
     */
    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * 
     * 
     */
    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * 
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * 
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    public void setTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Toleration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("tolerationSeconds");
        sb.append('=');
        sb.append(((this.tolerationSeconds == null)?"<null>":this.tolerationSeconds));
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
        result = ((result* 31)+((this.tolerationSeconds == null)? 0 :this.tolerationSeconds.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Toleration) == false) {
            return false;
        }
        Toleration rhs = ((Toleration) other);
        return ((((((this.tolerationSeconds == rhs.tolerationSeconds)||((this.tolerationSeconds!= null)&&this.tolerationSeconds.equals(rhs.tolerationSeconds)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect))));
    }

}
