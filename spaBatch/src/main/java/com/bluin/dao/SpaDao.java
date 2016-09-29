package com.bluin.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import com.bluin.dao.mapper.SpaMapper;
import com.bluin.entity.SpaFileEntity;

/**
 * 温泉情報を扱う為のDao
 *
 * @author  Takayama
 */
@Component
public class SpaDao  extends SqlSessionDaoSupport {

	/**
	 * 温泉情報を登録する
	 *
	 * @param  spaFileEntity  温泉情報
	 */
	public void insert(SpaFileEntity spaFileEntity) {
		SqlSession session = getSqlSession();
		SpaMapper mapper = session.getMapper(SpaMapper.class);
		mapper.insert(spaFileEntity.getSpaGroup(), spaFileEntity.getSpaName(),
				spaFileEntity.getStateCd(), spaFileEntity.getStayType(),
				spaFileEntity.getSpaType(), spaFileEntity.getSpaLank(),
				spaFileEntity.getHotType(), spaFileEntity.getHotTemp(),
				spaFileEntity.getHotMemo(), spaFileEntity.getSpaAddr(),
				spaFileEntity.getSpaMemo(), spaFileEntity.getSpaUrl());
	}

	/**
	 * 温泉情報を削除する
	 *
	 * @param  なし
	 */
	public void delete() {
		SqlSession session = getSqlSession();
		SpaMapper mapper = session.getMapper(SpaMapper.class);
		mapper.delete();
	}

}
