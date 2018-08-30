package cn.brighton.springcloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 16:36 2018/8/30 lenovo Exp $
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaCustomerApplication {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaCustomerApplication.class).web(true).run(args);
    }
}
