package net.sigmalab.jspart.domain;

import java.util.Set;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * @uml.dependency  supplier="net.sigmalab.jspart.model.Artifact"
 */
@Entity
public class ArtifactCollection extends Artifact {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3243823226793442671L;
	/**
	 * @uml.property  name="artifacts"
	 */
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Artifact> artifacts = new java.util.HashSet<Artifact>();

    /**
	 * Getter of the property <tt>artifacts</tt>
	 * @return    Returns the artifacts.
	 * @uml.property  name="artifacts"
	 */
    public Set<Artifact> getArtifacts() {
        return artifacts;
    }

    /**
	 * Setter of the property <tt>artifacts</tt>
	 * @param artifacts    The artifacts to set.
	 * @uml.property  name="artifacts"
	 */
    public void setArtifacts(Set<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

}
