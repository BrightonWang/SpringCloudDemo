/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.service;

import com.brighton.service.dao.UserClient;
import com.brighton.service.dao.UserDao;
import com.brighton.service.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <UserService>, v <1.0> 10:43 2019-04-11 Brigh Exp $
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserClient userClient;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> querUserByIds(List<Long> ids) {

        ArrayList<User> users = new ArrayList<>();
//        for (Long id : ids) {
//            User user = this.userDao.queryUserById(id);
//            users.add(user);
//        }

        ids.forEach(id -> {
//            users.add(userDao.queryUserById(id));
            // feign调用开始时间
            long begin = System.currentTimeMillis();
            users.add(userClient.queryUserById(id));
            // feign调用结束时间
            long end = System.currentTimeMillis();

            logger.debug("feign访问时间: {}", end - begin);
            //每次间隔500毫秒
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        return users;
    }

}
