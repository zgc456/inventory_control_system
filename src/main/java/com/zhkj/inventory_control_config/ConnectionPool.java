package com.zhkj.inventory_control_config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Spring配置 连接数据库
 */
@MapperScan("com.zhkj.inventory_control_dao.mapper")
@ComponentScan("com.zhkj")
@Configuration
public class ConnectionPool {
    @Autowired
    private PropertiesConfig propertiesConfig;
    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        System.out.println(propertiesConfig.getDriver());
        druidDataSource.setUsername(propertiesConfig.getUserName());
        druidDataSource.setPassword(propertiesConfig.getPassword());
        druidDataSource.setUrl(propertiesConfig.getUrl());
        druidDataSource.setDriverClassName(propertiesConfig.getDriver());
        return druidDataSource;
    }
    @Autowired
    private DataSource dataSource;
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
      SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("mybatis/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactoryBean.setTypeAliasesPackage("com.zhkj.inventory_control_dao.mapper");
        return sqlSessionFactoryBean;
    }
    @Bean
   public DataSourceTransactionManager dataSourceTransactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }
}
