package com.wt.myspringcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class StreamApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication2.class, args);
    }
}
