package com.demo.b.controller;

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
    public String test() {
        return "test";
    }

    @RequestMapping("/app")
    public  String app() {
        String property = environment.getProperty("spring.application.name");
        System.out.println(property);
        return property;
    }

}