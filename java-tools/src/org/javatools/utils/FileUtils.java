package org.javatools.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.javatools.providers.ExceptionLoggerServiceProvider;

public class FileUtils {
	
	static public InputStream getFileInputStream(String path) {
		InputStream fis = null;
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			ExceptionLoggerServiceProvider.getProvider().log(e);
		}
		
		return fis;
	}
}
