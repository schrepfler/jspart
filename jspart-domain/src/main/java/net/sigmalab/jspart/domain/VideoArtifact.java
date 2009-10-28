package net.sigmalab.jspart.domain;

import javax.persistence.Entity;


/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.VideoType"
 */
@Entity
public class VideoArtifact extends Artifact {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2374601370558069059L;
	/**
	 * @uml.property  name="timeLength"
	 */
    private int timeLength;

    /**
	 * @return
	 * @uml.property  name="timeLength"
	 */
    public int getTimeLength() {
        return timeLength;
    }

    /**
	 * @param  timeLength
	 * @uml.property  name="timeLength"
	 */
    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }

    /**
	 * @uml.property  name="width"
	 */
    private int width = 0;

    /**
	 * Getter of the property <tt>width</tt>
	 * @return    Returns the width.
	 * @uml.property  name="width"
	 */
    public int getWidth() {
        return width;
    }

    /**
	 * Setter of the property <tt>width</tt>
	 * @param width    The width to set.
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
	 * @return    Returns the height.
	 * @uml.property  name="height"
	 */
    public int getHeight() {
        return height;
    }

    /**
	 * Setter of the property <tt>height</tt>
	 * @param height    The height to set.
	 * @uml.property  name="height"
	 */
    public void setHeight(int height) {
        this.height = height;
    }
    
}
