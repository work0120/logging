package org.nebula.common.logging.slf4j;

import org.nebula.common.logging.Log;
import org.nebula.common.logging.LogFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.spi.LocationAwareLogger;

public class Slf4jLocationAwareLoggerImpl implements Log {

	private static Marker MARKER=MarkerFactory.getMarker(LogFactory.MARKER);
	
	private static final String FQCN=Slf4jImpl.class.getName();
	
	private LocationAwareLogger logger;
	
	public Slf4jLocationAwareLoggerImpl(LocationAwareLogger logger){
		this.logger=logger;
	}
	
	public void trace(String msg) {
		logger.log(MARKER, FQCN, LocationAwareLogger.TRACE_INT, msg, null, null);

	}

	
	public void trace(String msg, Throwable t) {
		logger.log(MARKER, FQCN, LocationAwareLogger.TRACE_INT, msg, null, t);

	}

	
	public void debug(String msg) {
		logger.log(MARKER, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, null);

	}

	
	public void debug(String msg, Throwable t) {
		logger.log(MARKER, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, t);

	}

	
	public void info(String msg) {
		logger.log(MARKER, FQCN, LocationAwareLogger.INFO_INT, msg, null, null);

	}

	
	public void info(String msg, Throwable t) {
		logger.log(MARKER, FQCN, LocationAwareLogger.INFO_INT, msg, null, t);

	}

	
	public void warn(String msg) {
		logger.log(MARKER, FQCN, LocationAwareLogger.WARN_INT, msg, null, null);

	}

	
	public void warn(String msg, Throwable t) {
		logger.log(MARKER, FQCN, LocationAwareLogger.WARN_INT, msg, null, t);

	}

	
	public void error(String msg) {
		logger.log(MARKER, FQCN, LocationAwareLogger.ERROR_INT, msg, null, null);

	}

	
	public void error(String msg, Throwable t) {
		logger.log(MARKER, FQCN, LocationAwareLogger.ERROR_INT, msg, null, t);

	}

	
	public void fatal(String msg) {
		

	}

	
	public void fatal(String msg, Throwable t) {
		

	}

	
	public boolean isTraceEnabled() {
		
		return logger.isTraceEnabled();
	}

	
	public boolean isDebugEnabled() {
		
		return logger.isDebugEnabled();
	}

	
	public boolean isInfoEnabled() {
		
		return logger.isInfoEnabled();
	}

	
	public boolean isWarnEnabled() {
		
		return logger.isWarnEnabled();
	}

	
	public boolean isErrorEnabled() {
		
		return logger.isErrorEnabled();
	}

	
	public boolean isFatalEnabled() {
		
		return false;
	}

}
