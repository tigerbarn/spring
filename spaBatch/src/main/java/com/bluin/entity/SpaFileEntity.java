package com.bluin.entity;

import java.io.Serializable;

/**
 * 温泉ファイル
 *
 * @author  Takayama
 */
public class SpaFileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String spaGroup;	// 温泉地
	private String spaName;		// 温泉名
	private String stateCd;		// 都道府県コード
	private String stayType;	// 宿泊種類
	private String spaType;		// 温泉種類
	private String spaLank;		// 評価
	private String hotType;		// 泉質
	private String hotTemp;		// 泉温
	private String hotMemo;		// コメント
	private String spaAddr;		// 住所
	private String spaMemo;		// メモ
	private String spaUrl;		// URL

	public String getSpaGroup() {
		return spaGroup;
	}
	public void setSpaGroup(String spaGroup) {
		this.spaGroup = spaGroup;
	}
	public String getSpaName() {
		return spaName;
	}
	public void setSpaName(String spaName) {
		this.spaName = spaName;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public String getStayType() {
		return stayType;
	}
	public void setStayType(String stayType) {
		this.stayType = stayType;
	}
	public String getSpaType() {
		return spaType;
	}
	public void setSpaType(String spaType) {
		this.spaType = spaType;
	}
	public String getSpaLank() {
		return spaLank;
	}
	public void setSpaLank(String spaLank) {
		this.spaLank = spaLank;
	}
	public String getHotMemo() {
		return hotMemo;
	}
	public void setHotMemo(String hotMemo) {
		this.hotMemo = hotMemo;
	}
	public String getHotType() {
		return hotType;
	}
	public void setHotType(String hotType) {
		this.hotType = hotType;
	}
	public String getHotTemp() {
		return hotTemp;
	}
	public void setHotTemp(String hotTemp) {
		this.hotTemp = hotTemp;
	}
	public String getSpaAddr() {
		return spaAddr;
	}
	public void setSpaAddr(String spaAddr) {
		this.spaAddr = spaAddr;
	}
	public String getSpaMemo() {
		return spaMemo;
	}
	public void setSpaMemo(String spaMemo) {
		this.spaMemo = spaMemo;
	}
	public String getSpaUrl() {
		return spaUrl;
	}
	public void setSpaUrl(String spaUrl) {
		this.spaUrl = spaUrl;
	}

}
