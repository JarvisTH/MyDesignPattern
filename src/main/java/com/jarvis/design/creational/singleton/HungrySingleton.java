package com.jarvis.design.creational.singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 14:23
 */
public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton hungrySingleton=new HungrySingleton();

    private HungrySingleton(){
        if(hungrySingleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
