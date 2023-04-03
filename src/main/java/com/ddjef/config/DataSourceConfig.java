package com.ddjef.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	/*@Bean
	public DataSource getDataSource() {
		
		DataSourceBuilder data=DataSourceBuilder.create();
		
		data.driverClassName("com.mysql.cj.jdbc.Driver");
		data.url("jdbc:mysql://localhost:3306/trans?createDatabaseIfNotExist = true");
		data.username("root");
		data.password("");
		
		
		return data.build();
		
	
	}*/

}
