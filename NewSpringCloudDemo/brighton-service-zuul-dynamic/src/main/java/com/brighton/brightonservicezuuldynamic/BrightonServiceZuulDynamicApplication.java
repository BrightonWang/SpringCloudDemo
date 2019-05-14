package com.brighton.brightonservicezuuldynamic;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy // 开启网关功能
@SpringCloudApplication
public class BrightonServiceZuulDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightonServiceZuulDynamicApplication.class, args);
    }

//    @Bean
//    @RefreshScope
//    @ConfigurationProperties("zuul")
//    public ZuulProperties zuulProperties() {
//        return new ZuulProperties();
//    }
}
