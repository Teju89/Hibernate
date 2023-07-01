package com.jspiders.SpringJdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configurable
@ComponentScan("com.jspiders.SpringJdbc")
public class JdbcConfiguration {

	@Bean(name = "ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds =  new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("12345");
		return ds;
	}
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate gettemplate()
	{
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
}




















