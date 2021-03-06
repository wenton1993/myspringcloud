package com.wt.myspringcloud.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 文通
 * @since 2019/9/22
 */
@Configuration
public class DirectPatternConfig {

    private final String HELLO_QUEUE = "helloQueue";

    @Bean
    public Queue helloQueue() {
        return new Queue(HELLO_QUEUE);
    }
}
