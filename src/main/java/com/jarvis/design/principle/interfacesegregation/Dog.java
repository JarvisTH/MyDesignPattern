package com.jarvis.design.principle.interfacesegregation;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 17:26
 */
//v1
//public class Dog implements IAnimalAction {
//
//    public void eat() {
//
//    }
//
//    public void fly() {
//
//    }
//
//    public void swim() {
//
//    }
//}

public class Dog implements IEatAnimalAction, ISwimAnimalAction {

    public void eat() {

    }

    public void swim() {

    }
}
