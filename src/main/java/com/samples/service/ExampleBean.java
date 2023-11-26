package com.samples.service;

import com.samples.entity.AnotherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ExampleBean {

    @Autowired
    private AnotherBean beanOne;

    // a setter method so that the Spring container can inject a AnotherBean
    public void setBeanOne(AnotherBean beanOne) {
        this.beanOne = beanOne;
        System.out.println("Dependency Injection by Setter");
    }


    public ExampleBean() {
        System.out.println("ExampleBean Instantiation with a Constructor without arg");
    }


    public ExampleBean(AnotherBean beanOne) {
        this.beanOne = beanOne;
        System.out.println("Dependency Injection by Constructor ");
    }

}
