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
	 * @uml.property  name="avatar"
	 * @uml.associationEnd  
	 */
    @OneToOne(cascade = CascadeType.ALL)
    private ImageArtifact avatar;

	/**
	 * @uml.property  name="birthDay"
	 */
    @Temporal(value = TemporalType.DATE)
    private Date birthDay;

    /**
	 * @uml.property  name="contactInfos"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<ContactInfo> contactInfos;

    /**
	 * @uml.property  name="enabled"
	 */
    @Column(nullable = false)
    private Boolean enabled = false;

    /**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
	 * @uml.property  name="languages"
	 */
 	@OneToMany
 	private List<Language> languages;

    /**
	 * @uml.property  name="name"
	 */
    private String name;

    /**
	 * @uml.property  name="password"
	 */
    @Column(nullable = false)
    private String password;

    /**
	 * @uml.property  name="roles"
	 */
    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Role> roles = new HashSet<Role>();

    /**
	 * @uml.property  name="surname"
	 */
    private String surname;

    /**
	 * @uml.property  name="timeZone"
	 */
    private TimeZone timeZone;

    /**
	 * @uml.property  name="username"
	 */
    @Column(nullable = false, unique = true)
    private String username;
    
    private CivicAddress address;

    /**
	 * 
	 */
	private static final long serialVersionUID = 8750332347793923194L;

    /**
	 * @return
	 * @uml.property  name="avatar"
	 */
    public ImageArtifact getAvatar() {
        return avatar;
    }

    /**
	 * @return
	 * @uml.property  name="birthDay"
	 */
    public Date getBirthDay() {
        return birthDay;
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
	 * @return
	 * @uml.property  name="enabled"
	 */
    public Boolean getEnabled() {
        return enabled;
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
	 * @uml.property  name="languages"
	 */
 	public List<Language> getLanguages() {
		return languages;
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
	 * @uml.property  name="password"
	 */
    public String getPassword() {
        return password;
    }

    /**
	 * Getter of the property <tt>roles</tt>
	 * @return    Returns the role.
	 * @uml.property  name="roles"
	 */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
	 * @return
	 * @uml.property  name="surname"
	 */
    public String getSurname() {
        return surname;
    }

    /**
	 * @return
	 * @uml.property  name="timeZone"
	 */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
	 * @return
	 * @uml.property  name="username"
	 */
    public String getUsername() {
        return username;
    }

    public boolean isNew() {
 		return null == getId();
 	}

    /**
	 * @param  avatar
	 * @uml.property  name="avatar"
	 */
    public void setAvatar(ImageArtifact avatar) {
        this.avatar = avatar;
    }

    /**
	 * @param  birthDay
	 * @uml.property  name="birthDay"
	 */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

	/**
	 * Setter of the property <tt>contactInfos</tt>
	 * @param contactInfos    The contactInfo to set.
	 * @uml.property  name="contactInfos"
	 */
    public void setContactInfos(Set<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }

    /**
	 * @param  enabled
	 * @uml.property  name="enabled"
	 */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
	 * @param  id
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
        this.id = id;
    }

    /**
	 * @param languages
	 * @uml.property  name="languages"
	 */
 	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

    /**
	 * @param  name
	 * @uml.property  name="name"
	 */
    public void setName(String name) {
        this.name = name;
    }

    /**
	 * @param  password
	 * @uml.property  name="password"
	 */
    public void setPassword(String password) {
        this.password = password;
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
	 * @param  surname
	 * @uml.property  name="surname"
	 */
    public void setSurname(String surname) {
        this.surname = surname;
    }
 	
 	/**
	 * @param  timeZone
	 * @uml.property  name="timeZone"
	 */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }
 	
 	/**
	 * @param  username
	 * @uml.property  name="username"
	 */
    public void setUsername(String username) {
        this.username = username;
    }

	public CivicAddress getAddress() {
		return address;
	}

	public void setAddress(CivicAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [avatar=");
		builder.append(avatar);
		builder.append(", birthDay=");
		builder.append(birthDay);
		builder.append(", contactInfos=");
		builder.append(contactInfos);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append(", id=");
		builder.append(id);
		builder.append(", languages=");
		builder.append(languages);
		builder.append(", name=");
		builder.append(name);
		builder.append(", password=");
		builder.append(password);
		builder.append(", roles=");
		builder.append(roles);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", timeZone=");
		builder.append(timeZone);
		builder.append(", username=");
		builder.append(username);
		builder.append("]");
		return builder.toString();
	}

}
