package com.bluin.dao.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 温泉情報を扱う為のMapper
 */
public interface SpaMapper {
	void insert(@Param("spaGroup") String spaGroup, @Param("spaName") String spaName,
			@Param("stateCd") String stateCd, @Param("stayType") String stayType,
			@Param("spaType") String spaType, @Param("spaLank") String spaLank,
			@Param("hotType") String hotType, @Param("hotTemp") String hotTemp,
			@Param("hotMemo") String hotMemo, @Param("spaAddr") String spaAddr,
			@Param("spaMemo") String spaMemo, @Param("spaUrl") String spaUrl);

	void delete();
}
