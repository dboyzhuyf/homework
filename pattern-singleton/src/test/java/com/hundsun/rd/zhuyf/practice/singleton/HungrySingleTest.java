package com.hundsun.rd.zhuyf.practice.singleton;

import com.hundsun.rd.zhuyf.practice.hungry.HungrySingleton;

public class HungrySingleTest {

    public static void main(String[] args) {

        //创建两个线程，检验多线程场景下单例有效性
        Thread t1 = new Thread(()->{
            HungrySingleton singleton1 = HungrySingleton.getInstance();
            System.out.println(singleton1);
        });

        Thread t2 = new Thread(()->{
            HungrySingleton singleton2 = HungrySingleton.getInstance();
            System.out.println(singleton2);
        });

        //线程1启动
        t1.start();
        //线程2启动
        t2.start();

    }
}
