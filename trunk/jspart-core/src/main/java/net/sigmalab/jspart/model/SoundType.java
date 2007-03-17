package net.sigmalab.jspart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class SoundType implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String name;

	private Boolean isPreviewable;

	public Boolean getIsPreviewable() {
		return isPreviewable;
	}

	public SoundType setIsPreviewable(Boolean isPreviewable) {
		this.isPreviewable = isPreviewable;
		return this;
	}

	public String getName() {
		return name;
	}

	public SoundType setName(String name) {
		this.name = name;
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}