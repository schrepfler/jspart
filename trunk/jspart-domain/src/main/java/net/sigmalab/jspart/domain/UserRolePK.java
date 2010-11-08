package net.sigmalab.jspart.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UserRolePK {
    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
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