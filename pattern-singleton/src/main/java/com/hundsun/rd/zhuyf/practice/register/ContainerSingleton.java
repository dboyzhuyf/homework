package com.hundsun.rd.zhuyf.practice.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhuyf
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                try {
                    Object obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                    return obj;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return null;
            }else{
                return ioc.get(className);
            }
        }
    }
}
