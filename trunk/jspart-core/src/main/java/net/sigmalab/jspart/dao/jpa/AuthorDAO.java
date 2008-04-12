/*
 * IArtistDAO.java
 *
 * Created on June 26, 2006, 1:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.IAuthorDAO;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.model.Author;

/**
 *
 * @author Srgjan Srepfler
 */
@Transactional
public class AuthorDAO extends DAO<Author, Long> implements IAuthorDAO{

	public AuthorDAO() {
		super(Author.class);
	}
    
//    @SuppressWarnings("unchecked")
//	public List<Author> getAll() {
//        return super.getJpaTemplate().find("from Author");
//    }
//    
//    public Author get(Long id) {
//        return super.getJpaTemplate().find(Author.class, id);
//    }
//    
//    public Author save(Author artist) {
//        if (super.getJpaTemplate().getEntityManager().contains(artist)) {
//        	super.getJpaTemplate().merge(artist);
//        } else {
//        	super.getJpaTemplate().persist(artist);
//        }
//        super.getJpaTemplate().flush();
//        return artist;
//    }
//    
//    public void remove(Long id) {
//    	super.getJpaTemplate().remove(this.get(id));
//    }
    
}
