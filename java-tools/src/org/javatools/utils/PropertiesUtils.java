package org.javatools.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.javatools.providers.ExceptionLoggerServiceProvider;

public class PropertiesUtils {

	static public Properties readProperties(String path) {
		if (StringUtils.isNullOrEmpty(path))
			return null;
		
		InputStream fis = FileUtils.getFileInputStream(path);
		return readProperties(fis);
	}

	static public Properties readProperties(InputStream fis) {
		if (fis == null)
			return null;

		Properties properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			ExceptionLoggerServiceProvider.getProvider().log(e);
		}
		
		return properties;
	}

}
