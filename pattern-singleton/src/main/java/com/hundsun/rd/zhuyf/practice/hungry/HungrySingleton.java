package com.hundsun.rd.zhuyf.practice.hungry;

/**
 * @author zhuyf
 * 饿汉式单例是线程安全的，但是缺点是浪费内存空间，因为实例不管有没有用到，都会被创建。
 */
public class HungrySingleton {

    /**
     * 饿汉式单例，一启动就加载
     * 此处需要注意的是，单例对象是final的，防止后续被别人修改。
     */
    private final static HungrySingleton singleton = new HungrySingleton();

    /**
     * 构造方法私有化
     */
    private HungrySingleton(){}

    /**
     * 获取实例
     * @return HungrySingleton
     */
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
