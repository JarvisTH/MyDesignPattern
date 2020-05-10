package com.jarvis.design.principle.singleREsponsbility;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 15:08
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用用脚");

        }else {
            System.out.println(birdName+"用翅膀飞");
        }

        // +企鹅 +其他动物
    }
}
