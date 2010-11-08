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
    
//    /**
//	 * @uml.property  name="tags"
//	 */
//    @OneToMany(cascade = CascadeType.ALL)
//	private Set<Tag> tags;

//    /** 
//	 * @return
//	 * @uml.property  name="tags"
//	 */
//    public Set<Tag> getTags() {
//		return tags;
//	}
//
//    /** 
//	 * @param tags
//	 * @uml.property  name="tags"
//	 */
//    public void setTags(Set<Tag> tags) {
//		this.tags = tags;
//	}

    /**
	 * @uml.property  name="uri"
	 */
    private String uri = "";

    /**
	 * @uml.property  name="comments"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Comment> comments = new HashSet<Comment>();

    /**
	 * @uml.property  name="tags"
	 * @uml.associationEnd  multiplicity="(0 -1)" aggregation="composite" inverse="artifact:net.sigmalab.jspart.domain.Tag"
	 * @uml.association  name="tags"
	 */
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Tag> tags;

    /**
	 * @return
	 * @uml.property  name="comments"
	 */
    public Set<Comment> getComments() {
		return comments;
	}

    /**
	 * @return
	 * @uml.property  name="contributer"
	 */
    public User getContributer() {
		return contributer;
	}

    /**
	 * 
	 * @uml.property  name="createdBy"
	 */
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

    /**
	 * @return
	 * @uml.property  name="description"
	 */
    public Comment getDescription() {
		return description;
	}

    /**
	 * @return
	 * @uml.property  name="enabledComments"
	 */
    public Boolean getEnabledComments() {
		return enabledComments;
	}

    /**
	 * @return
	 * @uml.property  name="id"
	 */
    public Long getId() {
		return id;
	}

    /**
	 * @return
	 * @uml.property  name="isDraft"
	 */
    public Boolean getIsDraft() {
		return isDraft;
	}

    /**
	 * @return
	 * @uml.property  name="lastModifiedBy"
	 */
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

    /**
	 * @return
	 * @uml.property  name="name"
	 */
    public String getName() {
		return name;
	}

    /**
	 * Getter of the property <tt>tag</tt>
	 * @return  Returns the tag.
	 * @uml.property  name="tags"
	 */
	public Set<Tag> getTags() {
		return tags;
	}


    /**
	 * Getter of the property <tt>uri</tt>
	 * @return   Returns the uri.
	 * @uml.property  name="uri"
	 */
    public String getUri() {
		return uri;
	}


    public boolean isNew() {
		return null == getId();
	}

    /**
	 * @param  comments
	 * @uml.property  name="comments"
	 */
    public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

    /**
	 * @param  contributer
	 * @uml.property  name="contributer"
	 */
    public void setContributer(User contributer) {
		this.contributer = contributer;
	}

	public void setCreatedDate(DateTime creationDate) {
		this.createdDate = creationDate.toDate();
	}
	/**
	 * 
	 * @uml.property  name="createdBy"
	 */
	public void setCreatedBy(User createdBy) {
		this.contributer = createdBy;
	}

	/**
	 * @param  description
	 * @uml.property  name="description"
	 */
    public void setDescription(Comment description) {
		this.description = description;
	}

	/**
	 * @param  enabledComments
	 * @uml.property  name="enabledComments"
	 */
    public void setEnabledComments(Boolean enabledComments) {
		this.enabledComments = enabledComments;
	}
	
	/**
	 * @param  id
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param  isDraft
	 * @uml.property  name="isDraft"
	 */
    public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
	/**
	 * 
	 * @uml.property  name="lastModifiedDate"
	 */
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate.toDate();
	
	}

	/**
	 * 
	 * @uml.property  name="lastModifiedBy"
	 */
	public void setLastModifiedBy(User lastModifiedBy) {
		this.editor = lastModifiedBy;
	
	}

	/**
	 * @param  name
	 * @uml.property  name="name"
	 */
    public void setName(String name) {
		this.name = name;
	}


	/**
	 * Setter of the property <tt>tag</tt>
	 * @param tag  The tag to set.
	 * @uml.property  name="tags"
	 */
	public void setTag(Set<Tag> tags) {
		this.tags = tags;
	}

	/**
	 * Setter of the property <tt>uri</tt>
	 * @param uri   The uri to set.
	 * @uml.property  name="uri"
	 */
    public void setUri(String uri) {
		this.uri = uri;
	}

	public String toString() {
		return "Artifact [id=" + id + ", comments=" + comments + ", contributer=" + contributer
				+ ", createdDate=" + createdDate + ", description="
				+ description + ", editor=" + editor + ", enabledComments="
				+ enabledComments + ", isDraft=" + isDraft
				+ ", lastModifiedDate=" + lastModifiedDate + ", length="
				+ ", name=" + name + ", tags=" + tags + ", uri=" + uri
				+ "]";
	}

}
