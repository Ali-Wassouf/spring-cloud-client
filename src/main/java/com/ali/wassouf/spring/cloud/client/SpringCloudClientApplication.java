package com.ali.wassouf.spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringCloudClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudClientApplication.class, args);
    }

}
