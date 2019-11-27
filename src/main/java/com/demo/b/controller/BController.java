package com.demo.b.controller;

import com.demo.b.config.TestConfig;
import com.demo.b.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/13 17:07
 */
@RestController
public class BController {

    @Autowired
    BService bService;

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    Environment environment;

    @Autowired
    TestConfig testConfig;

    @RequestMapping("testConfig")
    public String testConfig() {
        return testConfig.toString();
    }

    @RequestMapping("b")
    public String b() {
        return bService.test1("---");
    }

    @RequestMapping("bb")
    public String bb() {
        return bService.services().toString();
    }

    @RequestMapping("a")
    public String a() {
        return "aaaaaaaaaaa";
    }

    @RequestMapping("svc")
    public String svc() {
        return discoveryClient.getServices().toString();
    }

    @RequestMapping("test")
    public String test() throws InterruptedException {

        System.out.println("ready request");
        Thread.sleep(10000L);
        System.out.println("already request");


        return "test";
    }

    @RequestMapping("/app")
    public  String app() {
        String property = environment.getProperty("spring.application.name");
        String tt = environment.getProperty("tt");
        System.out.println(tt);
        String a = environment.getProperty("a");
        System.out.println(a);
        System.out.println(property);
        return property;
    }

}
