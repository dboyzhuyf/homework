package com.hundsun.rd.zhuyf.practice.threadlocal;

import com.hundsun.rd.zhuyf.practice.ConcurrentExecutor;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        ConcurrentExecutor executor = new ConcurrentExecutor();
        try {
            executor.execute(()->{
                System.out.println(ThreadLocalSingleton.getInstance());
            },100,10);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
