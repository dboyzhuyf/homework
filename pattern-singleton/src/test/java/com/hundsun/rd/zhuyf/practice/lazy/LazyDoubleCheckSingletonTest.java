package com.hundsun.rd.zhuyf.practice.lazy;

public class LazyDoubleCheckSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(instance);
        });

        Thread t2 = new Thread(()->{
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(instance);
        });

        t1.start();
        t2.start();

    }
}
