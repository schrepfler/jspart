package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;
import net.sigmalab.jspart.dao.ITagDAO;
import net.sigmalab.jspart.dao.ITagTranslationDAO;
import net.sigmalab.jspart.model.Tag;
import net.sigmalab.jspart.model.TagTranslation;

@Transactional
public class TagTranslationDAO extends DAO<TagTranslation,Long> implements ITagTranslationDAO{
	public TagTranslationDAO(){
		super(TagTranslation.class);
	}
}
