package com.jarvis.design.structural.decorator.v1;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:24
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected int cost() {
        return 9;
    }

    @Override
    protected String getDesc() {
        return "煎饼+鸡蛋";
    }
}
