package com.hundsun.rd.zhuyf.practice.lazy;

import com.hundsun.rd.zhuyf.practice.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

//        Thread t1 = new Thread(()->{
//           LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//           System.out.println(instance);
//        });
//
//        Thread t2 = new Thread(()->{
//            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//            System.out.println(instance);
//        });
//
//        t1.start();
//        t2.start();
//        try {
//            ConcurrentExecutor.execute(() -> {
//                LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//                System.out.println(instance);
//            }, 100, 20);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }

        Class<?> clazz = LazyInnerClassSingleton.class;

        try {
            //通过反射拿到私有构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            //初始化
            Object o1 = c.newInstance();
            //再强行创建一个对象
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
