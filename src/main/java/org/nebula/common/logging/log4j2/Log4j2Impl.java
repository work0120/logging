package org.nebula.common.logging.log4j2;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.nebula.common.logging.Log;
import org.nebula.common.logging.LogFactory;

public class Log4j2Impl  implements Log {
	
	private Log log;
	
	private static final long serialVersionUID = 1L;
	private Logger logger;
	private static final String FQCN=Log4j2Impl.class.getName();
	private static Marker MARKER = MarkerManager.getMarker(LogFactory.MARKER);
			
			
	public Log4j2Impl(String clazz){
		Logger logger=LogManager.getLogger(clazz);
		if (logger instanceof AbstractLogger) {
			log=new Log4j2AbstractLoggerImpl((AbstractLogger)logger);
		}else{
			log=new Log4j2LoggerImpl(logger);
		}
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
