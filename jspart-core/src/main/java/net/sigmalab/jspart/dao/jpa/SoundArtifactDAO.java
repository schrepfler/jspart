package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.ISoundArtifactDAO;
import net.sigmalab.jspart.model.SoundArtifact;

@Transactional
public class SoundArtifactDAO extends DAO<SoundArtifact,Long> implements ISoundArtifactDAO{
	
	public SoundArtifactDAO(){
		super(SoundArtifact.class);
	}
}
