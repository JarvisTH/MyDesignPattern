package com.jarvis.design.creational.prototype.clone;

import java.util.Date;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:20
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Date birthday = new Date(0L);
        Pig pig = new Pig("佩奇", birthday);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);

        pig.getBirthday().setTime(66666666666L);
        System.out.println(pig);
        System.out.println(pig1);

//        原型模式破坏单例
//        HungrySingleton hungrySingleton=HungrySingleton.getInstance();
//        Method method=hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton=(HungrySingleton)method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);
    }
}
