/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.dao;

import com.brighton.service.configuration.FeignLogConfiguration;
import com.brighton.service.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: UserClient, v <1.0> 17:11 2019-04-22 Brigh Exp $
 */
@FeignClient(value = "user-service", fallback = UserClientFallBack.class,configuration = FeignLogConfiguration.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
