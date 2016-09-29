package com.bluin.batch;

import java.io.File;

import org.apache.commons.logging.Log;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

import com.bluin.util.LogUtil;

/**
 * ジョブパラメータをチェックする
 *
 * @author  Takayama
 */
public class SpaJobParametersValidator implements JobParametersValidator {
	static Log log = LogUtil.getLog();

	/**
	 * チェックする
	 *
	 * @param   params  ジョブパラメータ
	 * @throws  JobParametersInvalidException
	 */
	@Override
	public void validate(JobParameters params) throws JobParametersInvalidException {

		// ファイル指定の確認
		if (params.getString("inputFile").isEmpty()) {
			log.info("[validate] ファイル指定は必須です。");
			throw new JobParametersInvalidException("ファイル指定は必須です。");
		}

		// ファイルの存在確認
		File file = new File(params.getString("inputFile"));
		if (false  == file.exists()){
			log.info("[validate] ファイルが見つかりません。");
			log.info("[validate] file: " + params.getString("inputFile"));
			throw new JobParametersInvalidException("ファイルが見つかりません。");
		}
	}

}
