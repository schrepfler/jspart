package net.sigmalab.jspart.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 * @uml.dependency supplier="net.sigmalab.jspart.model.Artifact"
 *                 kind="abstraction"
 */
@SuppressWarnings("serial")
@Entity
public class ImageArtifact extends Artifact implements Serializable {

    /**
     * @uml.property name="width"
     */
    private int width = 0;

    /**
     * Getter of the property <tt>width</tt>
     * 
     * @return Returns the width.
     * @uml.property name="width"
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter of the property <tt>width</tt>
     * 
     * @param width
     *            The width to set.
     * @uml.property name="width"
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @uml.property name="height"
     */
    private int height = 0;

    /**
     * Getter of the property <tt>height</tt>
     * 
     * @return Returns the height.
     * @uml.property name="height"
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter of the property <tt>height</tt>
     * 
     * @param height
     *            The height to set.
     * @uml.property name="height"
     */
    public void setHeight(int height) {
        this.height = height;
    }

}
