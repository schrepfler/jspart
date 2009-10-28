package net.sigmalab.jspart.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.synyx.hades.domain.Persistable;

/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.ImageArtifact"
 */
@Entity
@Table(name="Users")
public class User implements Persistable<Long> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8750332347793923194L;

	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
	 * @uml.property  name="username"
	 */
    @Column(nullable = false, unique = true)
    private String username;

    /**
	 * @uml.property  name="password"
	 */
    @Column(nullable = false)
    private String password;

    /**
	 * @uml.property  name="name"
	 */
    private String name;

    /**
	 * @uml.property  name="surname"
	 */
    private String surname;

    /**
	 * @uml.property  name="enabled"
	 */
    @Column(nullable = false)
    private Boolean enabled = false;

    /**
	 * @uml.property  name="birthDay"
	 */
    @Temporal(value = TemporalType.DATE)
    private Date birthDay;

    /**
	 * @uml.property  name="timeZone"
	 */
    private TimeZone timeZone;

    /**
	 * @uml.property  name="streetName1"
	 */
    private String streetName1;

    /**
	 * @uml.property  name="streetName2"
	 */
    private String streetName2;

    /**
	 * @uml.property  name="city"
	 */
    private String city;

    /**
	 * @uml.property  name="postalCode"
	 */
    private String postalCode;

    /**
	 * @uml.property  name="state"
	 */
    private String state;

    /**
	 * @uml.property  name="country"
	 */
    private String country;

    /**
	 * @uml.property  name="avatar"
	 * @uml.associationEnd  
	 */
    @OneToOne(cascade = CascadeType.ALL)
    private ImageArtifact avatar;

    /**
	 * @return
	 * @uml.property  name="avatar"
	 */
    public ImageArtifact getAvatar() {
        return avatar;
    }

    /**
	 * @param  avatar
	 * @uml.property  name="avatar"
	 */
    public void setAvatar(ImageArtifact avatar) {
        this.avatar = avatar;
    }

    /**
	 * @return
	 * @uml.property  name="birthDay"
	 */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
	 * @param  birthDay
	 * @uml.property  name="birthDay"
	 */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
	 * @return
	 * @uml.property  name="city"
	 */
    public String getCity() {
        return city;
    }

    /**
	 * @param  city
	 * @uml.property  name="city"
	 */
    public void setCity(String city) {
        this.city = city;
    }

    /**
	 * @return
	 * @uml.property  name="country"
	 */
    public String getCountry() {
        return country;
    }

    /**
	 * @param  country
	 * @uml.property  name="country"
	 */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
	 * @return
	 * @uml.property  name="enabled"
	 */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
	 * @param  enabled
	 * @uml.property  name="enabled"
	 */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
	 * @param  name
	 * @uml.property  name="name"
	 */
    public void setName(String name) {
        this.name = name;
    }

    /**
	 * @return
	 * @uml.property  name="password"
	 */
    public String getPassword() {
        return password;
    }

    /**
	 * @param  password
	 * @uml.property  name="password"
	 */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
	 * @return
	 * @uml.property  name="postalCode"
	 */
    public String getPostalCode() {
        return postalCode;
    }

    /**
	 * @param  postalCode
	 * @uml.property  name="postalCode"
	 */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
	 * @return
	 * @uml.property  name="state"
	 */
    public String getState() {
        return state;
    }

    /**
	 * @param  state
	 * @uml.property  name="state"
	 */
    public void setState(String state) {
        this.state = state;
    }

    /**
	 * @return
	 * @uml.property  name="streetName1"
	 */
    public String getStreetName1() {
        return streetName1;
    }

    /**
	 * @param  streetName1
	 * @uml.property  name="streetName1"
	 */
    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    /**
	 * @return
	 * @uml.property  name="streetName2"
	 */
    public String getStreetName2() {
        return streetName2;
    }

    /**
	 * @param  streetName2
	 * @uml.property  name="streetName2"
	 */
    public void setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
    }

    /**
	 * @return
	 * @uml.property  name="surname"
	 */
    public String getSurname() {
        return surname;
    }

    /**
	 * @param  surname
	 * @uml.property  name="surname"
	 */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
	 * @return
	 * @uml.property  name="timeZone"
	 */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
	 * @param  timeZone
	 * @uml.property  name="timeZone"
	 */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    /**
	 * @return
	 * @uml.property  name="username"
	 */
    public String getUsername() {
        return username;
    }

    /**
	 * @param  username
	 * @uml.property  name="username"
	 */
    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", avatar=" + avatar + ", birthDay=" + birthDay + ", city="
				+ city + ", contactInfos=" + contactInfos + ", country="
				+ country + ", enabled=" + enabled + ", languages=" + languages
				+ ", password=" + password + ", postalCode=" + postalCode
				+ ", roles=" + roles + ", state=" + state + ", streetName1="
				+ streetName1 + ", streetName2=" + streetName2 + ", timeZone="
				+ timeZone + ", username=" + username + "]";
	}

	/**
	 * @uml.property  name="contactInfos"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    /**
	 * @uml.property  name="roles"
	 */
    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Role> roles = new HashSet<Role>();

    /**
	 * Getter of the property <tt>roles</tt>
	 * @return    Returns the role.
	 * @uml.property  name="roles"
	 */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
	 * Setter of the property <tt>roles</tt>
	 * @param roles    The role to set.
	 * @uml.property  name="roles"
	 */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
	 * Getter of the property <tt>contactInfos</tt>
	 * @return    Returns the contactInfo.
	 * @uml.property  name="contactInfos"
	 */
    public Set<ContactInfo> getContactInfos() {
        return contactInfos;
    }

    /**
	 * Setter of the property <tt>contactInfos</tt>
	 * @param contactInfos    The contactInfo to set.
	 * @uml.property  name="contactInfos"
	 */
    public void setContactInfos(Set<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }

 	public boolean isNew() {
 		return null == getId();
 	}
 	
 	/**
	 * @uml.property  name="languages"
	 */
 	@OneToMany
 	private List<Language> languages;
 	
 	/**
	 * @return
	 * @uml.property  name="languages"
	 */
 	public List<Language> getLanguages() {
		return languages;
	}
 	
 	/**
	 * @param languages
	 * @uml.property  name="languages"
	 */
 	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

}
