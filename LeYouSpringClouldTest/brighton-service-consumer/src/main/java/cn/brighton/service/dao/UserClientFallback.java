package cn.brighton.service.dao;


import cn.brighton.service.pojo.User;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 11:06 2018/9/13 lenovo Exp $
 */
@Component
public class UserClientFallback implements UserClient {

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户信息查询出现异常!");
        return user;
    }
}
