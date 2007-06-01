package net.sigmalab.jspart.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class SoundArtifact extends Artifact implements java.io.Serializable {

	private String url;
	
	@ManyToOne
	private SoundType soundType;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public SoundArtifact url(String url) {
		this.url = url;
		return this;
	}

	public SoundType getSoundType() {
		return soundType;
	}

	public void setSoundType(SoundType soundType) {
		this.soundType = soundType;
	}

	public SoundArtifact soundType(SoundType soundType) {
		this.soundType = soundType;
		return this;
	}

}
