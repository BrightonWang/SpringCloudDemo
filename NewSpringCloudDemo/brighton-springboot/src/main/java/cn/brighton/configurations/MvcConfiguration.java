/**
 * BrightonWang.com Inc.
 * Copyright (c) 2019- All Rights Reserved.
 */
package cn.brighton.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: NewSpringCloudDemo, v 1.0 17:13 2019-04-02 BrightonWang Exp $
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private HandlerInterceptor myInterceptor;

    /**
     * @Description: 重写接口中的addInterceptors方法，添加自定义拦截器
     * @author wangxiaoliang
     * @date 2019-04-02 17:18
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
