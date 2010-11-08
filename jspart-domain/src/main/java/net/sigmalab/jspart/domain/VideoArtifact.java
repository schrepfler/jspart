package net.sigmalab.jspart.domain;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.VideoType"
 */
@Entity
public class VideoArtifact extends Artifact implements IFileArtifact {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2374601370558069059L;
	/**
	 * @uml.property  name="timeLength"
	 */
    private int timeLength;

    /**
	 * @uml.property  name="width"
	 */
    private int width = 0;

    /**
	 * @uml.property  name="height"
	 */
    private int height = 0;

    /**
	 * @uml.property  name="file"
	 */
    @Transient
    private File file;

    /**
	 * @param artifactType
	 * @uml.property  name="artifactType"
	 */
    @ManyToOne
    private ArtifactType artifactType;

    /**
	 * @return
	 * @uml.property  name="artifactType"
	 */
    public ArtifactType getArtifactType() {
    	return artifactType;
    }

    /**
	 * @return
	 * @uml.property  name="file"
	 */
    public File getFile() {
    	return file;
    }

    @Override
    public int getFileSize() {
    	return 0;
    }

    /**
	 * Getter of the property <tt>height</tt>
	 * @return    Returns the height.
	 * @uml.property  name="height"
	 */
    public int getHeight() {
        return height;
    }
    
    /**
	 * @return
	 * @uml.property  name="timeLength"
	 */
    public int getTimeLength() {
        return timeLength;
    }
    
    /**
	 * Getter of the property <tt>width</tt>
	 * @return    Returns the width.
	 * @uml.property  name="width"
	 */
    public int getWidth() {
        return width;
    }
    
    /**
	 * @return
	 * @uml.property  name="artifactType"
	 */
    public void setArtifactType(ArtifactType artifactType) {
		this.artifactType = artifactType;
	}
    
    /**
	 * @param file
	 * @uml.property  name="file"
	 */
    public void setFile(File file) {
		this.file = file;
	}
    
    
    /**
	 * Setter of the property <tt>height</tt>
	 * @param height    The height to set.
	 * @uml.property  name="height"
	 */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
	 * @param  timeLength
	 * @uml.property  name="timeLength"
	 */
    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }
    
    /**
	 * Setter of the property <tt>width</tt>
	 * @param width    The width to set.
	 * @uml.property  name="width"
	 */
    public void setWidth(int width) {
        this.width = width;
    }
}
