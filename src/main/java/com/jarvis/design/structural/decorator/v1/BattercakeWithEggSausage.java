package com.jarvis.design.structural.decorator.v1;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:26
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected int cost() {
        return 12;
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "+香肠";
    }
}
