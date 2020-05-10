package com.jarvis.design.creational.abstractfactory;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 9:20
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCoursseFactory();
        Video video=courseFactory.getVideo();
        Article article=courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
