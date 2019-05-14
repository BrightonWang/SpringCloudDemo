package com.brighton.brightonservicezuulfilterdynamic.filter.post;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 17:36 2019-05-14 Brigh Exp $
 */
class PostFilter extends ZuulFilter {
    Logger log = LoggerFactory.getLogger(PostFilter.class);

    @Override
    String filterType() {
        return "post";
    }

    @Override
    int filterOrder() {
        return 2000;
    }

    @Override
    boolean shouldFilter() {
        return true;
    }

    @Override
    Object run() throws ZuulException {
        log.info("this is a post filter: Receive response");
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
        try {
            response.getOutputStream().print(", I am ironman");
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
