package org.nebula.common.logging.logback;

import org.nebula.common.logging.Log;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;


public class LogbackImpl implements Log{
	
	private static final String FQCN=LogbackImpl.class.getName();
	
	private Logger log;
	
	public LogbackImpl(String clazz){
		log= (Logger) LoggerFactory.getLogger(clazz);
		
	}

	public void trace(String msg) {
		log.log(null, FQCN, 0, msg, null, null);
		
	}

	
	public void trace(String msg, Throwable t) {
		log.log(null, FQCN, 0, msg, null, t);
		
	}

	
	public void debug(String msg) {
		log.log(null, FQCN, Level.DEBUG_INT/1000, msg, null, null);
		
	}

	
	public void debug(String msg, Throwable t) {
		log.log(null, FQCN, Level.DEBUG_INT/1000, msg, null, t);
		
	}

	
	public void info(String msg) {
		log.log(null, FQCN, Level.INFO_INT/1000, msg, null, null);
		
	}

	
	public void info(String msg, Throwable t) {
		log.log(null, FQCN, Level.INFO_INT/1000, msg, null, t);
		
	}

	
	public void warn(String msg) {
		log.log(null, FQCN, Level.WARN_INT/1000, msg, null, null);
		
	}

	
	public void warn(String msg, Throwable t) {
		log.log(null, FQCN, Level.WARN_INT/1000, msg, null, t);
		
	}

	
	public void error(String msg) {
		log.log(null, FQCN, Level.ERROR_INT/1000, msg, null, null);
		
	}

	
	public void error(String msg, Throwable t) {
		log.log(null, FQCN, Level.ERROR_INT/1000, msg, null, t);
		
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
