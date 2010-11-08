package net.sigmalab.jspart.domain;

import java.io.File;

public interface IFileArtifact {
	
	ArtifactType getArtifactType();
	
	File getFile();
	
	int getFileSize();

}
