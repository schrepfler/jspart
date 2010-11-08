package net.sigmalab.jspart.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity @IdClass(UserRolePK.class)
@Table(name = "USERS_ROLES")
public class UserRole {
    @Id
    private User user;

    @Id
    private Role role;

	public Role getRole() {
		return role;
	}

	public User getUser() {
		return user;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
}