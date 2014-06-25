package org.nebula.common.logging.slf4j;

import org.nebula.common.logging.Log;
import org.slf4j.Logger;

public class Slf4jLoggerImpl implements Log {

	private Logger log;

	public Slf4jLoggerImpl(Logger logger) {
		log = logger;
	}

	
	public void trace(String msg) {
		log.trace(msg);

	}

	
	public void trace(String msg, Throwable t) {
		log.trace(msg, t);

	}

	
	public void debug(String msg) {
        log.debug(msg);
	}

	
	public void debug(String msg, Throwable t) {
		log.debug(msg, t);

	}

	
	public void info(String msg) {
		log.info(msg);

	}

	
	public void info(String msg, Throwable t) {
		log.info(msg, t);

	}

	
	public void warn(String msg) {
		log.warn(msg);

	}

	
	public void warn(String msg, Throwable t) {
		log.warn(msg,t);

	}

	
	public void error(String msg) {
		log.error(msg);

	}

	
	public void error(String msg, Throwable t) {
		log.error(msg, t);

	}

	
	public void fatal(String msg) {
		

	}

	
	public void fatal(String msg, Throwable t) {
		

	}

	
	public boolean isTraceEnabled() {
		
		return log.isTraceEnabled();
	}

	
	public boolean isDebugEnabled() {
		
		return log.isDebugEnabled();
	}

	
	public boolean isInfoEnabled() {
		
		return log.isInfoEnabled();
	}

	
	public boolean isWarnEnabled() {
		
		return log.isWarnEnabled();
	}

	
	public boolean isErrorEnabled() {
		
		return log.isErrorEnabled();
	}

	
	public boolean isFatalEnabled() {
		
		return false;
	}

}
