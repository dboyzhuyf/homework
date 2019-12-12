package com.hundsun.rd.zhuyf.homework.method;

import com.hundsun.rd.zhuyf.homework.simple.Apple;
import com.hundsun.rd.zhuyf.homework.simple.IFruit;

/**
 * @author zhuyf
 */
public class AppleFactory implements IFruitFactory {

    /**
     * 创建一个苹果工厂，这里只生产苹果。
     *
     * @return IFruit
     */
    @Override
    public IFruit create() {
        return new Apple();
    }
}
