package com.brighton.rabbitmqhello.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author wangxiaoliang
 * @version $Id: Receiver,17:28 2019-06-06 wangxiaoliang Exp $
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
