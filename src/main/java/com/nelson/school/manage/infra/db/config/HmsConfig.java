package com.nelson.school.manage.infra.db.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author nelson
 * @Desc hms 数据库配置
 * @date 2021/3/25 8:11 下午
 */
@Configuration
@Profile("!ut")
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "hmsManagerFactory",
        transactionManagerRef = "hmsTransactionManager",
        basePackages = {"com.nelson.school.manage.infra.db.dao"})
public class HmsConfig {

    @Resource(name = "hmsDatasource")
    private DataSource dataSource;

    @Autowired
    private EntityManagerFactoryBuilder builder;

    @Bean(name = "hmsManagerFactory")
    public LocalContainerEntityManagerFactoryBean hmsEntityManagerFactory() {
        return builder
                .dataSource(dataSource)
                // 设置实体包名
                .packages("com.nelson.school.manage.infra.db.dataobject")
                // 设置持久化单元名，用于@PersistenceContext注解获取EntityManager时指定数据源
                .persistenceUnit("hmsPersistenceUnit")
                .build();
    }

    @Bean(name = "hmsTransactionManager")
    public PlatformTransactionManager hmsTransactionManager(
            @Qualifier("hmsManagerFactory") EntityManagerFactory hmsEntityManagerFactory) {
        return new JpaTransactionManager(hmsEntityManagerFactory);
    }
}
