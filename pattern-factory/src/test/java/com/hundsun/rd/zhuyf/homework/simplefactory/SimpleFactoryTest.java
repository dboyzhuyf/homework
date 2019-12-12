package com.hundsun.rd.zhuyf.homework.simplefactory;

import com.hundsun.rd.zhuyf.homework.simple.Apple;
import com.hundsun.rd.zhuyf.homework.simple.IFruit;
import com.hundsun.rd.zhuyf.homework.simple.Orange;
import com.hundsun.rd.zhuyf.homework.simple.SimpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IFruit apple = factory.create(Apple.class);
        IFruit orange = factory.create(Orange.class);
        System.out.println("苹果的价格是：" + apple.getPrice() + "元");
        System.out.println("桔子的价格是："  + orange.getPrice() + "元");
    }
}
