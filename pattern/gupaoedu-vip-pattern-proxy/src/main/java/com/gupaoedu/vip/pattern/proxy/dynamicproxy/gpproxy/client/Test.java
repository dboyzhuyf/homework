package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.client;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        GpMeipo gpMeipo = new GpMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove("Julia",25);
        zhangsan.buyInsure(25,new BuetifulGirl());


    }
}
