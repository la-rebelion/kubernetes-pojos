
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Info contains versioning information. how we'll want to distribute that information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "buildDate",
    "compiler",
    "gitCommit",
    "gitTreeState",
    "gitVersion",
    "goVersion",
    "major",
    "minor",
    "platform"
})
@Generated("jsonschema2pojo")
public class Info {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildDate")
    private String buildDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compiler")
    private String compiler;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitCommit")
    private String gitCommit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitTreeState")
    private String gitTreeState;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitVersion")
    private String gitVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("goVersion")
    private String goVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("major")
    private String major;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minor")
    private String minor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param source
     */
    public Info(Info source) {
        super();
        this.buildDate = source.buildDate;
        this.compiler = source.compiler;
        this.gitCommit = source.gitCommit;
        this.gitTreeState = source.gitTreeState;
        this.gitVersion = source.gitVersion;
        this.goVersion = source.goVersion;
        this.major = source.major;
        this.minor = source.minor;
        this.platform = source.platform;
    }

    /**
     * 
     * @param gitVersion
     * @param gitCommit
     * @param major
     * @param minor
     * @param goVersion
     * @param buildDate
     * @param compiler
     * @param gitTreeState
     * @param platform
     */
    public Info(String buildDate, String compiler, String gitCommit, String gitTreeState, String gitVersion, String goVersion, String major, String minor, String platform) {
        super();
        this.buildDate = buildDate;
        this.compiler = compiler;
        this.gitCommit = gitCommit;
        this.gitTreeState = gitTreeState;
        this.gitVersion = gitVersion;
        this.goVersion = goVersion;
        this.major = major;
        this.minor = minor;
        this.platform = platform;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildDate")
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("buildDate")
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compiler")
    public String getCompiler() {
        return compiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compiler")
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitCommit")
    public String getGitCommit() {
        return gitCommit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitCommit")
    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitTreeState")
    public String getGitTreeState() {
        return gitTreeState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitTreeState")
    public void setGitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitVersion")
    public String getGitVersion() {
        return gitVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gitVersion")
    public void setGitVersion(String gitVersion) {
        this.gitVersion = gitVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("goVersion")
    public String getGoVersion() {
        return goVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("goVersion")
    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("major")
    public String getMajor() {
        return major;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("major")
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minor")
    public String getMinor() {
        return minor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minor")
    public void setMinor(String minor) {
        this.minor = minor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("buildDate");
        sb.append('=');
        sb.append(((this.buildDate == null)?"<null>":this.buildDate));
        sb.append(',');
        sb.append("compiler");
        sb.append('=');
        sb.append(((this.compiler == null)?"<null>":this.compiler));
        sb.append(',');
        sb.append("gitCommit");
        sb.append('=');
        sb.append(((this.gitCommit == null)?"<null>":this.gitCommit));
        sb.append(',');
        sb.append("gitTreeState");
        sb.append('=');
        sb.append(((this.gitTreeState == null)?"<null>":this.gitTreeState));
        sb.append(',');
        sb.append("gitVersion");
        sb.append('=');
        sb.append(((this.gitVersion == null)?"<null>":this.gitVersion));
        sb.append(',');
        sb.append("goVersion");
        sb.append('=');
        sb.append(((this.goVersion == null)?"<null>":this.goVersion));
        sb.append(',');
        sb.append("major");
        sb.append('=');
        sb.append(((this.major == null)?"<null>":this.major));
        sb.append(',');
        sb.append("minor");
        sb.append('=');
        sb.append(((this.minor == null)?"<null>":this.minor));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
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
        result = ((result* 31)+((this.gitVersion == null)? 0 :this.gitVersion.hashCode()));
        result = ((result* 31)+((this.gitCommit == null)? 0 :this.gitCommit.hashCode()));
        result = ((result* 31)+((this.major == null)? 0 :this.major.hashCode()));
        result = ((result* 31)+((this.minor == null)? 0 :this.minor.hashCode()));
        result = ((result* 31)+((this.goVersion == null)? 0 :this.goVersion.hashCode()));
        result = ((result* 31)+((this.buildDate == null)? 0 :this.buildDate.hashCode()));
        result = ((result* 31)+((this.compiler == null)? 0 :this.compiler.hashCode()));
        result = ((result* 31)+((this.gitTreeState == null)? 0 :this.gitTreeState.hashCode()));
        result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Info) == false) {
            return false;
        }
        Info rhs = ((Info) other);
        return ((((((((((this.gitVersion == rhs.gitVersion)||((this.gitVersion!= null)&&this.gitVersion.equals(rhs.gitVersion)))&&((this.gitCommit == rhs.gitCommit)||((this.gitCommit!= null)&&this.gitCommit.equals(rhs.gitCommit))))&&((this.major == rhs.major)||((this.major!= null)&&this.major.equals(rhs.major))))&&((this.minor == rhs.minor)||((this.minor!= null)&&this.minor.equals(rhs.minor))))&&((this.goVersion == rhs.goVersion)||((this.goVersion!= null)&&this.goVersion.equals(rhs.goVersion))))&&((this.buildDate == rhs.buildDate)||((this.buildDate!= null)&&this.buildDate.equals(rhs.buildDate))))&&((this.compiler == rhs.compiler)||((this.compiler!= null)&&this.compiler.equals(rhs.compiler))))&&((this.gitTreeState == rhs.gitTreeState)||((this.gitTreeState!= null)&&this.gitTreeState.equals(rhs.gitTreeState))))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))));
    }

}
