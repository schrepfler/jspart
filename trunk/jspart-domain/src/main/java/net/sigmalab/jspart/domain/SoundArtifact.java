package net.sigmalab.jspart.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author   schrepfler
 */
@Entity
public class SoundArtifact extends Artifact implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -486647435945109847L;
	/**
	 * @uml.property  name="bitrate"
	 */
    private int bitrate = 0;

    /**
	 * Getter of the property <tt>bitrate</tt>
	 * @return   Returns the bitrate.
	 * @uml.property  name="bitrate"
	 */
    public int getBitrate() {
        return bitrate;
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
	 * @uml.property  name="timeLength"
	 */
    private int timeLength = 0;

    /**
	 * Getter of the property <tt>timeLength</tt>
	 * @return   Returns the timeLength.
	 * @uml.property  name="timeLength"
	 */
    public int getTimeLength() {
        return timeLength;
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
