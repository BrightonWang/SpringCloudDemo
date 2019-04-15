/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.dao;

import com.brighton.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: UserDao, v <1.0> 10:27 2019-04-11 Brigh Exp $
 */
@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public User queryUserById(Long id) {
//        String url = "http://localhost:8081/user/"+id;
//        return restTemplate.getForObject(url,User.class);
        //根据服务名称,获取服务实例.有可能是集群,所以是service实例集合
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //因为只有一个userService,所以获取第一个实例
        ServiceInstance instance = instances.get(0);
        //获取ip和端口信息,拼接成服务地址
        String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
        return this.restTemplate.getForObject(baseUrl, User.class);
    }
}
