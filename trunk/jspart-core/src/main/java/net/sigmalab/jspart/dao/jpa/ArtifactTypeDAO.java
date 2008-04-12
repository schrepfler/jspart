/*
 * ArtifactTypeDAO.java
 * 
 * Created on Sep 10, 2007, 3:45:06 AM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.IArtifactTypeDAO;
import net.sigmalab.jspart.model.ArtifactType;

/**
 *
 * @author Srepfler Srgjan
 */
public class ArtifactTypeDAO extends DAO<ArtifactType, Long> implements IArtifactTypeDAO {

    public ArtifactTypeDAO() {
        super(ArtifactType.class);
    }

}
