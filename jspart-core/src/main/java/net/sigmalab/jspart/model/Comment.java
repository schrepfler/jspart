package net.sigmalab.jspart.model;

import java.io.Serializable;
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

/**
 * @uml.dependency supplier="net.sigmalab.jspart.model.Author"
 */
@SuppressWarnings("serial")
@Entity
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String text;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author commenter;

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

    public void setCommenter(Author commenter) {
        this.commenter = commenter;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Comment getInReplyToComment() {
        return inReplyToComment;
    }

    public void setInReplyToComment(Comment inReplyToComment) {
        this.inReplyToComment = inReplyToComment;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
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

    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /** 
     * @uml.property name="artifact"
     * @uml.associationEnd multiplicity="(1 1)" inverse="comments:net.sigmalab.jspart.model.Artifact"
     */
    @OneToOne(cascade=CascadeType.ALL)
    private Artifact artifact;

    /** 
     * Getter of the property <tt>artifact</tt>
     * @return  Returns the artifact.
     * @uml.property  name="artifact"
     */
    public Artifact getArtifact() {
        return artifact;
    }

    /** 
     * Setter of the property <tt>artifact</tt>
     * @param artifact  The artifact to set.
     * @uml.property  name="artifact"
     */
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

}
