package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger= LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		System.out.println("\n Cheking the Logger implementation  \n");
		logger.trace("this is trace message");
		logger.info("This is logger information");
		logger.error("this is error message");
		logger.warn("this warning message");
		logger.fatal("this is fatal message");
		System.out.println("\n Completed");
		
	}

}
