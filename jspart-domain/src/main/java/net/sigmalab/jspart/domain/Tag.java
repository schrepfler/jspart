package net.sigmalab.jspart.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 * @author    schrepfler
 */
@Entity
public class Tag implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6939551787759568L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
	 * @uml.property  name="name"
	 */
    private String name;

    /**
	 * @uml.property  name="type"
	 */
    private String type;

    /**
	 * @uml.property  name="tagCount"
	 */
    @Transient
    private Long tagCount;

    /**
	 * @uml.property  name="tagTranslations"
	 */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<TagTranslation> tagTranslations;

    /**
	 * @uml.property  name="artifact"
	 * @uml.associationEnd  inverse="tag:net.sigmalab.jspart.domain.Artifact"
	 * @uml.association  name="tags"
	 */
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
	 * @return
	 * @uml.property  name="id"
	 */
    public Long getId() {
		return id;
	}

    /**
	 * @return
	 * @uml.property  name="name"
	 */
    public String getName() {
		return name;
	}

    /**
	 * @return
	 * @uml.property  name="tagCount"
	 */
    public Long getTagCount() {
		return tagCount;
	}

    /**
	 * @return
	 * @uml.property  name="tagTranslations"
	 */
    public Set<TagTranslation> getTagTranslations() {
		return tagTranslations;
	}

    /**
	 * @return
	 * @uml.property  name="type"
	 */
    public String getType() {
		return type;
	}

    /**
	 * Setter of the property <tt>artifact</tt>
	 * @param artifact  The artifact to set.
	 * @uml.property  name="artifact"
	 */
	public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}

    /**
	 * @param  id
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
		this.id = id;
	}

    /**
	 * @param  name
	 * @uml.property  name="name"
	 */
    public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param  tagCount
	 * @uml.property  name="tagCount"
	 */
    public void setTagCount(Long tagCount) {
		this.tagCount = tagCount;
	}

	/**
	 * @param  tagTranslations
	 * @uml.property  name="tagTranslations"
	 */
    public void setTagTranslations(Set<TagTranslation> tagTranslations) {
		this.tagTranslations = tagTranslations;
	}

	/**
	 * @param  type
	 * @uml.property  name="type"
	 */
    public void setType(String type) {
		this.type = type;
	}

}
