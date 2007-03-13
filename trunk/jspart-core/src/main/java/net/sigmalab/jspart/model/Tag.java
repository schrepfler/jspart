package net.sigmalab.jspart.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
public class Tag implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String name;
    
    private String type;
    
    @Transient
    private Long tagCount;
    
    @OneToMany(cascade=CascadeType.ALL)
    private Set<TagTranslation> tagTranslations;

    public void setTagTranslations(Set<TagTranslation> tagTranslations) {
        this.tagTranslations = tagTranslations;
    }
    
    public Set<TagTranslation> getTagTranslations() {
        return tagTranslations;
    }

    public Long getTagCount() {
        return tagCount;
    }
    
    public Tag setTagCount(Long tagCount) {
        this.tagCount = tagCount;
        return this;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public Tag setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getType() {
        return type;
    }
    
    public Tag setType(String type) {
        this.type = type;
        return this;
    }
    
}
