package com.jarvis.design.structural.decorator.v1;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/10 19:27
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 价格：" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 价格：" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 价格：" + battercakeWithEggSausage.cost());
    }
}
