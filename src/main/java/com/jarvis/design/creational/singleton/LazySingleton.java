package com.jarvis.design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 10:57
 */
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private static boolean flag=true;
    private LazySingleton(){
        if(lazySingleton!=null) {
            throw new RuntimeException("单例构造器，禁止反射调用");
        }
    }
//    线程不安全
//    public synchronized static LazySingleton getInstance(){
//
//        if(lazySingleton==null){
//            lazySingleton=new LazySingleton();
//        }
//        return lazySingleton;
//    }

//    v1 同步锁 性能较差
    public synchronized static LazySingleton getInstance(){

        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

//    public static LazySingleton getInstance(){
//        synchronized (LazySingleton.class){
//            if(lazySingleton==null){
//                lazySingleton=new LazySingleton();
//            }
//            return lazySingleton;
//        }
//    }

//    public static void main(String[] args) throws Exception{
//        Class objectClass=LazySingleton.class;
//        Constructor constructor=objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        LazySingleton o1=LazySingleton.getInstance();
//
//        Field flag=o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//        LazySingleton o2=(LazySingleton)constructor.newInstance();
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1==o2);
//    }


}
