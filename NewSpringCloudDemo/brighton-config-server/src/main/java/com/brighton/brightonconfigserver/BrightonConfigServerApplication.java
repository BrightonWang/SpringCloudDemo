package com.brighton.brightonconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BrightonConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightonConfigServerApplication.class, args);
    }

}
