package com.dubbo.demo.service;

import com.dubbo.demo.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author chenhaowen
 * @description TODO
 * @date 9/10/21 10:41 AM
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
