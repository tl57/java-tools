package org.javatools.providers;

import org.javatools.services.IExceptionLoggerService;
import org.javatools.services.impl.DefaultExceptionLoggerService;

public class ExceptionLoggerServiceProvider {

	static private IExceptionLoggerService _instance = new DefaultExceptionLoggerService();
	
	static public IExceptionLoggerService getProvider() {
		return _instance;
	}
	
	static public void setProvider (IExceptionLoggerService instance) {
		_instance = instance;
	}
}
