package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.IRoleDAO;
import net.sigmalab.jspart.domain.Role;

@Transactional
public class RoleDAO extends DAO<Role, Long> implements IRoleDAO {

	public RoleDAO() {
		super(Role.class);
	}

//    @SuppressWarnings("unchecked")
//	public List<Role> getAll() {
//        return getJpaTemplate().find("from Role");
//    }
//
//    public Role get(Long id) {
//        return getJpaTemplate().find(Role.class, id);
//    }
//
//    public Role save(Role role) {
//    if(getJpaTemplate().getEntityManager().contains(role)){
//			getJpaTemplate().merge(role);
//		} else {
//			getJpaTemplate().persist(role);
//		}
//		return role;
//    }
//
//    public void remove(Long id) {
//        getJpaTemplate().remove(this.get(id));
//    }

	
}
