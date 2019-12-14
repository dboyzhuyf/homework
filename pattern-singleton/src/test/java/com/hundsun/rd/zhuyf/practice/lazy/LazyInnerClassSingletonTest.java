package com.hundsun.rd.zhuyf.practice.lazy;

import com.hundsun.rd.zhuyf.practice.ConcurrentExecutor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
           LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
           System.out.println(instance);
        });

        Thread t2 = new Thread(()->{
            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
            System.out.println(instance);
        });

        t1.start();
        t2.start();
        try {
            ConcurrentExecutor.execute(() -> {
                LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
                System.out.println(instance);
            }, 100, 20);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
