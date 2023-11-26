package com.samples.entity;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {

    public AnotherBean() {
        System.out.println("AnotherBean Instantiation with a Constructor without arg");
    }
}
