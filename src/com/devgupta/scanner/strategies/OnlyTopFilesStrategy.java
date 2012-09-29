package com.devgupta.scanner.strategies;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OnlyTopFilesStrategy implements ScannerStrategy {

	@Override
	public List<File> traverseDirectory(File holderDir)  throws NotADirectoryException{
		//get the files
		File[] listOfFiles = holderDir.listFiles();
		if(listOfFiles.length <= 0){
			throw new NotADirectoryException(holderDir +" is not a directory");
			
		}
		List<File> returnable = new ArrayList<File>();
		for(File checkFile : listOfFiles){
			checkFile.getName();
		}
		
	}

}
