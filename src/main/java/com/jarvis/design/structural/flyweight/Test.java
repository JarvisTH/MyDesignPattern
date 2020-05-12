package com.jarvis.design.structural.flyweight;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/12 11:32
 */
public class Test {
    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);

            manager.report();

        }
    }
}
