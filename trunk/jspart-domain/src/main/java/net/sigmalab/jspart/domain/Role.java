package net.sigmalab.jspart.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author    schrepfler
 */
@Entity(name = "Roles")
public class Role implements java.io.Serializable {

	public static class Builder {
		private Long id;
		private String name;
		private String description;

		public Role build() {
			return new Role(this);
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3102944980174473638L;

	/**
	 * @uml.property  name="id"
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	/**
	 * @uml.property  name="name"
	 */
	@Column(unique = true, nullable = false)
	private String name;

	/**
	 * @uml.property  name="description"
	 */
	private String description;

	@OneToMany(mappedBy = "role")
    private Set<UserRole> userRoles;

	@ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();

	public Role(){
	
	}

	private Role(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.description = builder.description;
	}

	/**
	 * @return
	 * @uml.property  name="description"
	 */
	public String getDescription() {
		return description;
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
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param  description
	 * @uml.property  name="description"
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param  id
	 * @uml.property  name="id"
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param name
	 * @return
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
