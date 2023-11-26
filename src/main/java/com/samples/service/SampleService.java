package com.samples.service;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

//@Component
public class SampleService {

    public SampleService() {
        System.out.println("SampleService实例化完毕");
    }

    /**
     * 测试 Spring 扩展
     */
//    @PostConstruct
//    public void init() {
//        System.out.println("SampleService初始化完毕");
//    }
}
