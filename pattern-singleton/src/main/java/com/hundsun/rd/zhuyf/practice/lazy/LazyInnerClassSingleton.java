package com.hundsun.rd.zhuyf.practice.lazy;

/**
 * 懒汉式内部类单例，有效防止了内存空间的浪费，同时也解决了同步锁的并发性能问题
 * @author zhuyf
 */
public class LazyInnerClassSingleton {

    /**
     * 不管是采用构造器反射及序列化方式，都无法破坏此单例
     */
    private LazyInnerClassSingleton(){
        if(InstanceHolder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    /**
     * static是为了单例空间共享，而final是为了方法不被重写、重载
     * @return LazyInnerClassSingleton
     */
    public static final LazyInnerClassSingleton getInstance(){
        //使用时才会加载内部类，而且在方法返回前，一定会先加载内部类
        return InstanceHolder.INSTANCE;
    }

    //启动时，默认不会加载
    private static class InstanceHolder{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
