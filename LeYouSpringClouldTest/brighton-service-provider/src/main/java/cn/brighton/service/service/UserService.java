package cn.brighton.service.service;


import cn.brighton.service.mapper.UserMapper;
import cn.brighton.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 17:35 2018/9/4 lenovo Exp $
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        try {
            //为了演示超时现象,我们在这里线程休眠,时间随机0~2000毫秒
            Thread.sleep(new Random().nextInt(2000));
//            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.userMapper.selectByPrimaryKey(id);
    }
}
