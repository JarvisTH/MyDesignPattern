package com.jarvis.design.creational.prototype.abstructprototype;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:16
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
