package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;


/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    public void findLove(String birthday) {
        System.out.println("张三要求：肤白貌美大长腿，外加八字合" + birthday);
    }

    public void buyInsure() {
        System.out.println("30万");
    }

}
