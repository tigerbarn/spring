package com.bluin.batch;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bluin.dao.SpaDao;
import com.bluin.entity.SpaFileEntity;
import com.bluin.util.LogUtil;

/**
 * 温泉情報をDBへ登録する
 *
 * @author  Takayama
 */
@Component("batch1Writer")
public class Batch1ItemWriter implements ItemWriter<SpaFileEntity> {
	static Log log = LogUtil.getLog();

	@Autowired
	private SpaDao transactionDataDao;

	/**
	 * DBへ登録する
	 *
	 * @param   data  温泉情報のリスト
	 * @throws  Exception
	 */
	public void write(List<? extends SpaFileEntity> data) throws Exception {
		log.info(" write method (insert)");
		transactionDataDao.insert(data.get(0));
	}

}
