package net.sigmalab.jspart.domain;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.Artifact" kind="abstraction"
 */
@Entity
public class ImageArtifact extends Artifact implements Serializable, IFileArtifact {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5239676722682897319L;
	/**
	 * @uml.property  name="width"
	 */
    private int width = 0;

    /**
	 * Getter of the property <tt>width</tt>
	 * @return   Returns the width.
	 * @uml.property  name="width"
	 */
    public int getWidth() {
        return width;
    }

    /**
	 * Setter of the property <tt>width</tt>
	 * @param width   The width to set.
	 * @uml.property  name="width"
	 */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
	 * @uml.property  name="height"
	 */
    private int height = 0;

    /**
	 * Getter of the property <tt>height</tt>
	 * @return   Returns the height.
	 * @uml.property  name="height"
	 */
    public int getHeight() {
        return height;
    }

    /**
	 * Setter of the property <tt>height</tt>
	 * @param height   The height to set.
	 * @uml.property  name="height"
	 */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
	 * @uml.property  name="file"
	 */
    @Transient
    private File file;
    
    /**
	 * @return
	 * @uml.property  name="file"
	 */
    public File getFile() {
    	return file;
    }
    
    /**
	 * @param file
	 * @uml.property  name="file"
	 */
    public void setFile(File file) {
		this.file = file;
	}

}
