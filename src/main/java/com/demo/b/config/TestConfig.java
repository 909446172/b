package com.demo.b.config;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/14 17:13
 */
@ConfigurationProperties("greeting")
@Configuration
@Data
public class TestConfig {

    private String message;

    private String messagetest;

    private String messagedevelop;



}
