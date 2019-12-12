package com.hundsun.rd.zhuyf.homework.abstractfactory;

/**
 * @author zhuyf
 */
public class BenzCarFactory implements ICarFactory {
    /**
     * 生产一辆小汽车
     *
     * @return ICar
     */
    @Override
    public ICar createAuto() {
        return new BenzAutoMobile();
    }

    /**
     * 生产一辆SUV
     *
     * @return ICar
     */
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

}
