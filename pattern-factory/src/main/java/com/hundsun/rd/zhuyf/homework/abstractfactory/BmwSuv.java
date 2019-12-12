package com.hundsun.rd.zhuyf.homework.abstractfactory;

/**
 * @author zhuyf
 */
public class BmwSuv implements ICar {
    /**
     * 车是用来开的。
     */
    @Override
    public void drive() {
        System.out.println("我正在驾驶一辆X3！");
    }
}
