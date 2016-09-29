package com.bluin.batch.exception;

import org.apache.commons.logging.Log;

import com.bluin.util.LogUtil;

/**
 * Batch1のJobSkip時の処理
 */
public class Batch1SkipException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private static Log log = LogUtil.getLog();

	public Batch1SkipException(String message) {
		log.warn(message);
	}

}
