package net.sigmalab.jspart.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ImageArtifact extends Artifact {

	private String url;
	
	@ManyToOne
	private ImageType imageType;

	public ImageType getImageType() {
		return imageType;
	}

	public ImageArtifact setImageType(ImageType imageType) {
		this.imageType = imageType;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public ImageArtifact setUrl(String url) {
		this.url = url;
		return this;
	}

}
