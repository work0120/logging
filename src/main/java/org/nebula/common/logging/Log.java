package org.nebula.common.logging;

public interface Log {
	
	public void trace(String msg);
	
	public void trace(String msg,Throwable t);

	public  void debug(String msg);

	public  void debug(String msg, Throwable t);

	public  void info(String msg);

	public  void info(String msg, Throwable t);

	public  void warn(String msg);

	public  void warn(String msg, Throwable t);

	public  void error(String msg);

	public  void error(String msg, Throwable t);

	public  void fatal(String msg);

	public  void fatal(String msg, Throwable t);
	
	public boolean isTraceEnabled();

	public  boolean isDebugEnabled();

	public  boolean isInfoEnabled();

	public  boolean isWarnEnabled();

	public  boolean isErrorEnabled();

	public  boolean isFatalEnabled();
}
