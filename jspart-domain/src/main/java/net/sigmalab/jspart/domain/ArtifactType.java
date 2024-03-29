package net.sigmalab.jspart.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author   schrepfler
 */
@Entity
public class ArtifactType implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6313974190791182731L;
	/**
	 * @uml.property  name="id"
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
	 * @uml.property  name="isPreviewable"
	 */
    private Boolean isPreviewable;

    /**
	 * @uml.property  name="mimeType"
	 */
    private String mimeType = "";

    /**
	 * @uml.property  name="mimeTypeHandler"
	 */
    private String mimeTypeHandler = "";

    /**
	 * Getter of the property <tt>id</tt>
	 * @return    Returns the id.
	 * @uml.property  name="id"
	 */
    public Long getId() {
        return id;
    }

    /**
	 * Getter of the property <tt>isPreviewable</tt>
	 * @return    Returns the isPreviewable.
	 * @uml.property  name="isPreviewable"
	 */
    public Boolean getIsPreviewable() {
        return isPreviewable;
    }

    /**
	 * Getter of the property <tt>mimeType</tt>
	 * @return    Returns the mimeType.
	 * @uml.property  name="mimeType"
	 */
    public String getMimeType() {
        return mimeType;
    }

    /**
	 * Getter of the property <tt>mimeTypeHandler</tt>
	 * @return    Returns the mimeTypeHandler.
	 * @uml.property  name="mimeTypeHandler"
	 */
    public String getMimeTypeHandler() {
        return mimeTypeHandler;
    }

    /**
	 * Setter of the property <tt>id</tt>
	 * @param id    The id to set.
	 * @uml.property  name="id"
	 */
    public void setId(Long id) {
        this.id = id;
    }

    /**
	 * Setter of the property <tt>isPreviewable</tt>
	 * @param isPreviewable    The isPreviewable to set.
	 * @uml.property  name="isPreviewable"
	 */
    public void setIsPreviewable(Boolean isPreviewable) {
        this.isPreviewable = isPreviewable;
    }

    /**
	 * Setter of the property <tt>mimeType</tt>
	 * @param mimeType    The mimeType to set.
	 * @uml.property  name="mimeType"
	 */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
	 * Setter of the property <tt>mimeTypeHandler</tt>
	 * @param mimeTypeHandler    The mimeTypeHandler to set.
	 * @uml.property  name="mimeTypeHandler"
	 */
    public void setMimeTypeHandler(String mimeTypeHandler) {
        this.mimeTypeHandler = mimeTypeHandler;
    }

}
