package net.sigmalab.jspart.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@SuppressWarnings("serial")
@Entity
public abstract class Artifact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Author contributer;

    @OneToOne(cascade = CascadeType.ALL)
    private Comment description;

    @Temporal(value = TemporalType.DATE)
    private Date insertDate;

    @Temporal(value = TemporalType.DATE)
    private Date editDate;

    private Boolean enabledComments = true;

    private Boolean isDraft = false;

    private long length;
    
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Tag> tags;

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Author getContributer() {
        return contributer;
    }

    public void setContributer(Author contributer) {
        this.contributer = contributer;
    }

    public Comment getDescription() {
        return description;
    }

    public void setDescription(Comment description) {
        this.description = description;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Boolean getEnabledComments() {
        return enabledComments;
    }

    public void setEnabledComments(Boolean enabledComments) {
        this.enabledComments = enabledComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }

    /**
     * @uml.property name="uri"
     */
    private String uri = "";

    /**
     * Getter of the property <tt>uri</tt>
     * 
     * @return Returns the uri.
     * @uml.property name="uri"
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter of the property <tt>uri</tt>
     * 
     * @param uri
     *            The uri to set.
     * @uml.property name="uri"
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    private ArtifactType artifactType;

    public ArtifactType getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }

    @OneToMany(cascade=CascadeType.ALL)
    private Set<Comment> comments = new HashSet<Comment>();


    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

}
