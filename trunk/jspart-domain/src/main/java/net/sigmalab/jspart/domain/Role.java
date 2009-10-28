package net.sigmalab.jspart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author    schrepfler
 */
@Entity(name = "Roles")
public class Role implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3102944980174473638L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
	 * @uml.property  name="name"
	 */
    @Column(unique = true, nullable = false)
    private String name;

    /**
	 * @uml.property  name="description"
	 */
    private String description;

    /**
	 * @return
	 * @uml.property  name="description"
	 */
    public String getDescription() {
        return description;
    }

    /**
	 * @param  description
	 * @uml.property  name="description"
	 */
    public void setDescription(String description) {
        this.description = description;
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
	 * @param name
	 * @return
	 * @uml.property  name="name"
	 */
    public Role setName(String name) {
        this.name = name;
        return this;
    }

}
