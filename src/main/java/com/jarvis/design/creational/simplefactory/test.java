package com.jarvis.design.creational.simplefactory;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/4 10:48
 */
public class test {
    public static void main(String[] args) {
//        v1
//        Video video=new JavaVideo();
//        video.produce();

//        v2
//        VideoFactory videoFactory=new VideoFactory();
//        Video video=videoFactory.getVideo("java");
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
