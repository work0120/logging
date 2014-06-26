package org.nebula.common.logging.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.message.SimpleMessage;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;
import org.nebula.common.logging.Log;
import org.nebula.common.logging.LogFactory;

public class Log4j2AbstractLoggerImpl  implements Log {
    
	private static Marker MARKER=MarkerManager.getMarker(LogFactory.MARKER);
	
	private static final String FQCN = Log4j2Impl.class.getName();
	
	private ExtendedLoggerWrapper log;
	
	public Log4j2AbstractLoggerImpl(AbstractLogger abstractLogger) {
	    log = new ExtendedLoggerWrapper(abstractLogger, abstractLogger.getName(), abstractLogger.getMessageFactory());
	  }

	
	public void trace(String msg) {
		log.logIfEnabled(FQCN,Level.TRACE, MARKER, new SimpleMessage(msg), null);
	}

	
	public void trace(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.TRACE, MARKER, new SimpleMessage(msg), t);
	}

	
	public void debug(String msg) {
		log.logIfEnabled(FQCN,Level.DEBUG, MARKER, new SimpleMessage(msg), null);
	}

	
	public void debug(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.DEBUG, MARKER, new SimpleMessage(msg), t);

	}

	
	public void info(String msg) {
		log.logIfEnabled(FQCN,Level.INFO, MARKER, new SimpleMessage(msg), null);

	}

	
	public void info(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.INFO, MARKER, new SimpleMessage(msg), t);

	}

	
	public void warn(String msg) {
		log.logIfEnabled(FQCN,Level.WARN, MARKER, new SimpleMessage(msg), null);

	}

	
	public void warn(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.WARN, MARKER, new SimpleMessage(msg), t);

	}

	
	public void error(String msg) {
		log.logIfEnabled(FQCN,Level.ERROR, MARKER, new SimpleMessage(msg), null);

	}

	
	public void error(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.ERROR, MARKER, new SimpleMessage(msg), t);

	}

	
	public void fatal(String msg) {
		log.logIfEnabled(FQCN,Level.FATAL, MARKER, new SimpleMessage(msg), null);

	}

	
	public void fatal(String msg, Throwable t) {
		log.logIfEnabled(FQCN,Level.FATAL, MARKER, new SimpleMessage(msg), t);

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
		
		return log.isFatalEnabled();
	}





}
