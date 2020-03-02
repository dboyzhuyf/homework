package com.hundsun.rd.zhuyf.practice.pay;

public class PayServiceFactory {

    public IPayService getPayService(Class clazz) {
        try {
            Object obj = clazz.newInstance();
            if(obj instanceof IPayService){
                return (IPayService)obj;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
