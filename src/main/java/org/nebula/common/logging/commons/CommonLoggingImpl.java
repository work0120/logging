package org.nebula.common.logging.commons;

import org.nebula.common.logging.Log;
import org.nebula.common.logging.LogFactory;

public class CommonLoggingImpl implements Log {

	private Log log;

	public CommonLoggingImpl(String clazz) {
		log = LogFactory.getLog(clazz);
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
		log.debug(msg, t);
	}

	public void warn(String msg) {
		log.warn(msg);
	}

	public void warn(String msg, Throwable t) {
		log.warn(msg, t);
	}

	public void error(String msg) {
		log.error(msg);
	}

	public void error(String msg, Throwable t) {
		log.error(msg, t);
	}

	public void fatal(String msg) {
		log.fatal(msg);
	}

	public void fatal(String msg, Throwable t) {
		log.fatal(msg, t);
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
