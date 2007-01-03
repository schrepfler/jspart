package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.ITagDAO;
import net.sigmalab.jspart.model.Tag;

@Transactional
public class TagDAO extends DAO<Tag,Long> implements ITagDAO{
	
	public TagDAO(){
		super(Tag.class);
	}
}
