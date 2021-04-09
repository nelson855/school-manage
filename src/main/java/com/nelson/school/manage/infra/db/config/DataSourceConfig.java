package com.nelson.school.manage.infra.db.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author nelson
 * @Desc
 * @date 2021/3/25 8:25 下午
 */
@Configuration
@Profile("!ut")
public class DataSourceConfig {

    /**
     * hms 数据源配置
     */
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.hms")
    @Bean(name = "hmsDatasource")
    public DataSource getHmsDataSource() {
        return DataSourceBuilder.create().build();
    }
}
