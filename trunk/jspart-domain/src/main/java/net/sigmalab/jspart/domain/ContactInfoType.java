package net.sigmalab.jspart.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author    schrepfler
 */
@Entity
public class ContactInfoType implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2875182660329046138L;

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
}
