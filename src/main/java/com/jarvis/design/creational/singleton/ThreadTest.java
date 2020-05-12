package com.jarvis.design.creational.singleton;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 11:00
 */
public class ThreadTest implements Runnable {
    public void run() {
//        LazySingleton lazySingleton=LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+ lazySingleton.toString());

        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + instance.toString());
    }
}
