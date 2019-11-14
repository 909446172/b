package com.demo.b.service;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/13 15:08
 */
@FeignClient(name = "app",url = "http://192.168.64.130:30002")
public interface BService {

    @RequestMapping("/{test}/a")
    @LoadBalanced
    public String test1(@PathVariable String test);

    @RequestMapping("/services")
    @LoadBalanced
    public List<String> services();

}
