package com.devgupta.scanner;

import com.google.common.collect.ImmutableSet;

public class MovieTypes{
	
	static ImmutableSet<String> extensions = ImmutableSet.of("mkv","avi","mp4","3gp");
	
	public static ImmutableSet<String> getExtensionsSet(){
		return extensions;
	}
}