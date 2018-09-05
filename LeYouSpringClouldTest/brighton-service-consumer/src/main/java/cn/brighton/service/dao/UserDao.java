package cn.brighton.service.dao;


import cn.brighton.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author wangxiaoliang
 * @version $Id: <className>, v <versionName> 14:17 2018/9/5 wangxiaoliang Exp $
 */
@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient; //eureka客户端,可以获取到eureka中的服务信息

    public User queryUserById(Long id){
//        String url = "http://localhost:8081/user/"+id;
//        return this.restTemplate.getForObject(url,User.class);
        //根据服务名称,获取服务实例.有可能是集群,所以是service实例集合
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //因为只有一个UserService.所以获取第一个实例
        ServiceInstance instance = instances.get(0);
        //获取ip和端口信息,拼接成服务地址
        String baseURL= "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
        return restTemplate.getForObject(baseURL,User.class);
    }
}
