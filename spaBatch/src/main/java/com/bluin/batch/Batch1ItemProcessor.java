package com.bluin.batch;

import org.apache.commons.logging.Log;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.bluin.batch.exception.Batch1SkipException;
import com.bluin.entity.SpaFileEntity;
import com.bluin.util.LogUtil;

/**
 * Batch1のItemProcessor
 *
 * @author  Takayama
 */
@Component("batch1Processor")
public class Batch1ItemProcessor implements ItemProcessor<SpaFileEntity, SpaFileEntity> {
	static Log log = LogUtil.getLog();

	/**
	 * ファイルのデータ処理（単項目チェック）
	 *
	 * @param   spaFileEntity  温泉情報
	 * @return  温泉情報
	 * @throws  Batch1SkipException  不正データをスキップする例外
	 */
	public SpaFileEntity process(SpaFileEntity spaFileEntity) throws Batch1SkipException {
		log.info("start process method");

		if (spaFileEntity.getSpaGroup().isEmpty()) {
			throw new Batch1SkipException("温泉地名がブランクです。処理をスキップします。");
		}
		if (spaFileEntity.getSpaName().isEmpty()) {
			throw new Batch1SkipException("温泉名がブランクです。処理をスキップします。");
		}
		if (spaFileEntity.getStateCd().isEmpty()) {
			throw new Batch1SkipException("都道府県コードがブランクです。処理をスキップします。");
		}

		return spaFileEntity;
	}

}
