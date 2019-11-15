package com.demo.b;

import com.demo.b.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableConfigurationProperties(TestConfig.class)
public class BApplication {

    public static void main(String[] args) {
        SpringApplication.run(BApplication.class, args);
    }

}
