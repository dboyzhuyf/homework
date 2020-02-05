package com.hundsun.rd.zhuyf.practice.dubbo.demo.client;

import com.hundsun.rd.zhuyf.practice.dubbo.api.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext= new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        LoginService loginService=(LoginService)classPathXmlApplicationContext.getBean("loginService");
        System.out.println(loginService.login("admin","admin"));
    }
}
