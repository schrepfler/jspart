package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.IContactInfoDAO;
import net.sigmalab.jspart.model.ContactInfo;

@Transactional
public class ContactInfoDAO extends DAO<ContactInfo,Long> implements IContactInfoDAO{
	
	public ContactInfoDAO(){
		super(ContactInfo.class);
	}
}
