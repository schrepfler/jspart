package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.IImageTypeDAO;
import net.sigmalab.jspart.model.ImageType;

@Transactional
public class ImageTypeDAO extends DAO<ImageType,Long> implements IImageTypeDAO{
	
	public ImageTypeDAO(){
		super(ImageType.class);
	}
}
