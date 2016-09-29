package com.bluin.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.bluin.entity.SpaFileEntity;

import junit.framework.TestCase;

public class Batch1ItemWriterTests extends TestCase {
	private Connection con = null;

	private Batch1ItemWriter writer = new Batch1ItemWriter();

	public Batch1ItemWriterTests(String name) {
		super(name);
	}

	/*
	 * データベースに接続
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:spaDb.db");
			Statement stat = con.createStatement();
			stat.setQueryTimeout(30);		// set timeout to 30 sec.
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	/*
	 * データベース接続の切断
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() {
		try {
			if(con != null) {
				con.close();
			}
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}


	public void testWrite() throws Exception {
		SpaFileEntity entity = new SpaFileEntity();
	//	List spaList = new ArrayList();
		java.util.List<SpaFileEntity> spaList = new java.util.ArrayList<SpaFileEntity>();

		entity.setSpaGroup("SpaGroup");
		entity.setSpaName("◇◇温泉");
		entity.setStateCd("55");
		entity.setStayType("旅館");
		entity.setSpaType("日帰り");
		entity.setSpaLank("☆☆");
		entity.setHotType("単純硫黄泉");
		entity.setHotTemp("42.5");
		entity.setHotMemo("美肌の湯");
		entity.setSpaAddr("ＸＸ県ＸＸ市ＸＸ町１２３");
		entity.setSpaMemo("岩盤浴あり");
		entity.setSpaUrl("http://www.xxxx.com/");
		spaList.add(0, entity);

		writer.write(spaList);
	}

}
