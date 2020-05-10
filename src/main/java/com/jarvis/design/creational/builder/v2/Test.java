package com.jarvis.design.creational.builder.v2;

import java.util.Set;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 10:09
 */
public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().buildCourseName("Java")
                .buildCoursePPT("Java PPT")
                .buildCourseVideo("Java Video")
                .buildCourseArticle("Java article")
                .buildCourseQA("Java QA")
                .build();
        System.out.println(course);

        new StringBuilder().append("1").append("2").append("3");
    }
}