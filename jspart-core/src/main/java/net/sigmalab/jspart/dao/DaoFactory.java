/*
 * IDaoFactory.java
 *
 * Created on November 18, 2006, 9:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart.dao;

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
	
    public abstract IArtistDAO getArtistDAO();
    
    public abstract IArtifactDAO getArtifactDAO();
    
    public abstract IRoleDAO getRoleDAO();
    
}
