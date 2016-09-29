package com.bluin.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * log4jを使用する為のUtil
 */
public class LogUtil {
	static Log log = LogFactory.getLog(LogUtil.class);

	private LogUtil() {
	}

	public static Log getLog() {
		return log;
	}

}
