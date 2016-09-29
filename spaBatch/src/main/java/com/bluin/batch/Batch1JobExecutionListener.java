package com.bluin.batch;

import org.apache.commons.logging.Log;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.bluin.dao.SpaDao;
import com.bluin.util.LogUtil;

/**
 * Batch1のJobExecutionListener。Job実行の前後の処理を定義
 *
 * @author  Takayama
 */
public class Batch1JobExecutionListener extends JobExecutionListenerSupport {
	static Log log = LogUtil.getLog();

	@Autowired
	private SpaDao transactionDataDao;

	/**
	 * Job実行前の処理
	 *
	 * @param  jobExec  ジョブの実行情報を保存しておくオブジェクト
	 */
	public void beforeJob(JobExecution jobExec) {
		log.info("温泉情報登録　Job start");

		log.info("　JobParameters: " + jobExec.getJobInstance().getJobParameters().getString("inputFile"));

		transactionDataDao.delete();
	}

	/**
	 * Job実行後の処理
	 *
	 * @param  jobExec  ジョブの実行情報を保存しておくオブジェクト
	 */
	public void afterJob(JobExecution jobExec) {
		log.info("温泉情報登録　Job end");
	}

}
