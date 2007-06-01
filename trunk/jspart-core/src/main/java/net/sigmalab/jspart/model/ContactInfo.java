package net.sigmalab.jspart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ContactInfo implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne
	private ContactInfoType type;

	private String uri;

	
	public ContactInfoType getType() {
		return type;
	}

	public ContactInfo type(ContactInfoType type) {
		this.type = type;
		return this;
	}

	public void setType(ContactInfoType type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public ContactInfo uri(String uri) {
		this.uri = uri;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContactInfo id(Long id) {
		this.id = id;
                return this;
	}
}
