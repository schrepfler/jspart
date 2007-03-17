package net.sigmalab.jspart.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@SuppressWarnings("serial")
@Entity
public class Author implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	private String name;

	private String surname;
	
	@ManyToMany(cascade=CascadeType.MERGE)
	private List<Role> roles = new ArrayList<Role>();

	@OneToMany(cascade=CascadeType.ALL)
	private List<ContactInfo> contactInfo = new ArrayList<ContactInfo>();
	
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

	public Date getBirthDay() {
		return birthDay;
	}

	public Author setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Author setCity(String city) {
		this.city = city;
		return this;
	}

	public List<ContactInfo> getContactInfo() {
		return contactInfo;
	}

	public Author setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public Author setCountry(String country) {
		this.country = country;
		return this;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Author setEnabled(Boolean enabled) {
		this.enabled = enabled;
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

	public Author setName(String name) {
		this.name = name;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Author setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public Author setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public Author setRoles(List<Role> roles) {
		this.roles = roles;
		return this;
	}

	public String getState() {
		return state;
	}

	public Author setState(String state) {
		this.state = state;
		return this;
	}

	public String getStreetName1() {
		return streetName1;
	}

	public Author setStreetName1(String streetName1) {
		this.streetName1 = streetName1;
		return this;
	}

	public String getStreetName2() {
		return streetName2;
	}

	public Author setStreetName2(String streetName2) {
		this.streetName2 = streetName2;
		return this;
	}

	public String getSurname() {
		return surname;
	}

	public Author setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public Author setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public Author setUsername(String username) {
		this.username = username;
		return this;
	}
        
        public String toString(){
            return ReflectionToStringBuilder.reflectionToString(this);
        }

}
