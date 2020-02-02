package com.hundsun.rd.zhuyf.practice.springbootdemo1;

import com.hundsun.rd.zhuyf.practice.HelloFormatterTemplate;
import com.hundsun.rd.zhuyf.practice.springbootdemo1.demo1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloFormatterTemplate helloFormatterTemplate;

    @GetMapping("hello")
    public String sayHello(String name){
        return "hello " + name;
    }

    @GetMapping("formatter")
    public String formatString(){
        User u = new User();
        u.setName("zhuyf");
        u.setAge(37);
        return helloFormatterTemplate.doFormat(u);
    }
}
