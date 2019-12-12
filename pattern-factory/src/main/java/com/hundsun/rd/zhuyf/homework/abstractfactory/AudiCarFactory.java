package com.hundsun.rd.zhuyf.homework.abstractfactory;

/**
 * @author zhuyf
 */
public class AudiCarFactory implements ICarFactory {
    /**
     * 生产一辆小汽车
     *
     * @return ICar
     */
    @Override
    public ICar createAuto() {
        return new AudiAutoMobile();
    }

    /**
     * 生产一辆SUV
     *
     * @return ICar
     */
    @Override
    public ICar createSuv() {
        return new AudiSuvCar();
    }

}
