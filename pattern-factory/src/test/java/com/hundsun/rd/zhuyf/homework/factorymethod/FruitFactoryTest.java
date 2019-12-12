package com.hundsun.rd.zhuyf.homework.factorymethod;

import com.hundsun.rd.zhuyf.homework.method.AppleFactory;
import com.hundsun.rd.zhuyf.homework.method.IFruitFactory;
import com.hundsun.rd.zhuyf.homework.method.OrangeFactory;
import com.hundsun.rd.zhuyf.homework.simple.IFruit;

public class FruitFactoryTest {

    public static void main(String[] args) {

        IFruitFactory appleFactory = new AppleFactory();
        IFruit apple = appleFactory.create();
        System.out.println("苹果的价格是：" + apple.getPrice());

        IFruitFactory orangeFactory = new OrangeFactory();
        IFruit orange = orangeFactory.create();
        System.out.println("桔子的价格是：" + orange.getPrice());
    }
}
