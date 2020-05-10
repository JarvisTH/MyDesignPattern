package com.jarvis.design.creational.abstractfactory;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 9:15
 */
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
