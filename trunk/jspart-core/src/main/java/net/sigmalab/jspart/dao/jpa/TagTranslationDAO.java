package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.ITagTranslationDAO;
import net.sigmalab.jspart.model.TagTranslation;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TagTranslationDAO extends DAO<TagTranslation,Long> implements ITagTranslationDAO{
	public TagTranslationDAO(){
		super(TagTranslation.class);
	}
}
