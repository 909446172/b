package com.demo.b.controller;

import com.demo.b.BadRequestException;
import com.demo.b.service.BService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/13 17:07
 */
@RestController
@AllArgsConstructor
public class BController {

    BService bService;

    DiscoveryClient discoveryClient;

    Environment environment;

    RestTemplate restTemplate;

//    WebClient webClient;

//    @RequestMapping("testConfig")
//    public String testConfig() {
//        return testConfig.toString();
//    }

    @RequestMapping("rest")
    public String rest() {
        return restTemplate.getForObject("http://a/{test}/a", String.class, "aaaaaaaaaa");
    }

//    @RequestMapping("reactive")
//    public Mono<String> reactive() {
//        return webClient.get()
//                .uri("http://a/{test}/a", uriBuilder -> {
//                    HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//                    objectObjectHashMap.put("test", "reactive interface");
//                   return  uriBuilder.build(objectObjectHashMap);
//                })
//                .retrieve()
//                .bodyToMono(String.class);
//    }

    @RequestMapping("b")
    public String b() {
        return bService.test1("---");
    }

    @RequestMapping("bb")
    public String bb() {
        return bService.services().toString();
    }

    @RequestMapping
    public String inet() throws UnknownHostException, SocketException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return inetAddress.getHostAddress() + "\t" + inetAddress.getHostName() + "\t" + inetAddress.getCanonicalHostName();
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
    public Date test() throws InterruptedException {

        System.out.println("ready request");
//        Thread.sleep(10000L);
        System.out.println("already request");
        throw new BadRequestException("ddd", new Exception("-------------"));
    }

    @RequestMapping("/app")
    public String app() {
        String property = environment.getProperty("spring.application.name");
        String tt = environment.getProperty("tt");
        System.out.println(tt);
        String a = environment.getProperty("a");
        System.out.println(a);
        System.out.println(property);
        return property;
    }

}
