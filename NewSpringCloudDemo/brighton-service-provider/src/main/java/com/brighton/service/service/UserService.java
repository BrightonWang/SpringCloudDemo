/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.service;

import com.brighton.service.entity.User;
import com.brighton.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

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
        try {
            // 为了演示超时现象,我们在这里线程休眠,时间随机0~2000毫秒,
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
