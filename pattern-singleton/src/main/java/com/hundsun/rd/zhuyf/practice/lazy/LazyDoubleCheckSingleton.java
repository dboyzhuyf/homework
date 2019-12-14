package com.hundsun.rd.zhuyf.practice.lazy;

/**
 * @author zhuyf
 * 在懒汉式单例的基础上，减少锁竞争的冲突机率
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //第一层判断，判断实例是否已经存在
        if(null == instance){
            //增加同步锁，但是相对懒汉式单例明显减少了锁定范围，
            // 一个是类级别，而另一个会进入方法后才会有同步锁的等待
            synchronized (LazyDoubleCheckSingleton.class){
                //这里的判断也很重要，如果两个线程同时执行到这一行，后到的线程则会挂起
                //直到锁释放，如果不加这个判断，锁释放后再次实例化，仍然是线程不安全的
                if(null == instance){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
