/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.dao;

import com.brighton.service.entity.User;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <UserClientFallBack>, v <1.0> 17:37 2019-04-22 Brigh Exp $
 */
@Component
public class UserClientFallBack implements UserClient{

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setTbUserId(id);
        user.setName("用户信息查询出现异常");
        return user;
    }
}
