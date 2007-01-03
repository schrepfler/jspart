package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.ISoundTypeDAO;
import net.sigmalab.jspart.model.SoundType;

@Transactional
public class SoundTypeDAO extends DAO<SoundType,Long> implements ISoundTypeDAO{
	
	public SoundTypeDAO(){
		super(SoundType.class);
	}
}
