//: com:bruceeckel:util:StringList.java
// General-purpose tool that reads a file of text
// lines into a List, one line per list.
package com.bruceeckel.util;

import java.io.*;
import java.util.*;

public class StringList extends ArrayList<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1142459176736920525L;

	@SuppressWarnings("resource")
	public StringList(String textFilePath) {
		try {
			BufferedReader inputs = new BufferedReader(new FileReader(textFilePath));
			String line;
			while ((line = inputs.readLine()) != null)
				add(line.trim());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}