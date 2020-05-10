package com.jarvis.design.structural.decorator.v2;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:33
 */
public class AbstructDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstructDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected String getDesc() {
        return aBattercake.getDesc();
    }

    protected int cost() {
        return aBattercake.cost();
    }
}
