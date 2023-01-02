
package la.rebelion.k8s.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 * 
 * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "directory",
    "repository",
    "revision"
})
@Generated("jsonschema2pojo")
public class GitRepoVolumeSource {

    /**
     * directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    @JsonProperty("directory")
    @JsonPropertyDescription("directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.")
    private String directory;
    /**
     * repository is the URL
     * (Required)
     * 
     */
    @JsonProperty("repository")
    @JsonPropertyDescription("repository is the URL")
    private String repository;
    /**
     * revision is the commit hash for the specified revision.
     * 
     */
    @JsonProperty("revision")
    @JsonPropertyDescription("revision is the commit hash for the specified revision.")
    private String revision;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitRepoVolumeSource() {
    }

    /**
     * 
     * @param source
     */
    public GitRepoVolumeSource(GitRepoVolumeSource source) {
        super();
        this.directory = source.directory;
        this.repository = source.repository;
        this.revision = source.revision;
    }

    /**
     * 
     * @param repository
     * @param directory
     * @param revision
     */
    public GitRepoVolumeSource(String directory, String repository, String revision) {
        super();
        this.directory = directory;
        this.repository = repository;
        this.revision = revision;
    }

    /**
     * directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    /**
     * directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * repository is the URL
     * (Required)
     * 
     */
    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    /**
     * repository is the URL
     * (Required)
     * 
     */
    @JsonProperty("repository")
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * revision is the commit hash for the specified revision.
     * 
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * revision is the commit hash for the specified revision.
     * 
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitRepoVolumeSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("directory");
        sb.append('=');
        sb.append(((this.directory == null)?"<null>":this.directory));
        sb.append(',');
        sb.append("repository");
        sb.append('=');
        sb.append(((this.repository == null)?"<null>":this.repository));
        sb.append(',');
        sb.append("revision");
        sb.append('=');
        sb.append(((this.revision == null)?"<null>":this.revision));
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
        result = ((result* 31)+((this.repository == null)? 0 :this.repository.hashCode()));
        result = ((result* 31)+((this.directory == null)? 0 :this.directory.hashCode()));
        result = ((result* 31)+((this.revision == null)? 0 :this.revision.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitRepoVolumeSource) == false) {
            return false;
        }
        GitRepoVolumeSource rhs = ((GitRepoVolumeSource) other);
        return ((((this.repository == rhs.repository)||((this.repository!= null)&&this.repository.equals(rhs.repository)))&&((this.directory == rhs.directory)||((this.directory!= null)&&this.directory.equals(rhs.directory))))&&((this.revision == rhs.revision)||((this.revision!= null)&&this.revision.equals(rhs.revision))));
    }

}
