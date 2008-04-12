package net.sigmalab.jspart.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * @uml.dependency supplier="net.sigmalab.jspart.model.ImageArtifact"
 */
@SuppressWarnings("serial")
@Entity
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String name;

    private String surname;

    @Column(nullable = false)
    private Boolean enabled = false;

    @Temporal(value = TemporalType.DATE)
    private Date birthDay;

    private TimeZone timeZone;

    private String streetName1;

    private String streetName2;

    private String city;

    private String postalCode;

    private String state;

    private String country;

    @OneToOne(cascade = CascadeType.ALL)
    private ImageArtifact avatar;

    public ImageArtifact getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageArtifact avatar) {
        this.avatar = avatar;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName1() {
        return streetName1;
    }

    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    public String getStreetName2() {
        return streetName2;
    }

    public void setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }

    /** 
     * @uml.property name="authorLocales"
     * @uml.associationEnd multiplicity="(0 -1)" aggregation="composite" inverse="author:net.sigmalab.jspart.model.AuthorLocale"
     */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<AuthorLocale> authorLocales;

    /** 
     * @uml.property name="contactInfos"
     * @uml.associationEnd multiplicity="(0 -1)" aggregation="composite" inverse="author:net.sigmalab.jspart.model.ContactInfo"
     */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    /** 
     * @uml.property name="roles"
     * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="author:net.sigmalab.jspart.model.Role"
     */
    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Role> roles = new HashSet<Role>();

    /**
     * Getter of the property <tt>roles</tt>
     * @return  Returns the role.
     * @uml.property  name="roles"
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Setter of the property <tt>roles</tt>
     * @param roles  The role to set.
     * @uml.property  name="roles"
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * Getter of the property <tt>authorLocales</tt>
     * @return  Returns the authorLocale.
     * @uml.property  name="authorLocales"
     */
    public Set<AuthorLocale> getAuthorLocales() {
        return authorLocales;
    }

    /**
     * Setter of the property <tt>authorLocales</tt>
     * @param authorLocales  The authorLocale to set.
     * @uml.property  name="authorLocales"
     */
    public void setAuthorLocales(Set<AuthorLocale> authorLocales) {
        this.authorLocales = authorLocales;
    }

    /**
     * Getter of the property <tt>contactInfos</tt>
     * @return  Returns the contactInfo.
     * @uml.property  name="contactInfos"
     */
    public Set<ContactInfo> getContactInfos() {
        return contactInfos;
    }

    /**
     * Setter of the property <tt>contactInfos</tt>
     * @param contactInfos  The contactInfo to set.
     * @uml.property  name="contactInfos"
     */
    public void setContactInfos(Set<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }

}
