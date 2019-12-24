package com.hundsun.rd.zhuyf.practice.register;

import com.hundsun.rd.zhuyf.practice.ConcurrentExecutor;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        ConcurrentExecutor executer = new ConcurrentExecutor();
        try {
            executer.execute(()->{
                PojoTest pojo = (PojoTest) ContainerSingleton.getBean("com.hundsun.rd.zhuyf.practice.register.PojoTest");
                System.out.println(pojo);
            },100,10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
