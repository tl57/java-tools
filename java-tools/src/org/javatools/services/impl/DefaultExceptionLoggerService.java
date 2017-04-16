package org.javatools.services.impl;

import org.javatools.services.IExceptionLoggerService;
import org.javatools.utils.StringUtils;

public class DefaultExceptionLoggerService implements IExceptionLoggerService {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		logToConsole(message);
	}

	@Override
	public void log(Exception e) {
		// TODO Auto-generated method stub
		logToConsole(e.getMessage());
		
	}

	@Override
	public void log(Exception e, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(Throwable t, String message) {
		// TODO Auto-generated method stub
		
	}
	
	protected void logToConsole(String message) {
		System.out.println(ident(getTime(), message));
	}
	
	protected String ident(String...messages) {
		String result = "";
		
		for (int i = 0; i < messages.length ; i++) {
			String message = messages[i];
			
			if (i != 0)
				result += " - ";
			
			result += message;
		}
		
		return result;
	}
	
	protected String getTime() {
		return getTime(null);
	}
	
	protected String getTime(String regex) {
		long nano = System.nanoTime();
		String result = String.valueOf(nano);
		
		if (StringUtils.isNullOrEmpty(regex))
			return result;
		
		try {
			result = String.format(regex, nano);
		} catch (Exception e) {
			//TODO
		}
		return result;
	}
}
