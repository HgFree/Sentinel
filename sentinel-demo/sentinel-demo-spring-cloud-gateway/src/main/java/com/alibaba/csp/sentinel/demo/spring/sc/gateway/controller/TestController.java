package com.alibaba.csp.sentinel.demo.spring.sc.gateway.controller;

import com.alibaba.csp.sentinel.demo.spring.sc.gateway.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping(value = "/test")
    public String test(){
        return testService.sayHello();
    }
}
