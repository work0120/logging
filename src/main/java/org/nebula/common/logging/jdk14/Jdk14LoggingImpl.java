package org.nebula.common.logging.jdk14;



import java.util.logging.Level;
import java.util.logging.Logger;



import org.nebula.common.logging.Log;

public class Jdk14LoggingImpl implements Log {

	private Logger log;
	
	public Jdk14LoggingImpl(String clazz) {
	   log=Logger.getLogger(clazz);
	}

	public void trace(String msg) {
		log.log(Level.CONFIG, msg);
	}

	public void trace(String msg, Throwable t) {
		log.log(Level.CONFIG, msg,t);
	}
	
	public void debug(String msg) {
		log.log(Level.FINE, msg);
	}

	public void debug(String msg, Throwable t) {
		log.log(Level.FINE, msg, t);
	}

	public void info(String msg) {
		log.log(Level.INFO, msg);
	}

	public void info(String msg, Throwable t) {
		log.log(Level.INFO, msg, t);
	}

	public void warn(String msg) {
		log.log(Level.WARNING,msg);
	}

	public void warn(String msg, Throwable t) {
		log.log(Level.WARNING,msg,t);
	}

	public void error(String msg) {
		log.log(Level.SEVERE,msg);
	}

	public void error(String msg, Throwable t) {
		log.log(Level.SEVERE,msg,t);
	}

	public void fatal(String msg) {
		log.log(Level.SEVERE,msg);
	}

	public void fatal(String msg, Throwable t) {
		log.log(Level.SEVERE,msg,t);
	}

	public boolean isTraceEnabled() {
		return false;
	}
	
	public boolean isDebugEnabled() {
		return log.isLoggable(Level.FINE);
	}

	public boolean isInfoEnabled() {
		return log.isLoggable(Level.INFO);
	}

	public boolean isWarnEnabled() {
		return log.isLoggable(Level.WARNING);
	}

	public boolean isErrorEnabled() {
		return log.isLoggable(Level.SEVERE);
	}

	public boolean isFatalEnabled() {
		return false;
	}

	


	

}
