package org.nebula.common.logging.nologging;

import org.nebula.common.logging.Log;

public class NoLoggingImpl implements Log {
    
	public NoLoggingImpl(String clazz){

	}

	public void trace(String msg) {
		
	}

	public void trace(String msg, Throwable t) {
		
	}

	public void debug(String msg) {
		
	}

	public void debug(String msg, Throwable t) {
		
	}

	public void info(String msg) {
		
	}

	public void info(String msg, Throwable t) {
		
	}

	public void warn(String msg) {
		
	}

	public void warn(String msg, Throwable t) {
		
	}

	public void error(String msg) {
		
	}

	public void error(String msg, Throwable t) {
		
	}

	public void fatal(String msg) {
		
	}

	public void fatal(String msg, Throwable t) {
		
	}

	public boolean isTraceEnabled() {
		return false;
	}

	public boolean isDebugEnabled() {
		return false;
	}

	public boolean isInfoEnabled() {
		return false;
	}

	public boolean isWarnEnabled() {
		return false;
	}

	public boolean isErrorEnabled() {
		return false;
	}

	public boolean isFatalEnabled() {
		return false;
	}


	
	
}
