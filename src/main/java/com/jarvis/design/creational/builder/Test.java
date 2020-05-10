package com.jarvis.design.creational.builder;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 9:54
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseActualBuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course=coach.makeCourse("Java","Java PPT","Java Video","Java Article","Java QA");
        System.out.println(course);
    }
}
