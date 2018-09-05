package cn.brighton.service.service;


import cn.brighton.service.dao.UserDao;
import cn.brighton.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 14:20 2018/9/5 lenovo Exp $
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> queryUserByIds(List<Long> ids){
        List<User> users = new ArrayList<>();
        for (Long id : ids){
            User user = userDao.queryUserById(id);
            users.add(user);
        }
        return users;
    }
}
