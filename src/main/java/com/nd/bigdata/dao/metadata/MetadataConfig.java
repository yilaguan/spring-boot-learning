//package com.nd.bigdata.dao.metadata;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * Created by IntelliJ IDEA
// * Author: zhangliang
// * Date: 18-1-18
// * Time: 下午2:37
// * AuthorEmail: zhangliangxgd@163.com
// */
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactoryPrimary",
//        transactionManagerRef = "transactionManagerPrimary",
//        basePackages = {"com.nd.bigdata.dao.metadata"}
//)
//public class MetadataConfig {
//    @Primary
//    @Bean(name = "matadataDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.metadata")
//    public DataSource metadataDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean(name = "entityManagerFactoryPrimary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder, DataSource dataSource){
//        return builder.dataSource(dataSource).packages("com.nd.biadata.dao.metadata").persistenceUnit("metadataUnit").build();
//    }
//
//    @Primary
//    @Bean(name = "transactionManagerPrimary")
//    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder, DataSource dataSource){
//        return new JpaTransactionManager(entityManagerFactoryPrimary(builder, dataSource).getObject());
//    }
//}
