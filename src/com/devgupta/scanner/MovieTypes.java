package com.devgupta.scanner;

public enum MovieTypes{
	THREEGP("3gp"),
	AVI("avi"),
	MP4("MP4"),
	MKV("mkv");
	
	
	
	private String extension;
	MovieTypes(String extension){
		this.setExtension(extension);
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
}