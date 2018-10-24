package com.panekey.sBMDemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
@Configuration
public class MybatisConfig {
	@Value("${druid.url}")
	private String dbUrl;

	@Value("${druid.username}")
	private String username;

	@Value("${druid.password}")
	private String password;

	@Value("${druid.driverClassName}")
	private String driverClassName;

	@Value("${druid.initialSize}")
	private int initialSize;

	@Value("${druid.minIdle}")
	private int minIdle;

	@Value("${druid.maxActive}")
	private int maxActive;

	@Value("${druid.maxWait}")
	private int maxWait;

	@Value("${druid.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${druid.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${druid.validationQuery}")
	private String validationQuery;

	@Value("${druid.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${druid.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${druid.testOnReturn}")
	private boolean testOnReturn;

	@Value("${druid.poolPreparedStatements}")
	private boolean poolPreparedStatements;

	@Value("${druid.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${druid.filters}")
	private String filters;

	@Value("{druid.connectionProperties}")
	private String connectionProperties;

	@Bean(initMethod = "init", destroyMethod = "close") /** ������ΪBeanʵ�� */
	@Primary /** ��ͬ����DataSource�У�����ʹ�ñ���ע��DataSource */
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(this.dbUrl);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setDriverClassName(driverClassName);

		/** configuration */
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxActive(maxActive);
		datasource.setMaxWait(maxWait);
		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		datasource.setValidationQuery(validationQuery);
		datasource.setTestWhileIdle(testWhileIdle);
		datasource.setTestOnBorrow(testOnBorrow);
		datasource.setTestOnReturn(testOnReturn);
		datasource.setPoolPreparedStatements(poolPreparedStatements);
		datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		datasource.setConnectionProperties(connectionProperties);
		return datasource;		
	}
	
}
