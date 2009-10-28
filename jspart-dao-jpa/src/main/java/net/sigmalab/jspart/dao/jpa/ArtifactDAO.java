package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.IArtifactDAO;
import net.sigmalab.jspart.domain.Artifact;

@Transactional
public class ArtifactDAO extends DAO<Artifact,Long> implements IArtifactDAO {
	
	public ArtifactDAO(){
		super(Artifact.class);
	}
}
