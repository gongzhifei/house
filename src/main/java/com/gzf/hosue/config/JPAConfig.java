package com.gzf.hosue.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.gzf.house.repository")
@EnableTransactionManagement
public class JPAConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 实体管理映射配置
     * @return
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        //是否生成sql
        jpaVendorAdapter.setGenerateDdl(false);
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();

        containerEntityManagerFactoryBean.setDataSource(dataSource());
        containerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        containerEntityManagerFactoryBean.setPackagesToScan("com.gzf.house.entity");
        return containerEntityManagerFactoryBean;
    }

    /**
     * 事务管理配置
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

}
