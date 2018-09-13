package cn.brighton.service.service;


import cn.brighton.service.dao.UserClient;
import cn.brighton.service.dao.UserDao;
import cn.brighton.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
//    @Autowired
//    private UserDao userDao;
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private UserClient userClient;

    public List<User> queryUserByIds(List<Long> ids){
        List<User> users = new ArrayList<>();
        //地址直接写服务名称即可
//        String baseUrl = "http://user-service/user/";
//        ids.forEach(id->{
            //我们测试多次查询
//            users.add(this.restTemplate.getForObject(baseUrl+id, User.class));
            //每次间隔500毫秒
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });


//        for (Long id : ids){
//            User user = userDao.queryUserById(id);
//            users.add(user);
//        }

            ids.forEach(id->{
                //我们测试多次查询
                users.add(userClient.queryUserById(id));
            });

        return users;
    }
}
