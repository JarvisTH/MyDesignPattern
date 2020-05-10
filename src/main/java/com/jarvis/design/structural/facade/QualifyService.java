package com.jarvis.design.structural.facade;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 20:46
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+" 积分资格通过，库存通过");
        return true;
    }
}
