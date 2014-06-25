package org.nebula.common.logging.slf4j;

import org.nebula.common.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

public class Slf4jImpl implements Log {

	private Log log;

	public Slf4jImpl(String clazz) {
		Logger logger = LoggerFactory.getLogger(clazz);

		if (logger instanceof LocationAwareLogger) {
			try {
				// check for slf4j >= 1.6 method signature
				logger.getClass().getMethod("log", Marker.class, String.class,
						int.class, String.class, Object[].class,
						Throwable.class);
				log = new Slf4jLocationAwareLoggerImpl(
						(LocationAwareLogger) logger);
				return;
			} catch (SecurityException e) {
				// // fail-back to Slf4jLoggerImpl
			} catch (NoSuchMethodException e) {
				// fail-back to Slf4jLoggerImpl
			}
		}
		// Logger is not LocationAwareLogger or slf4j version < 1.6
	    log = new Slf4jLoggerImpl(logger);
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
