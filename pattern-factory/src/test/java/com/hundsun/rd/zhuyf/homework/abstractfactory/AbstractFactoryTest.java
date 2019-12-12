package com.hundsun.rd.zhuyf.homework.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        //奥迪汽车厂，生产A6和Q5
        ICarFactory audi = new AudiCarFactory();
        ICar audiAuto = audi.createAuto();
        ICar audiSuv = audi.createSuv();
        audiAuto.drive();
        audiSuv.drive();

        //奔驰汽车厂，生产S600和GLC
        ICarFactory benz = new BenzCarFactory();
        ICar benzAuto = benz.createAuto();
        ICar benzSuv = benz.createSuv();
        benzAuto.drive();
        benzSuv.drive();

        //宝马汽车厂，生产520和X3
        ICarFactory bmw = new BmwCarFactory();
        ICar bmwAuto = bmw.createAuto();
        ICar bmwSuv = bmw.createSuv();
        bmwAuto.drive();
        bmwSuv.drive();

    }
}
