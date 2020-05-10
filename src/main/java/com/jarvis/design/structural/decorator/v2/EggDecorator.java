package com.jarvis.design.structural.decorator.v2;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:34
 */
public class EggDecorator extends AbstructDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " +鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
