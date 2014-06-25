package org.nebula.common.logging.log4j2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.nebula.common.logging.Log;
import org.nebula.common.logging.LogFactory;

public class Log4j2LoggerImpl implements Log {

	private static Marker MARKER = MarkerManager.getMarker(LogFactory.MARKER);

	private Logger log;

	public Log4j2LoggerImpl(Logger logger) {
		log = logger;
	}

	public void trace(String msg) {
		log.trace(MARKER, msg);

	}

	public void trace(String msg, Throwable t) {
		log.trace(MARKER, msg, t);

	}

	public void debug(String msg) {
		log.debug(MARKER, msg);

	}

	public void debug(String msg, Throwable t) {
		log.debug(MARKER, msg, t);

	}

	public void info(String msg) {
		log.info(MARKER, msg);

	}

	public void info(String msg, Throwable t) {
		log.info(MARKER, msg, t);

	}

	public void warn(String msg) {
		log.warn(MARKER, msg);

	}

	public void warn(String msg, Throwable t) {
		log.warn(MARKER, msg, t);

	}

	public void error(String msg) {
		log.error(MARKER, msg);

	}

	public void error(String msg, Throwable t) {
		log.error(MARKER, msg, t);

	}

	public void fatal(String msg) {
		log.fatal(MARKER, msg);

	}

	public void fatal(String msg, Throwable t) {
		log.fatal(MARKER, msg, t);

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
