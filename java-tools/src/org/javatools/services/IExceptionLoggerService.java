package org.javatools.services;

public interface IExceptionLoggerService {

	public void log(String message);
	public void log(Exception e);
	public void log(Exception e, String message);
	public void log(Throwable t, String message);
}
