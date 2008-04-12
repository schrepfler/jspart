/*
 * IDaoFactory.java
 *
 * Created on November 18, 2006, 9:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.dao;

import net.sigmalab.jspart.dao.IAuthorDAO;

/**
 *
 * @author Srepfler Srgjan
 */
public abstract class DaoFactory{
	
	public static <T extends DaoFactory> T getDAOFactory(Class<T> factorytype) {
		try {
            return factorytype.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
	
    public abstract IAuthorDAO getAuthorDAO();
    
    public abstract IArtifactDAO getArtifactDAO();

    public abstract IRoleDAO getRoleDAO();
    
    public abstract IContactInfoTypeDAO getContactInfoTypeDAO();
    
    public abstract IImageArtifactDAO getImageArtifactDAO();
    
    public abstract ILicenceDAO getLicenceDAO();
    
    public abstract IArtifactTypeDAO getArtifactTypeDAO();
    
    public abstract ISoundArtifactDAO getSoundArtifactDAO();
    
    public abstract ITagTranslationDAO getTagTranslationDAO();
    
    public abstract ICommentDAO getCommentDAO();
    
    public abstract ITagDAO geTagDAO();
    
    public abstract IContactInfoDAO getContactInfoDAO();
}
