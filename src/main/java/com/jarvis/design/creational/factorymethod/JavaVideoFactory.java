package com.jarvis.design.creational.factorymethod;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/4 11:34
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
