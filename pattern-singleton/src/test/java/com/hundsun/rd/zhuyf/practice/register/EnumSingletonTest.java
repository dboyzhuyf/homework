package com.hundsun.rd.zhuyf.practice.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton instance1 = null;
//
//        EnumSingleton instance2 = EnumSingleton.getInstance();
//        instance2.setData(new Object());
//
//        try {
//            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(instance2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            instance1 = (EnumSingleton) ois.readObject();
//            fis.close();
//            ois.close();
//
//            System.out.println(instance1.getData());
//            System.out.println(instance2.getData());
//            System.out.println(instance1.getData() == instance2.getData());
//
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        Class clazz = EnumSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("zhuyf",666);
            System.out.println(enumSingleton.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
