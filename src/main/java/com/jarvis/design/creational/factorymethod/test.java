package com.jarvis.design.creational.factorymethod;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/4 10:48
 */
public class test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new PythonVedioFactory();
        VideoFactory videoFactory1 = new JavaVideoFactory();
        VideoFactory videoFactory2 = new FrontEndVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
