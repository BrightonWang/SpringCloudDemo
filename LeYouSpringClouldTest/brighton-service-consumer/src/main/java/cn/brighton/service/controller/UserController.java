package cn.brighton.service.controller;


import cn.brighton.service.pojo.User;
import cn.brighton.service.service.UserService;
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
 * @author wangxiaoliang
 * @version $Id: <className>, v <versionName> 14:39 2018/9/5 wanglxiaoliang Exp $
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> queryUserByIds(@RequestParam("ids") List<Long>ids){
        return userService.queryUserByIds(ids);
    }
}
