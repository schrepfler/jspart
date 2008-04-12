package net.sigmalab.jspart.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class AuthorLocale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    /**
     * @uml.property  name="language"
     */
    private String language = "";

    /**
     * Getter of the property <tt>language</tt>
     * @return  Returns the language.
     * @uml.property  name="language"
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter of the property <tt>language</tt>
     * @param language  The language to set.
     * @uml.property  name="language"
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @uml.property  name="country"
     */
    private String country = "";

    /**
     * Getter of the property <tt>country</tt>
     * @return  Returns the country.
     * @uml.property  name="country"
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter of the property <tt>country</tt>
     * @param country  The country to set.
     * @uml.property  name="country"
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @uml.property  name="variant"
     */
    private String variant = "";

    /**
     * Getter of the property <tt>variant</tt>
     * @return  Returns the variant.
     * @uml.property  name="variant"
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Setter of the property <tt>variant</tt>
     * @param variant  The variant to set.
     * @uml.property  name="variant"
     */
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * @uml.property  name="importance"
     */
    private int importance;

    /**
     * Getter of the property <tt>importance</tt>
     * @return  Returns the importance.
     * @uml.property  name="importance"
     */
    public int getImportance() {
        return importance;
    }

    /**
     * Setter of the property <tt>importance</tt>
     * @param importance  The importance to set.
     * @uml.property  name="importance"
     */
    public void setImportance(int importance) {
        this.importance = importance;
    }

}
