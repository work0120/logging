package org.nebula.common.logging.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.nebula.common.logging.Log;

public class Log4jImpl implements Log {

	private static final String FQCN = Log4jImpl.class.getName();

	private Logger log;

	public Log4jImpl(String clazz) {
		log = Logger.getLogger(clazz);
	}

	public void trace(String msg) {
		log.log(FQCN, Level.TRACE, msg, null);
	}

	public void trace(String msg, Throwable t) {
		log.log(FQCN, Level.TRACE, msg, t);
	}

	public void debug(String msg) {
		log.log(FQCN, Level.DEBUG, msg, null);
	}

	public void debug(String msg, Throwable t) {
		log.log(FQCN, Level.DEBUG, msg, t);
	}

	public void info(String msg) {
		log.log(FQCN, Level.INFO, msg, null);
	}

	public void info(String msg, Throwable t) {
		log.log(FQCN, Level.INFO, msg, t);
	}

	public void warn(String msg) {
		log.log(FQCN, Level.WARN, msg, null);
	}

	public void warn(String msg, Throwable t) {
		log.log(FQCN, Level.WARN, msg, t);
	}

	public void error(String msg) {
		log.log(FQCN, Level.ERROR, msg, null);
	}

	public void error(String msg, Throwable t) {
		log.log(FQCN, Level.ERROR, msg, t);
	}

	public void fatal(String msg) {
		log.log(FQCN, Level.FATAL, msg, null);
	}

	public void fatal(String msg, Throwable t) {
		log.log(FQCN, Level.FATAL, msg, t);
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
		return true;
	}

	public boolean isErrorEnabled() {
		return true;
	}

	public boolean isFatalEnabled() {
		return true;
	}

}
