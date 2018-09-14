package cn.brighton.service.dao;


import cn.brighton.service.configuration.FeignLogConfiguration;
import cn.brighton.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 10:43 2018/9/13 lenovo Exp $
 */
@FeignClient(value="user-service",fallback = UserClientFallback.class,configuration = FeignLogConfiguration.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
