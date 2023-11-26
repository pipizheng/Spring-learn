package com.samples;


import com.samples.service.ExampleBean;
import com.samples.service.SampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApplication {

    public  static  void main(String[] args){
//        实例化容器,AppConfig类配置类的扫描路径
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Object bean = context.getBean(ExampleBean.class);
        System.out.println(bean);
        // 实例化容器,AppConfig类配置类的扫描路径
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Object bean = context.getBean(SampleService.class);
//        System.out.println(bean);
    }

}
