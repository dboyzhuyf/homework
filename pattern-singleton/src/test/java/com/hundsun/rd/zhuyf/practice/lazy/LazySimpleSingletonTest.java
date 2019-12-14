package com.hundsun.rd.zhuyf.practice.lazy;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        //增加两个线程，检测懒汉式单例增加同步锁之后，是否是线程安全的
        //可以通过增加断点，同时，采用线程方式调试程序，确认线程1获得锁后，线程2是否是Monitor状态
        Thread t1 = new Thread(()->{
            LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
            System.out.println(instance);
        });

        Thread t2 = new Thread(()->{
            LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
            System.out.println(instance);
        });

        t1.start();
        t2.start();
    }
}
