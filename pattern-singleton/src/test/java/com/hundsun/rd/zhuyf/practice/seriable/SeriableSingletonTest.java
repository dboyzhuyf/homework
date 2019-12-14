package com.hundsun.rd.zhuyf.practice.seriable;

import java.io.*;

public class SeriableSingletonTest {

    public static void main(String[] args) {

        SeriableSingleton instance = SeriableSingleton.getInstance();
        SeriableSingleton seriableInstance = null;

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriableInstance = (SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(instance);
            System.out.println(seriableInstance);
            System.out.println(instance == seriableInstance);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        
    }
}
