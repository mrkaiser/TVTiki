package com.devgupta.scanner.strategies;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.devgupta.utilities.FileNameUtilities;

import com.devgupta.scanner.MovieTypes;

public class OnlyTopFilesStrategy implements ScannerStrategy {

	@Override
	public List<File> traverseDirectory(File holderDir)
			throws NotADirectoryException {
		// get the files
		File[] listOfFiles = holderDir.listFiles();
		if (listOfFiles.length <= 0) {
			throw new NotADirectoryException(holderDir + " is not a directory");

		}
		List<File> returnable = new ArrayList<File>();

		String fileNameToCheck;
		String extension;
		Boolean isValid = false;
		for (File checkFile : listOfFiles) {
			fileNameToCheck = checkFile.getName();
			// check the file extension
			extension = FileNameUtilities
					.returnExtensionFromFileName(fileNameToCheck);
			isValid = MovieTypes.getExtensionsSet().contains(extension);
			if (isValid) {
				returnable.add(checkFile);
			}
		}
		return returnable;
	}
}
