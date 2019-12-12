package com.hundsun.rd.zhuyf.homework.abstractfactory;

/**
 * @author zhuyf
 */
public interface ICarFactory {

    /**
     * 生产一辆小汽车
     * @return ICar
     */
    public ICar createAuto();

    /**
     * 生产一辆SUV
     * @return ICar
     */
    public ICar createSuv();

}
