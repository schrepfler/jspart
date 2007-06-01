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

	public Comment commenter(Author commenter) {
		this.commenter = commenter;
		return this;
	}

	public void setCommenter(Author commenter) {
		this.commenter = commenter;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Comment editDate(Date editDate) {
		this.editDate = editDate;
		return this;
	}

	public Artifact getInReferenceToArtifact() {
		return inReferenceToArtifact;
	}

	public Comment inReferenceToArtifact(Artifact inReferenceToArtifact) {
		this.inReferenceToArtifact = inReferenceToArtifact;
		return this;
	}

	public void setInReferenceToArtifact(Artifact inReferenceToArtifact) {
		this.inReferenceToArtifact = inReferenceToArtifact;
	}

	public Comment getInReplyToComment() {
		return inReplyToComment;
	}

	public void setInReplyToComment(Comment inReplyToComment) {
		this.inReplyToComment = inReplyToComment;
	}

	public Comment inReplyToComment(Comment inReplyToComment) {
		this.inReplyToComment = inReplyToComment;
		return this;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Comment insertDate(Date insertDate) {
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

	public Comment id(Long id) {
		this.id = id;
                return this;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public Comment isDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		return this;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Comment isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

}
