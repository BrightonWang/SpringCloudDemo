/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.service;

import com.brighton.service.dao.UserDao;
import com.brighton.service.entity.User;
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

    public List<User> querUserByIds(List<Long> ids){
        ArrayList<User> users = new ArrayList<>();
//        for (Long id : ids) {
//            User user = this.userDao.queryUserById(id);
//            users.add(user);
//        }

        ids.forEach(id -> {
            users.add(userDao.queryUserById(id));
        });
        return users;
    }

}
