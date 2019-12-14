package com.hundsun.rd.zhuyf.practice.lazy;

/**
 * @author zhuyf
 * 懒汉式单例
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        //虽然懒汉式单例在用户使用时才分配内存，但是它是线程不安全的
        //为了解决线程安全问题，必须给方法加上synchronized关键字，也就是增加同步锁
        if(null == instance){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }

}
