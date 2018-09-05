package cn.brighton.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@MapperScan("cn.brighton.service.mapper")
@SpringBootApplication
public class BrightonServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightonServiceProviderApplication.class, args);
    }
}
