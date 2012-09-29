package com.devgupta.scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.devgupta.scanner.strategies.NotADirectoryException;
import com.devgupta.scanner.strategies.OnlyTopFilesStrategy;
public class TestOnlyTopFilesStrategy {
	
	static File fileActuallyFile;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//stub it out 
		fileActuallyFile = mock(File.class);
		when(fileActuallyFile.listFiles()).thenReturn(new File[] {new File("superduper.mkv"), new File("superMp4.mp4"),new File("throwaway.jpg")});
	}

	@Test
	public void testTraverseDirectory() throws NotADirectoryException {
		OnlyTopFilesStrategy testingStrategy = new OnlyTopFilesStrategy();
		List<File> files = testingStrategy.traverseDirectory(fileActuallyFile);
		//assert that it only returns superduper.mkv and that superMP4.mp4 are ther and the others are thrown away
		File assertForSuperMKV = files.get(0);
		assertEquals("Test for filename","superduper.mkv", assertForSuperMKV.getName());
	}

}
