package cn.brighton.configurations;


import cn.brighton.properties.JdbcProperties;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: <JdbcConfiguration>, v 1.0 22:36 2019-03-10 BrightonWang Exp $
 */
@Configuration
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;

//    @Autowired
//    private JdbcProperties jdbcProperties;
//
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
////        dataSource.setUrl(url);
////        dataSource.setDriverClassName(driverClassName);
////        dataSource.setUsername(username);
////        dataSource.setPassword(password);
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }

    @Bean
    //声明要注入的属性前缀，SpringBoot 会自动把先关属性通过set方式注入到DataSource中
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}
