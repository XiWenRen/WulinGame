package com.wulin.util;

import org.apache.log4j.Logger;

public class LogUtil {
	
	private static Logger logger = Logger.getLogger(LogUtil.class);
	
	public static void logInfo(String order){
		logger.info(order);
	}
	
	public static void logError(Object error){
		logger.error(error);
	}

}
