package com.bluin.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * データをSQLiteで管理する為のConfiguration
 *
 * @author  Takayama
 */
@Configuration
public class SQLiteConfiguration {
	@Value("${batch.sqlite.jdbc.driver}")
	private String driverClassName;

	@Value("${batch.sqlite.jdbc.url}")
	private String driverUrl;

	@Value("${batch.sqlite.jdbc.user}")
	private String driverUsername;

	@Value("${batch.sqlite.jdbc.password}")
	private String driverPassword;

	@Bean
	public DataSource sqliteDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(driverUrl);
		dataSource.setUsername(driverUsername);
		dataSource.setPassword(driverPassword);
		return dataSource;
	}

	@Bean
	public PlatformTransactionManager sqliteTransactionManager() {
		return new DataSourceTransactionManager(sqliteDataSource());
	}

}
