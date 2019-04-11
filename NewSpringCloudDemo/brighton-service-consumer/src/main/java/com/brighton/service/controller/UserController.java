/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.controller;

import com.brighton.service.entity.User;
import com.brighton.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <UserController>, v <1.0> 10:46 2019-04-11 Brigh Exp $
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> queryUserByIds(@RequestParam("ids") List<Long>ids){
        return userService.querUserByIds(ids);
    }
}
