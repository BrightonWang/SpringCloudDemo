/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.service;

import com.brighton.service.entity.User;
import com.brighton.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: UserService, v <1.0> 16:33 2019-04-10 Brigh Exp $
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
