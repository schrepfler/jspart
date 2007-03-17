package net.sigmalab.jspart.dao.jpa;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import net.sigmalab.jspart.dao.IDAO;

@Transactional
public class DAO<T, PK extends Serializable> extends JpaDaoSupport implements IDAO<T, PK> {
    
    private Class<T> persistentClass;
    
    public DAO(Class<T> persistentClass){
        this.persistentClass = persistentClass;
    }
    
    public T get(Serializable id) {
        return getJpaTemplate().find(this.persistentClass, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return getJpaTemplate().find("from "+this.persistentClass.getName());
    }
    
    public void remove(PK id) {
        getJpaTemplate().remove(this.get(id));
    }
    
    public T save(T object) {
        return getJpaTemplate().merge(object);
    }
    
}
