/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <LoginFilter>, v <1.0> 13:47 2019-04-26 Brigh Exp $
 */
@Component
public class LoginFilter extends ZuulFilter {

    /**
     * <p>
     * 过滤器类型: 前置过滤器
     * </p>
     * @Date: 13:48 2019-04-26
     * @param
     * @return:
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * <p>
     * 过滤器的执行顺序
     * </p>
     * @Date: 13:48 2019-04-26
     * @param
     * @return:
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * <p>
     * 过滤器是否生效
     * </p>
     * @Date: 13:49 2019-04-26
     * @param
     * @return:
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * <p>
     * 登录校验逻辑
     * </p>
     * @Date: 13:50 2019-04-26
     * @param
     * @return:
     */
    @Override
    public Object run() throws ZuulException {
        // 获取zuul提供的上下文对象
        RequestContext context = RequestContext.getCurrentContext();
        // 从上下文对象中获取请求对象
        HttpServletRequest request = context.getRequest();
        // 获取token信息
        String token = request.getParameter("access-token");
        // 判断
        if(StringUtils.isBlank(token)){
            // 过滤该请求,不对其进行路由
            context.setSendZuulResponse(false);
            // 设置响应状态码,401
            context.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            // 设置响应信息
            context.setResponseBody("{\"status\":\"401\",\"text\":\"request error!\"}");
        }
        // 校验通过, 把登录信息放入上下文信息, 继续向后执行
        context.set("token",token);
        return null;
    }
}
