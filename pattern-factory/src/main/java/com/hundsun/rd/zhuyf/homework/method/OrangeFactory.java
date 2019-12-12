package com.hundsun.rd.zhuyf.homework.method;

import com.hundsun.rd.zhuyf.homework.simple.IFruit;
import com.hundsun.rd.zhuyf.homework.simple.Orange;

/**
 * @author zhuyf
 */
public class OrangeFactory implements IFruitFactory {
    /**
     * 创建一个桔子工厂，这里只生产桔子
     *
     * @return IFruit
     */
    @Override
    public IFruit create() {
        return new Orange();
    }
}
