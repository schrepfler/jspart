package net.sigmalab.jspart.domain;

import javax.persistence.Entity;


/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.Artifact"
 */
@Entity
public class TextArtifact extends Artifact {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1932040397594979456L;
	/**
	 * @uml.property  name="text"
	 */
    private String text = "";

    /**
	 * Getter of the property <tt>text</tt>
	 * @return    Returns the text.
	 * @uml.property  name="text"
	 */
    public String getText() {
        return text;
    }

    /**
	 * Setter of the property <tt>text</tt>
	 * @param text    The text to set.
	 * @uml.property  name="text"
	 */
    public void setText(String text) {
        this.text = text;
    }

}
