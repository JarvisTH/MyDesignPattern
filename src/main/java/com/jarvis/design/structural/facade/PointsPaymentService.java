package com.jarvis.design.structural.facade;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 20:47
 */
public class PointsPaymentService {

    public boolean pay(PointGift pointGift){
        // 扣减积分
        System.out.println("支付"+pointGift.getName()+" 积分支付成功");
        return true;
    }
}
