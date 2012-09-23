/**
 * 
 */
package com.devgupta.scanner.strategies;

import java.util.List;

/**
 * @author mrkaiser
 *
 */
public interface ScannerStrategy {

	/**
	 * traverseDirectory accepts a top level directory. It will return a List<String> which takes gives the full path of a files.
	 * The general rule would be only to give files whose type is a video container such as 3gp,mp4,avi, mkv. 
	 * @param holderDir
	 * @return
	 */
	public List<String> traverseDirectory(String holderDir);
	
}
