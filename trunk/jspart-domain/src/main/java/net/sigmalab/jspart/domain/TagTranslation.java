/*
 * TagTranslation.java
 *
 * Created on March 11, 2007, 6:15 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author    Srepfler Srgjan
 */
@Entity
public class TagTranslation implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8972784177223751512L;
	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
	 * @uml.property  name="language"
	 */
    private String language;
    /**
	 * @uml.property  name="translatedText"
	 */
    private String translatedText;

    /**
	 * @param  translatedText
	 * @uml.property  name="translatedText"
	 */
    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    /**
	 * @return
	 * @uml.property  name="translatedText"
	 */
    public String getTranslatedText() {
        return translatedText;
    }

    /**
	 * @param  language
	 * @uml.property  name="language"
	 */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
	 * @return
	 * @uml.property  name="language"
	 */
    public String getLanguage() {
        return language;
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
	 * @uml.property  name="id"
	 */
    public Long getId() {
        return id;
    }

}
