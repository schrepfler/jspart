/*
 * JpaDAOFactory.java
 *
 * Created on November 18, 2006, 9:34 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.DaoFactory;
import net.sigmalab.jspart.dao.IArtifactDAO;
import net.sigmalab.jspart.dao.IArtistDAO;
import net.sigmalab.jspart.dao.ICommentDAO;
import net.sigmalab.jspart.dao.IContactInfoDAO;
import net.sigmalab.jspart.dao.IContactInfoTypeDAO;
import net.sigmalab.jspart.dao.IImageArtifactDAO;
import net.sigmalab.jspart.dao.IImageTypeDAO;
import net.sigmalab.jspart.dao.ILicenceDAO;
import net.sigmalab.jspart.dao.IRoleDAO;
import net.sigmalab.jspart.dao.ISoundArtifactDAO;
import net.sigmalab.jspart.dao.ISoundTypeDAO;
import net.sigmalab.jspart.dao.ITagDAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Srepfler Srgjan
 */
public class JpaDAOFactory extends DaoFactory{
    
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
    private BeanFactory beanFactory = (BeanFactory) applicationContext;
    
    /** Creates a new instance of JpaDAOFactory */
    public JpaDAOFactory() {
    }

    public IArtifactDAO getArtifactDAO() {
        return (IArtifactDAO) beanFactory.getBean("jpaArtifactDAO");
    }
    
    public IArtistDAO getArtistDAO() {
        return (IArtistDAO) beanFactory.getBean("jpaArtistDAO");
    }
    
    public ICommentDAO getCommentDAO(){
    	return (ICommentDAO) beanFactory.getBean("jpaCommentDAO");
    }
    
    public IContactInfoDAO getContactInfoDAO(){
    	return (IContactInfoDAO) beanFactory.getBean("jpaContactInfoDAO");
    }
    
    public IContactInfoTypeDAO getContactInfoTypeDAO(){
    	return (IContactInfoTypeDAO)beanFactory.getBean("jpaContactInfoTypeDAO");
    }
    
    public IImageArtifactDAO getImageArtifactDAO(){
    	return (IImageArtifactDAO)beanFactory.getBean("jpaImageArtifactDAO");
    }
    
    public IImageTypeDAO getImageTypeDAO(){
    	return (IImageTypeDAO)beanFactory.getBean("jpaImageTypeDAO");
    }
    
    public ILicenceDAO getLicenceDAO(){
    	return (ILicenceDAO)beanFactory.getBean("jpaLicenceDAO");
    }
    
    public IRoleDAO getRoleDAO() {
        return (IRoleDAO) beanFactory.getBean("jpaRoleDAO");
    }
    
    public ISoundArtifactDAO getSoundArtifactDAO(){
    	return (ISoundArtifactDAO)beanFactory.getBean("jpaSoundArtifactDAO");
    }
    
    public ISoundTypeDAO getSoundTypeDAO(){
    	return (ISoundTypeDAO)beanFactory.getBean("jpaSoundTypeDAO");
    }
    
    public ITagDAO geTagDAO(){
    	return (ITagDAO)beanFactory.getBean("jpaTagDAO");
    }
}
