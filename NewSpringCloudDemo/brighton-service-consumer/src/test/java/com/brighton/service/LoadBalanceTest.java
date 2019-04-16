/**
 * brighton.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 15:28 2019-04-16 Brigh Exp $
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BrightonServiceConsumerApplication.class)
public class LoadBalanceTest {

    @Autowired
    private RibbonLoadBalancerClient client;

    @Test
    public void testLoadBalance() {
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = client.choose("user-service");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
    }
}
