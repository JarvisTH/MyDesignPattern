package com.jarvis.design.creational.abstractfactory;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 9:11
 */
public class JavaCoursseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
