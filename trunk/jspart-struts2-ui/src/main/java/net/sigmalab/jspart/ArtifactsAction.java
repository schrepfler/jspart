/*
 * ArtifactsAction.java
 * 
 * Created on May 27, 2007, 2:19:04 AM
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart;

import com.opensymphony.xwork2.Preparable;
import java.util.List;
import net.sigmalab.jspart.dao.DaoFactory;
import net.sigmalab.jspart.dao.IArtifactDAO;
import net.sigmalab.jspart.dao.jpa.JpaDAOFactory;
import net.sigmalab.jspart.model.Artifact;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.DefaultActionSupport;

/**
 *
 * @author Srepfler Srgjan
 */
@SuppressWarnings("serial")
@Results({
    @Result(name=DefaultActionSupport.SUCCESS, value="/jsp/artifacts.jsp"),
    @Result(name=DefaultActionSupport.INPUT,value="/jsp/artifactForm.jsp")
})
public class ArtifactsAction extends DefaultActionSupport implements Preparable {

    private List<Artifact> artifacts;
    private Artifact artifact;
    private IArtifactDAO artifactDAO = DaoFactory.getDAOFactory(JpaDAOFactory.class).getArtifactDAO();

    public ArtifactsAction(Artifact artifact) {
        this.artifact = artifact;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }
    
    public ArtifactsAction() {
    }
    
    public String doList() {
        artifacts = artifactDAO.getAll();
        return SUCCESS;
    }
    
    public String doInput() {
        return INPUT;
    }
    
    public String doSave() {
        artifact = artifactDAO.save(artifact);
        return SUCCESS;
    }
    
    public String doDelete() {
        artifactDAO.remove(artifact.getId());
        return SUCCESS;
    }
    
    public List<Artifact> getArtifacts(){
        return artifacts;
    }

    public void prepare() throws Exception {
        artifacts = artifactDAO.getAll();
        if(artifact != null && artifact.getId() != null){
            artifact = artifactDAO.get(artifact.getId());
        }
    }

}
