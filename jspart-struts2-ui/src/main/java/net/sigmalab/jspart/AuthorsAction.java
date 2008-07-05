/*
 * AuthorsAction.java
 * 
 * Created on May 25, 2007, 4:18:57 AM
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sigmalab.jspart;

import com.opensymphony.xwork2.Preparable;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import net.sigmalab.jspart.dao.DaoFactory;
import net.sigmalab.jspart.dao.IArtifactDAO;
import net.sigmalab.jspart.dao.IAuthorDAO;
import net.sigmalab.jspart.dao.jpa.JpaDAOFactory;
import net.sigmalab.jspart.model.ArtifactType;
import net.sigmalab.jspart.model.Author;
import net.sigmalab.jspart.model.ImageArtifact;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.joda.time.Instant;

/**
 *
 * @author Srepfler Srgjan
 */
@SuppressWarnings("serial")
@Results({
    @Result
    (name=DefaultActionSupport.SUCCESS, value="/jsp/authors.jsp"),
    @Result(name=DefaultActionSupport.INPUT,value="/jsp/authorForm.jsp"),
    @Result(name="saved",value="authors.action",type=ServletActionRedirectResult.class)
})
public class AuthorsAction extends DefaultActionSupport implements Preparable {
    private List<Author> authors;
    private Author author;
    private File avatarFile;
    private String contentType;
    private String filename;
    
    private IAuthorDAO authorDAO = DaoFactory.getDAOFactory(JpaDAOFactory.class).getAuthorDAO();
    private IArtifactDAO artifactDAO = DaoFactory.getDAOFactory(JpaDAOFactory.class).getArtifactDAO();

    public void setAvatarFileContentType(String contentType) {
        this.contentType = contentType;
     }

     public void setAvatarFileFileName(String filename) {
        this.filename = filename;
     }
    
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String getBirthDay(){
    	return SimpleDateFormat.getDateInstance().format(author.getBirthDay());
    }
    
    public void setAvatarFile(File avatar){
    	this.avatarFile = avatar; 
    }
    
    /** Creates a new instance of Authors */
    public AuthorsAction() {
    }
    
    public String doList() {
        authors = authorDAO.getAll();
        return SUCCESS;
    }
    
    public String doInput() {
        return INPUT;
    }
    
    public String doSave() {
    	ImageArtifact imageArtifact = new ImageArtifact();
        imageArtifact.setName("avatar");
        if(avatarFile!=null){
            System.out.println(avatarFile.getName()+":"+avatarFile.getPath());
            System.out.println(this.contentType);
            System.out.println(this.filename);
            FilenameUtils.getExtension(avatarFile.getPath());
            imageArtifact.setName(avatarFile.getName());
            author.setAvatar(imageArtifact);
        } else {
            imageArtifact.setUri("defaultavatar.jpg");
            ArtifactType artifactType = new ArtifactType();
            artifactType.setMimeType("jpg");
            artifactType.setIsPreviewable(true);
            imageArtifact.setArtifactType(artifactType);
            author.setAvatar(imageArtifact);
        }
    	author = authorDAO.save(author);
        if(imageArtifact.getId()!=null){
            File destFile = new File(imageArtifact.getId()+"."+FilenameUtils.getExtension(this.filename));
    	try {
                FileUtils.copyFile(avatarFile, destFile);
            } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
        }
        return "saved";
    }
    
    public String doDelete() {
    	
        authorDAO.remove(author.getId());
        return SUCCESS;
    }
    
    public List<Author> getAuthors(){
        return authors;
    }
    
    public void prepare() throws Exception {
        authors = authorDAO.getAll();
        if(author != null && author.getId() != null){
            author = authorDAO.get(author.getId());
        }
        if(author==null){
            author = new Author();
            author.setBirthDay(new Instant().toDate());
        }
    }

}
