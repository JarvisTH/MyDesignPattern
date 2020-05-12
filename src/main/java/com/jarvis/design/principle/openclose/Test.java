package com.jarvis.design.principle.openclose;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 14:29
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96, "Java", 348d);
        System.out.println(javaCourse.getId() + " " +
                javaCourse.getName() + " " +
                javaCourse.getPrice() + " " +
                ((JavaDiscountCourse) javaCourse).getOriginPrice());
    }
}
