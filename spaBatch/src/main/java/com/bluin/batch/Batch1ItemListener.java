package com.bluin.batch;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.batch.core.listener.ItemListenerSupport;

import com.bluin.entity.SpaFileEntity;
import com.bluin.util.LogUtil;

public class Batch1ItemListener  extends ItemListenerSupport<Object, SpaFileEntity> {

	static Log log = LogUtil.getLog();

	public void onWriteError(Exception ex, List<? extends SpaFileEntity> item) {

		try {
			if (ex.getClass() == this
					.getClass()
					.getClassLoader()
					.loadClass(
						"org.springframework.dao.DataIntegrityViolationException")) {
				log.error("データ不正によるINSERTエラー。スキップする。（スキップの定義はmodule-context.xml）");

				ex.printStackTrace();
			} else {
				// スキップしない
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
