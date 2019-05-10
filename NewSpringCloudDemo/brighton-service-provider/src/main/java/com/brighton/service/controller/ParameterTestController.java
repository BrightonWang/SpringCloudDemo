package com.brighton.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 11:09 2019-05-10 Brigh Exp $
 */
@RefreshScope
@RestController
public class ParameterTestController {
    @Value("${from}")
    private String from;

    @Autowired
    private Environment environment;

    @GetMapping("/from")
    public String from() {
        return this.from;
    }

    @GetMapping("/brighton")
    public String brighton(){
        return environment.getProperty("brighton","哈哈,没找到唉");
    }

    @GetMapping("/envfrom")
    public String envfrom() {
        return environment.getProperty("from", "undefined");
    }
}
