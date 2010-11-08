package net.sigmalab.jspart.domain;

import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author  schrepfler
 */
@Entity
public class Language {
	
	/**
	 * @uml.property  name="id"
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	/**
	 * @uml.property  name="locale"
	 */
	private Locale locale;
	
	/**
	 * @return
	 * @uml.property  name="id"
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return
	 * @uml.property  name="locale"
	 */
	public Locale getLocale() {
		return locale;
	}
	
	/**
	 * @param id
	 * @uml.property  name="id"
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @param locale
	 * @uml.property  name="locale"
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "Language [locale=" + locale + "]";
	}

}
