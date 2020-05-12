package com.jarvis.design.principle.openclose;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 14:35
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
}
