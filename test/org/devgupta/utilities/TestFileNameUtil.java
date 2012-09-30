package org.devgupta.utilities;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFileNameUtil {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	//TODO work more on this testCase
	public void testReturnExtensionFromFileName() {
		assertEquals("Will it return an extension", "mp4", FileNameUtilities.returnExtensionFromFileName("Doctor.Who.2005.7x04.The.Power.Of.Three.HDTV.x264-FoV.mp4" ));
	}

}
