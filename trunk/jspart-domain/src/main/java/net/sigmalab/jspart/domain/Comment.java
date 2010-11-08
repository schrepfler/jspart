package net.sigmalab.jspart.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;
import org.synyx.hades.domain.Persistable;
import org.synyx.hades.domain.auditing.Auditable;

/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.User"
 */
@Entity
public class Comment implements Persistable<Long>, Auditable<User, Long> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1122572853909588725L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
	 * @uml.property  name="text"
	 */
    @Column(nullable = false)
    private String text;

    /**
	 * @uml.property  name="inReplyToComment"
	 * @uml.associationEnd  
	 */
    @OneToOne
    private Comment inReplyToComment;


    /**
	 * @uml.property  name="isEnabled"
	 */
    private Boolean isEnabled = true;

    /**
	 * @uml.property  name="isDraft"
	 */
    private Boolean isDraft = true;

    /**
	 * @uml.property  name="artifact"
	 * @uml.associationEnd  
	 */
    @OneToOne(cascade=CascadeType.ALL)
    private Artifact artifact;

    /**
	 * @uml.property  name="createdDate"
	 */
	@Temporal(TemporalType.TIMESTAMP)
   private Date createdDate;

    /**
	 * @uml.property  name="lastModifiedBy"
	 * @uml.associationEnd  
	 */
	private User lastModifiedBy = null;

    /**
	 * @uml.property  name="lastModifiedDate"
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

    /**
	 * @uml.property  name="createdBy"
	 * @uml.associationEnd  
	 */
	@ManyToOne
	private User createdBy = null;

    /**
	 * Getter of the property <tt>artifact</tt>
	 * @return    Returns the artifact.
	 * @uml.property  name="artifact"
	 */
    public Artifact getArtifact() {
		return artifact;
	}

    /**
	 * @return
	 * @uml.property  name="createdBy"
	 */
	public User getCreatedBy() {
		return createdBy;
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
	 * @uml.property  name="id"
	 */
    public Long getId() {
		return id;
	}

    /**
	 * @return
	 * @uml.property  name="inReplyToComment"
	 */
    public Comment getInReplyToComment() {
		return inReplyToComment;
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
	 * @uml.property  name="isEnabled"
	 */
    public Boolean getIsEnabled() {
		return isEnabled;
	}

    /**
	 * @return
	 * @uml.property  name="lastModifiedBy"
	 */
	public User getLastModifiedBy() {
		return lastModifiedBy;
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
	 * @uml.property  name="text"
	 */
    public String getText() {
		return text;
	}

	public boolean isNew() {
		return null == getId();
	}
	
	/**
	 * Setter of the property <tt>artifact</tt>
	 * @param artifact    The artifact to set.
	 * @uml.property  name="artifact"
	 */
    public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}

	public void setCreatedDate(DateTime createdDateTime) {
		this.createdDate = createdDateTime.toDate();
	}

	/**
	 * @param createdBy
	 * @uml.property  name="createdBy"
	 */
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	/**
	 * @param  id
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param  inReplyToComment
	 * @uml.property  name="inReplyToComment"
	 */
    public void setInReplyToComment(Comment inReplyToComment) {
		this.inReplyToComment = inReplyToComment;
	}

	/**
	 * @param  isDraft
	 * @uml.property  name="isDraft"
	 */
    public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	/**
	 * @param  isEnabled
	 * @uml.property  name="isEnabled"
	 */
    public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public void setLastModifiedDate(DateTime lastModifiedDateTime) {
		this.lastModifiedDate = lastModifiedDateTime.toDate();
	}

	/**
	 * @param lastModifiedBy
	 * @uml.property  name="lastModifiedBy"
	 */
	public void setLastModifiedBy(User lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	/**
	 * @param text
	 * @return
	 * @uml.property  name="text"
	 */
    public Comment setText(String text) {
		this.text = text;
		return this;
	}

}
