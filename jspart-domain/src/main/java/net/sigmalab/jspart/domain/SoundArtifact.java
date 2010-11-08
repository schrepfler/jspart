package net.sigmalab.jspart.domain;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * @author   schrepfler
 */
@Entity
public class SoundArtifact extends Artifact implements Serializable, IFileArtifact {

    /**
	 * 
	 */
	private static final long serialVersionUID = -486647435945109847L;
	/**
	 * @uml.property  name="bitrate"
	 */
    private int bitrate = 0;

    /**
	 * @uml.property  name="timeLength"
	 */
    private int timeLength = 0;

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
	 * Getter of the property <tt>bitrate</tt>
	 * @return   Returns the bitrate.
	 * @uml.property  name="bitrate"
	 */
    public int getBitrate() {
        return bitrate;
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
    	// TODO Auto-generated method stub
    	return 0;
    }
    
    /**
	 * Getter of the property <tt>timeLength</tt>
	 * @return   Returns the timeLength.
	 * @uml.property  name="timeLength"
	 */
    public int getTimeLength() {
        return timeLength;
    }
    
    /**
	 * @return
	 * @uml.property  name="artifactType"
	 */
    public void setArtifactType(ArtifactType artifactType) {
		this.artifactType = artifactType;
	}
    
    
    /**
	 * Setter of the property <tt>bitrate</tt>
	 * @param bitrate   The bitrate to set.
	 * @uml.property  name="bitrate"
	 */
    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }
    
    /**
	 * @param file
	 * @uml.property  name="file"
	 */
    public void setFile(File file) {
		this.file = file;
	}
    
    /**
	 * Setter of the property <tt>timeLength</tt>
	 * @param timeLength   The timeLength to set.
	 * @uml.property  name="timeLength"
	 */
    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }

}
