package edu.bonn.jbc.exceptions.task10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopier {
	
	public void copyFile(String input, String output) {
		copyFile(new File(input), new File(output));
	}
	
	public void copyFile(String input, File output) {
		copyFile(new File(input), output);
	}
	
	public void copyFile(File input, String output) {
		copyFile(input, new File(output));
	}
	
	public void copyFile(File input, File output) {
		if (input == null || output == null) {
			throw new IllegalArgumentException("Neither input nor output file must be null");
		}
		if (!input.exists()) {
			throw new IllegalArgumentException(input.getName() + " is does not exist");
		}
		if (!input.canRead()) {
			throw new IllegalArgumentException(input.getName() + " is not readable");
		}
		if (!output.canWrite()) {
			throw new IllegalArgumentException(output.getName() + " is not writable");
		}
		
		Reader r = new FileReader(input);
		Writer w = new FileWriter(output);
		int c;
		while ((c = r.read()) != -1) {
			w.append((char)c);
		}
		r.close();
		w.close();
	}
	
}