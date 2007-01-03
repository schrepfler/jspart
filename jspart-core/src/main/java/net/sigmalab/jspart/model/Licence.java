package net.sigmalab.jspart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Licence implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String name, url, code, buttonImage;

	public String getName() {
		return name;
	}

	public Licence setName(String name) {
		this.name = name;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public Licence setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getButtonImage() {
		return buttonImage;
	}

	public Licence setButtonImage(String buttonImage) {
		this.buttonImage = buttonImage;
		return this;
	}

	public String getCode() {
		return code;
	}

	public Licence setCode(String code) {
		this.code = code;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
