package com.niamh.pluralsight_demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(System.getenv("DB_URL"));
        builder.username(System.getenv("DB_USERNAME"));
        builder.password(System.getenv("DB_PASSWORD"));
        return builder.build();
    }
}
