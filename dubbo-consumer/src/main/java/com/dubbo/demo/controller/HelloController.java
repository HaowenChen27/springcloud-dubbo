package com.dubbo.demo.controller;

import com.dubbo.demo.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhaowen
 * @description TODO
 * @date 9/10/21 11:09 AM
 */
@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        return helloService.hello("Dubbo!");
    }
}
