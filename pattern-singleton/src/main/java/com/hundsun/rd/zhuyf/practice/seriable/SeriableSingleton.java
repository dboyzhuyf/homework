package com.hundsun.rd.zhuyf.practice.seriable;

import java.io.Serializable;

/**
 * 反序列化破坏单例
 * @author zhuyf
 */
public class SeriableSingleton implements Serializable {

    private static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    /**
     * 添加此方法后，可防止反序列化破坏单例
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }

}
