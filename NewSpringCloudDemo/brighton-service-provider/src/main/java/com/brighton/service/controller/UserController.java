/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.controller;

import com.brighton.service.entity.User;
import com.brighton.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: UserController, 16:07 2019-04-10 Brigh Exp $
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return this.userService.queryById(id);
    }
}
