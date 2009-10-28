package net.sigmalab.jspart.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author    schrepfler
 */
@Entity
public class ContactInfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8886398233368560488L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
	 * @uml.property  name="type"
	 * @uml.associationEnd  
	 */
    @ManyToOne
    private ContactInfoType type;

    /**
	 * @uml.property  name="uri"
	 */
    private String uri;

    /**
	 * @return
	 * @uml.property  name="type"
	 */
    public ContactInfoType getType() {
        return type;
    }

    /**
	 * @param  type
	 * @uml.property  name="type"
	 */
    public void setType(ContactInfoType type) {
        this.type = type;
    }

    /**
	 * @return
	 * @uml.property  name="uri"
	 */
    public String getUri() {
        return uri;
    }

    /**
	 * @param  uri
	 * @uml.property  name="uri"
	 */
    public void setUri(String uri) {
        this.uri = uri;
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
}
