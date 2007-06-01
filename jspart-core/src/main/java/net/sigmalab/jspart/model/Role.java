package net.sigmalab.jspart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity(name="Roles")
public class Role implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

        @Column(unique=true, nullable=false)
	private String name;

	private String description;

	public String getDescription() {
		return description;
	}

	public Role description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public Role id(Long id) {
		this.id = id;
                return this;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Role setName(String name) {
		this.name = name;
		return this;
	}

	public Role name(String name) {
		this.name = name;
		return this;
	}

}
