package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    @Override
    public void findLove(String name,int age) {
        System.out.println("张三要求：肤白貌美大长腿，名字要好听，" + name + "，年龄适中" + age);
    }

    @Override
    public void buyInsure(Integer age,BuetifulGirl girl) {
        System.out.println("30万" + age + girl);
    }

    public void buyInsure() {
        System.out.println("30万");
    }

}
