package com.jarvis.design.creational.singleton;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 14:16
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
