package net.sigmalab.jspart.domain;

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
public class Tag implements java.io.Serializable {

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
	 * @param  tagTranslations
	 * @uml.property  name="tagTranslations"
	 */
    public void setTagTranslations(Set<TagTranslation> tagTranslations) {
        this.tagTranslations = tagTranslations;
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
	 * @uml.property  name="tagCount"
	 */
    public Long getTagCount() {
        return tagCount;
    }

    /**
	 * @param  tagCount
	 * @uml.property  name="tagCount"
	 */
    public void setTagCount(Long tagCount) {
        this.tagCount = tagCount;
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
	 * @return
	 * @uml.property  name="type"
	 */
    public String getType() {
        return type;
    }

    /**
	 * @param  type
	 * @uml.property  name="type"
	 */
    public void setType(String type) {
        this.type = type;
    }

}
