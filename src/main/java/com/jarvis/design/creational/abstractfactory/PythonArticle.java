package com.jarvis.design.creational.abstractfactory;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 9:15
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("Python article");
    }
}
