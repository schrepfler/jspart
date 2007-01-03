package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.ILicenceDAO;
import net.sigmalab.jspart.model.Licence;

@Transactional
public class LicenceDAO extends DAO<Licence,Long> implements ILicenceDAO{
	
	public LicenceDAO(){
		super(Licence.class);
	}
}
