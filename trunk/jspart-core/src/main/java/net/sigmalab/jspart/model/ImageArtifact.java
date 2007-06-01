package net.sigmalab.jspart.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ImageArtifact extends Artifact implements Serializable {

	private String url;
	
	@ManyToOne
	private ImageType imageType;

	public ImageType getImageType() {
		return imageType;
	}

	public ImageArtifact imageType(ImageType imageType) {
		this.imageType = imageType;
		return this;
	}

	public void setImageType(ImageType imageType) {
		this.imageType = imageType;
	}

	public String getUrl() {
		return url;
	}

	public ImageArtifact url(String url) {
		this.url = url;
		return this;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
