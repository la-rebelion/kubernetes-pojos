
package la.rebelion.k8s.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nameservers",
    "options",
    "searches"
})
@Generated("jsonschema2pojo")
public class PodDNSConfig {

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    @JsonPropertyDescription("A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")
    private List<String> nameservers = new ArrayList<String>();
    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")
    private List<PodDNSConfigOption> options = new ArrayList<PodDNSConfigOption>();
    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    @JsonPropertyDescription("A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")
    private List<String> searches = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodDNSConfig() {
    }

    /**
     * 
     * @param source
     */
    public PodDNSConfig(PodDNSConfig source) {
        super();
        this.nameservers = source.nameservers;
        this.options = source.options;
        this.searches = source.searches;
    }

    /**
     * 
     * @param searches
     * @param nameservers
     * @param options
     */
    public PodDNSConfig(List<String> nameservers, List<PodDNSConfigOption> options, List<String> searches) {
        super();
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
    }

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    public List<String> getNameservers() {
        return nameservers;
    }

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    public void setNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
    }

    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    public List<PodDNSConfigOption> getOptions() {
        return options;
    }

    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    public void setOptions(List<PodDNSConfigOption> options) {
        this.options = options;
    }

    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    public List<String> getSearches() {
        return searches;
    }

    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    public void setSearches(List<String> searches) {
        this.searches = searches;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodDNSConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nameservers");
        sb.append('=');
        sb.append(((this.nameservers == null)?"<null>":this.nameservers));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null)?"<null>":this.options));
        sb.append(',');
        sb.append("searches");
        sb.append('=');
        sb.append(((this.searches == null)?"<null>":this.searches));
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
        result = ((result* 31)+((this.options == null)? 0 :this.options.hashCode()));
        result = ((result* 31)+((this.searches == null)? 0 :this.searches.hashCode()));
        result = ((result* 31)+((this.nameservers == null)? 0 :this.nameservers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodDNSConfig) == false) {
            return false;
        }
        PodDNSConfig rhs = ((PodDNSConfig) other);
        return ((((this.options == rhs.options)||((this.options!= null)&&this.options.equals(rhs.options)))&&((this.searches == rhs.searches)||((this.searches!= null)&&this.searches.equals(rhs.searches))))&&((this.nameservers == rhs.nameservers)||((this.nameservers!= null)&&this.nameservers.equals(rhs.nameservers))));
    }

}
