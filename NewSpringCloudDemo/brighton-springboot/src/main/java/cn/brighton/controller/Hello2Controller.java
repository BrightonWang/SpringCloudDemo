package cn.brighton.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: <className>, v <versionName> 16:26 2019-03-10 BrightonWang Exp $
 */
@RestController
public class Hello2Controller {

    @GetMapping("show2")
    public String test() {
        return "Hello World, SpringBoot Try Again";
    }
}

