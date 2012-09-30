package org.devgupta.utilities;

public class FileNameUtilities {

	
	public static String returnExtensionFromFileName(String fileName){
		int lengthOf = fileName.length();
		String fileNameReversed =  new StringBuilder(fileName).reverse().toString();
		//we reverse the string because indexOf returns the first result. Flipping the string will subsequently give the first result.
		int indexOfLastPeriod = fileNameReversed.indexOf(".");
		String extension = fileName.substring(((lengthOf) - indexOfLastPeriod ), lengthOf);
		return extension;
	}
	
}
