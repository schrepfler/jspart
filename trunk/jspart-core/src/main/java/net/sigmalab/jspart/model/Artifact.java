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
        
        private Long length;

        public Long getLength() {
            return length;
        }

        public void setLength(Long length) {
            this.length = length;
        }

        public Artifact length(Long length) {
            this.length = length;
            return this;
        }
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Licence> licences = new HashSet<Licence>();
	
	public Set<Licence> getLicences() {
		return licences;
	}

	public Artifact licences(Set<Licence> licences) {
		this.licences = licences;
		return this;
	}

	public void setLicences(Set<Licence> licences) {
		this.licences = licences;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Artifact comments(Set<Comment> comments) {
		this.comments = comments;
		return this;
	}

	public Author getContributer() {
		return contributer;
	}

	public Artifact contributer(Author contributer) {
		this.contributer = contributer;
		return this;
	}

	public void setContributer(Author contributer) {
		this.contributer = contributer;
	}

	public Comment getDescription() {
		return description;
	}

	public Artifact description(Comment description) {
		this.description = description;
		return this;
	}

	public void setDescription(Comment description) {
		this.description = description;
	}

	public Date getEditDate() {
		return editDate;
	}

	public Artifact editDate(Date editDate) {
		this.editDate = editDate;
		return this;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public Boolean getEnabledComments() {
		return enabledComments;
	}

	public Artifact enabledComments(Boolean enabledComments) {
		this.enabledComments = enabledComments;
		return this;
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

	public Artifact id(Long id) {
		this.id = id;
                return this;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public Artifact insertDate(Date insertDate) {
		this.insertDate = insertDate;
		return this;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public Artifact isDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		return this;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public String getName() {
		return name;
	}

	public Artifact name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public Artifact tags(Set<Tag> tags) {
		this.tags = tags;
		return this;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

        public String toString(){
            return ReflectionToStringBuilder.reflectionToString(this);
        }
}
