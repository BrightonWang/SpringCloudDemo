package cn.brighton.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启Zuul网关功能
@EnableDiscoveryClient
public class BrightonZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightonZuulApplication.class, args);
    }
}
