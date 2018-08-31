package cn.brighton.springcloud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 16:41 2018/8/30 lenovo Exp $
 */
@RestController
public class DcController {
    //springcloud提供的负载均衡器客户端接口实现服务消费
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public  String dc(){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url,String.class);
//        return restTemplate.getForObject("http://eureka-client/dc",String.class);
        return restTemplate.getForObject("http://consul-client/dc",String.class);
    }


}
