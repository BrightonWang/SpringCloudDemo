/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.dao;

import com.brighton.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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

    public User queryUserById(Long id){
        String url = "http://localhost:8081/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }
}
