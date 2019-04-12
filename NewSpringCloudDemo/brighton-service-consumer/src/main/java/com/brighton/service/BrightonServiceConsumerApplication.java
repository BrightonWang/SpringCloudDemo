package com.brighton.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BrightonServiceConsumerApplication {
    @Bean
    public RestTemplate restTemplate(){
        //这次我们使用了okHttp客户端,只需注入工厂即可
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

    public static void main(String[] args) {
        SpringApplication.run(BrightonServiceConsumerApplication.class, args);
    }

}