package net.sigmalab.jspart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author    schrepfler
 */
@Entity
public class Licence implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1985184810582903828L;

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
	 * @uml.property  name="url"
	 */
	private String url;

	/**
	 * @uml.property  name="code"
	 */
	private String code;

	/**
	 * @uml.property  name="buttonImage"
	 */
	private String buttonImage;

    /**
	 * @return
	 * @uml.property  name="buttonImage"
	 */
    public String getButtonImage() {
        return buttonImage;
    }

    /**
	 * @return
	 * @uml.property  name="code"
	 */
    public String getCode() {
        return code;
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
	 * @uml.property  name="url"
	 */
    public String getUrl() {
        return url;
    }

    /**
	 * @param  buttonImage
	 * @uml.property  name="buttonImage"
	 */
    public void setButtonImage(String buttonImage) {
        this.buttonImage = buttonImage;
    }

    /**
	 * @param  code
	 * @uml.property  name="code"
	 */
    public void setCode(String code) {
        this.code = code;
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
	 * @param  url
	 * @uml.property  name="url"
	 */
    public void setUrl(String url) {
        this.url = url;
    }
}
