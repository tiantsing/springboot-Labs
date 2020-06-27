package com.springboot.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JDBCConfig {

    private JdbcProperties jdbcProperties;

    public JDBCConfig(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();
        /*source.setDriverClassName(this.jdbcProperties.getDriverClassName());
        source.setUrl(this.jdbcProperties.getUrl());
        source.setUsername(this.jdbcProperties.getUsername());
        source.setPassword(this.jdbcProperties.getPassword());*/
        return source;
    }
}
