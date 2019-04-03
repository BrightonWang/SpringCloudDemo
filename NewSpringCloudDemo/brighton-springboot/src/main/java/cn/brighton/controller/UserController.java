/**
 * BrightonWang.com Inc.
 * Copyright (c) 2019- All Rights Reserved.
 */
package cn.brighton.controller;

import cn.brighton.entity.User;
import cn.brighton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: NewSpringCloudDemo, v 1.0 22:31 2019-04-03 BrightonWang Exp $
 */
//@RestController
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public User querUserById() {
        return this.userService.queryById(1l);
    }

    @GetMapping("/all")
    public String all(ModelMap model) {
        //查询用户
        List<User> users = this.userService.queryAll();
        //放入模型
        model.addAttribute("users", users);
        //返回模型名称(就是classpath:/templates/目录下的html文件名)
        return "users";
    }
}
