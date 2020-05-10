package com.jarvis.design.structural.decorator.v2;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:37
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake=new Battercake();
        aBattercake=new EggDecorator(aBattercake);
        aBattercake=new EggDecorator(aBattercake);
        aBattercake=new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+" 价格："+aBattercake.cost());

    }
}
