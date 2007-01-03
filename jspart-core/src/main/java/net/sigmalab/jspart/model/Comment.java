package net.sigmalab.jspart.model;

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

@SuppressWarnings("serial")
@Entity
public class Comment implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(nullable = false)
	private String text;

	@ManyToOne(cascade = CascadeType.ALL)
	private Author commenter;

	@OneToOne(cascade = CascadeType.ALL)
	private Artifact inReferenceToArtifact;

	@OneToOne
	private Comment inReplyToComment;

	@Temporal(value = TemporalType.DATE)
	private Date insertDate;

	@Temporal(value = TemporalType.DATE)
	private Date editDate;

	private Boolean isEnabled = true;

	private Boolean isDraft = true;

	public Author getCommenter() {
		return commenter;
	}

	public Comment setCommenter(Author commenter) {
		this.commenter = commenter;
		return this;
	}

	public Date getEditDate() {
		return editDate;
	}

	public Comment setEditDate(Date editDate) {
		this.editDate = editDate;
		return this;
	}

	public Artifact getInReferenceToArtifact() {
		return inReferenceToArtifact;
	}

	public Comment setInReferenceToArtifact(Artifact inReferenceToArtifact) {
		this.inReferenceToArtifact = inReferenceToArtifact;
		return this;
	}

	public Comment getInReplyToComment() {
		return inReplyToComment;
	}

	public Comment setInReplyToComment(Comment inReplyToComment) {
		this.inReplyToComment = inReplyToComment;
		return this;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public Comment setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
		return this;
	}

	public String getText() {
		return text;
	}

	public Comment setText(String text) {
		this.text = text;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public Comment setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		return this;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public Comment setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

}
