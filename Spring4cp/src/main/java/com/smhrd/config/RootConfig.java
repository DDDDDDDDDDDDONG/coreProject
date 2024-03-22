package com.smhrd.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackages = {"com.smhrd.mapper"})
public class RootConfig {

	@Bean
	public DataSource myDataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
	    hikariConfig.setJdbcUrl("jdbc:mysql://project-db-campus.smhrd.com:3307/campus_23K_AI18_p2_2");
	    hikariConfig.setUsername("campus_23K_AI18_p2_2");
	    hikariConfig.setPassword("smhrd2");
	    
	    HikariDataSource ds = new HikariDataSource(hikariConfig);
	    return ds; // 자:커넥션 ds 넘겨주기
	}
	// 안녕하세요 테스트중 입니다
	
	@Bean
	public SqlSessionFactory sessionFactory() throws Exception{
		SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
		sf.setDataSource(myDataSource());
		return (SqlSessionFactory) sf.getObject(); //자:변환해서 돌려줘야함
	}
	
}
