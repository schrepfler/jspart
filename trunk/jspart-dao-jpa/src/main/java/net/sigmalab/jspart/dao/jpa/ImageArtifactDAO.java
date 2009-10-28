package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.IImageArtifactDAO;
import net.sigmalab.jspart.domain.ImageArtifact;

@Transactional
public class ImageArtifactDAO extends DAO<ImageArtifact,Long> implements IImageArtifactDAO{
	
	public ImageArtifactDAO(){
		super(ImageArtifact.class);
	}
}
