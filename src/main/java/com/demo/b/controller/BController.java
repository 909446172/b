package com.demo.b.controller;

import com.demo.b.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("b")
    public String b() {
        return bService.test1("---");
    }

    @RequestMapping("bb")
    public String bb() {
        return bService.services().toString();
    }
}
