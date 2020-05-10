package com.jarvis.design.creational.factorymethod;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/4 11:38
 */
public class FrontEndVideo extends Video {
    @Override
    public void produce() {
        System.out.println("Front Video");
    }
}
