package net.sigmalab.jspart.domain;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.joda.time.DateTime;
import org.synyx.hades.domain.auditing.Auditable;

/**
 * @author     schrepfler
 */
@Entity
public abstract class Artifact implements Serializable, Auditable<User, Long> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5475751756531188668L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
	 * @uml.property  name="name"
	 */
    @Column(nullable = false)
    private String name;

    /**
	 * @uml.property  name="contributer"
	 * @uml.associationEnd  
	 */
    @ManyToOne
    private User contributer;
    
    /**
	 * @uml.property  name="editor"
	 * @uml.associationEnd  
	 */
    @ManyToOne
    private User editor;

    /**
	 * @uml.property  name="description"
	 * @uml.associationEnd  
	 */
    @OneToOne(cascade = CascadeType.ALL)
    private Comment description;

    /**
	 * @uml.property  name="createdDate"
	 */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    /**
	 * @uml.property  name="lastModifiedDate"
	 */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    /**
	 * @uml.property  name="enabledComments"
	 */
    private Boolean enabledComments = true;

    /**
	 * @uml.property  name="isDraft"
	 */
    private Boolean isDraft = false;

    /**
	 * @uml.property  name="length"
	 */
    private long length;
    
    /**
	 * @uml.property  name="tags"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Tag> tags;

    /**
	 * @return
	 * @uml.property  name="tags"
	 */
    public Set<Tag> getTags() {
        return tags;
    }

    /**
	 * @param  tags
	 * @uml.property  name="tags"
	 */
    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    /**
	 * @return
	 * @uml.property  name="length"
	 */
    public long getLength() {
        return length;
    }

    /**
	 * @param  length
	 * @uml.property  name="length"
	 */
    public void setLength(long length) {
        this.length = length;
    }

    /**
	 * @return
	 * @uml.property  name="contributer"
	 */
    public User getContributer() {
        return contributer;
    }

    /**
	 * @param  contributer
	 * @uml.property  name="contributer"
	 */
    public void setContributer(User contributer) {
        this.contributer = contributer;
    }

    /**
	 * @return
	 * @uml.property  name="description"
	 */
    public Comment getDescription() {
        return description;
    }

    /**
	 * @param  description
	 * @uml.property  name="description"
	 */
    public void setDescription(Comment description) {
        this.description = description;
    }

    /**
	 * @return
	 * @uml.property  name="enabledComments"
	 */
    public Boolean getEnabledComments() {
        return enabledComments;
    }

    /**
	 * @param  enabledComments
	 * @uml.property  name="enabledComments"
	 */
    public void setEnabledComments(Boolean enabledComments) {
        this.enabledComments = enabledComments;
    }

    /**
	 * @return
	 * @uml.property  name="id"
	 */
    public Long getId() {
        return id;
    }

    /**
	 * @param  id
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
        this.id = id;
    }

    /**
	 * @return
	 * @uml.property  name="isDraft"
	 */
    public Boolean getIsDraft() {
        return isDraft;
    }

    /**
	 * @param  isDraft
	 * @uml.property  name="isDraft"
	 */
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    /**
	 * @return
	 * @uml.property  name="name"
	 */
    public String getName() {
        return name;
    }

    /**
	 * @param  name
	 * @uml.property  name="name"
	 */
    public void setName(String name) {
        this.name = name;
    }


    /**
	 * @uml.property  name="uri"
	 */
    private String uri = "";

    /**
	 * Getter of the property <tt>uri</tt>
	 * @return   Returns the uri.
	 * @uml.property  name="uri"
	 */
    public String getUri() {
        return uri;
    }

    /**
	 * Setter of the property <tt>uri</tt>
	 * @param uri   The uri to set.
	 * @uml.property  name="uri"
	 */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
	 * @uml.property  name="artifactType"
	 * @uml.associationEnd  
	 */
    @ManyToOne
    private ArtifactType artifactType;

    /**
	 * @return
	 * @uml.property  name="artifactType"
	 */
    public ArtifactType getArtifactType() {
        return artifactType;
    }

    /**
	 * @param  artifactType
	 * @uml.property  name="artifactType"
	 */
    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }

    /**
	 * @uml.property  name="comments"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Comment> comments = new HashSet<Comment>();


    /**
	 * @return
	 * @uml.property  name="comments"
	 */
    public Set<Comment> getComments() {
        return comments;
    }

    /**
	 * @param  comments
	 * @uml.property  name="comments"
	 */
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

	public User getCreatedBy() {
		return contributer;
	}

	/**
	 * @return
	 * @uml.property  name="createdDate"
	 */
	public DateTime getCreatedDate() {
		return null == createdDate ? null : new DateTime(createdDate);
	}

	public User getLastModifiedBy() {
		return editor;
	}

	/**
	 * @return
	 * @uml.property  name="lastModifiedDate"
	 */
	public DateTime getLastModifiedDate() {
		return null == lastModifiedDate ? null : new DateTime(lastModifiedDate);
	}

	public void setCreated(DateTime creationDate) {
		this.createdDate = creationDate.toDate();
	}

	public void setCreatedBy(User createdBy) {
		this.contributer = createdBy;
	}

	public void setLastModified(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate.toDate();
		
	}

	public void setLastModifiedBy(User lastModifiedBy) {
		this.editor = lastModifiedBy;
		
	}

	public boolean isNew() {
		return null == getId();
	}

	public String toString() {
		return "Artifact [id=" + id + ", artifactType=" + artifactType
				+ ", comments=" + comments + ", contributer=" + contributer
				+ ", createdDate=" + createdDate + ", description="
				+ description + ", editor=" + editor + ", enabledComments="
				+ enabledComments + ", isDraft=" + isDraft
				+ ", lastModifiedDate=" + lastModifiedDate + ", length="
				+ length + ", name=" + name + ", tags=" + tags + ", uri=" + uri
				+ "]";
	}

}
