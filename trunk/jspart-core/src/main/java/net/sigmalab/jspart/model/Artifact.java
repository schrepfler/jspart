package net.sigmalab.jspart.model;

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
public class Artifact implements java.io.Serializable {

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

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Comment> comments = new HashSet<Comment>();

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Tag> tags = new HashSet<Tag>();

	private Boolean enabledComments = true;

	private Boolean isDraft = false;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Licence> licences = new HashSet<Licence>();
	
	public Set<Licence> getLicences() {
		return licences;
	}

	public Artifact setLicences(Set<Licence> licences) {
		this.licences = licences;
		return this;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public Artifact setComments(Set<Comment> comments) {
		this.comments = comments;
		return this;
	}

	public Author getContributer() {
		return contributer;
	}

	public Artifact setContributer(Author contributer) {
		this.contributer = contributer;
		return this;
	}

	public Comment getDescription() {
		return description;
	}

	public Artifact setDescription(Comment description) {
		this.description = description;
		return this;
	}

	public Date getEditDate() {
		return editDate;
	}

	public Artifact setEditDate(Date editDate) {
		this.editDate = editDate;
		return this;
	}

	public Boolean getEnabledComments() {
		return enabledComments;
	}

	public Artifact setEnabledComments(Boolean enabledComments) {
		this.enabledComments = enabledComments;
		return this;
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

	public Artifact setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
		return this;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public Artifact setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		return this;
	}

	public String getName() {
		return name;
	}

	public Artifact setName(String name) {
		this.name = name;
		return this;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public Artifact setTags(Set<Tag> tags) {
		this.tags = tags;
		return this;
	}

        public String toString(){
            return ReflectionToStringBuilder.reflectionToString(this);
        }
}
