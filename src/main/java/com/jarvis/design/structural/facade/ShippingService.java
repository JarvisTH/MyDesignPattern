package com.jarvis.design.structural.facade;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 20:48
 */
public class ShippingService {

    public String shipGift(PointGift pointGift) {
        // 物流系统对接
        System.out.println(pointGift.getName() + "进入物流系统");
        // 订单号
        return "666";
    }
}
