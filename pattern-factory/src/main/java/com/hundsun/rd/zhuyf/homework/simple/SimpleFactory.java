package com.hundsun.rd.zhuyf.homework.simple;

/**
 * @author zhuyf
 */
public class SimpleFactory {

    public IFruit create(Class<? extends IFruit > clazz){
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
