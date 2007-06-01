/*
 * TagTranslation.java
 *
 * Created on March 11, 2007, 6:15 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Srepfler Srgjan
 */
@Entity
public class TagTranslation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String language;
    private String translatedText;
    
    /** Creates a new instance of TagTranslation */
    public TagTranslation() {
    }
    
    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
    
    public TagTranslation translatedText(String translatedText) {
        this.translatedText = translatedText;
        return this;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TagTranslation language(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TagTranslation id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

}
