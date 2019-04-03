package cn.brighton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


/**
 * <p>
 * springboot HelloWorld
 * </p>
 *
 * @author BrightonWang
 * @version $Id: <HelloController>, 16:11 2019-03-10 BrightonWang Exp $
 */
@RestController
//@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test() {
        return "Hello Spring Boot! Brighton is Coming";
    }

//    public public void main(String[] args){
//        SpringApplication.run(HelloController.class,args);
//    }

}
