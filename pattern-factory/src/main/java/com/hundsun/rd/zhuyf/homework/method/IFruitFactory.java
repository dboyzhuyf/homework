package com.hundsun.rd.zhuyf.homework.method;

import com.hundsun.rd.zhuyf.homework.simple.IFruit;

/**
 * @author zhuyf
 */
public interface IFruitFactory {

    /**
     * 创建一个水果工厂
     * @return IFruit
     */
    public IFruit create();
}
