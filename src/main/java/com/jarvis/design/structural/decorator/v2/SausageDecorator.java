package com.jarvis.design.structural.decorator.v2;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:35
 */
public class SausageDecorator extends AbstructDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " +香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
