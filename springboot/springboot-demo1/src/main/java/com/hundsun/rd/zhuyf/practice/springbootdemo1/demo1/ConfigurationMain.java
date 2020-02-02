package com.hundsun.rd.zhuyf.practice.springbootdemo1.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ConfigurationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationMain.class);
        DemoClass demoClass = applicationContext.getBean(DemoClass.class);
        demoClass.test();
    }
}
