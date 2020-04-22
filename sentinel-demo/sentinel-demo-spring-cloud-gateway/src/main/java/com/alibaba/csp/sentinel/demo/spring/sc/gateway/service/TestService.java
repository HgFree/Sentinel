package com.alibaba.csp.sentinel.demo.spring.sc.gateway.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @SentinelResource("/sayHello")
    public String sayHello() {
        System.out.println("hello");
        return "success";
    }
}
