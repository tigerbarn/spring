package com.bluin.entity.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.bluin.entity.SpaFileEntity;

/**
 * 温泉ファイルを扱う為のMapper
 *
 * @author  Takayama
 */
public class SpaFileEntityFieldSetMapper implements FieldSetMapper<SpaFileEntity> {

	public SpaFileEntity mapFieldSet(FieldSet fieldSet) throws BindException {
		if (fieldSet == null) {
			return null;
		}

		SpaFileEntity entity = new SpaFileEntity();
		entity.setSpaGroup(fieldSet.readString("spaGroup"));
		entity.setSpaName(fieldSet.readString("spaName"));
		entity.setStateCd(fieldSet.readString("stateCd"));
		entity.setStayType(fieldSet.readString("stayType"));
		entity.setSpaType(fieldSet.readString("spaType"));
		entity.setSpaLank(fieldSet.readString("spaLank"));
		entity.setHotType(fieldSet.readString("hotType"));
		entity.setHotTemp(fieldSet.readString("hotTemp"));
		entity.setHotMemo(fieldSet.readString("hotMemo"));
		entity.setSpaAddr(fieldSet.readString("spaAddr"));
		entity.setSpaMemo(fieldSet.readString("spaMemo"));
		entity.setSpaUrl(fieldSet.readString("spaUrl"));

		return entity;
	}

}
