package com.api.logger;


import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

/**
 * @author 7th_hacker
 *         <p>
 *         Provide an API for Easy Use of Logger
 *         </p>
 */
// TODO : Move this class to Logger Module
public class Log {

	private static Logger logger;

	public static void info(String message) {
		logger();
		logger.info(message);
	}

	public static void info(String message, Throwable throwable) {
		logger();
		logger.info(message, throwable);
	}
	
	public static void error(String message) {
		logger();
		logger.error(message);
	}

	// TODO : Configure Appender
	public static void logger() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		StackTraceElement obj = stackTraceElements[2];
		String className = obj.getClassName();
		logger = Logger.getLogger(className);
		BasicConfigurator.configure();
	}

	public static void error(String message, Throwable throwable) {
		logger();
		logger.error(message, throwable);
	}
}
