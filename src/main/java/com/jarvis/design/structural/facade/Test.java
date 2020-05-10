package com.jarvis.design.structural.facade;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 20:54
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift=new PointGift("衣服");
        GiftExchangeService giftExchangeService=new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointGift);
    }
}
