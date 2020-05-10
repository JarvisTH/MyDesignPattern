package com.jarvis.design.structural.facade;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 20:51
 */
public class GiftExchangeService {
    private QualifyService qualifyService=new QualifyService();
    private PointsPaymentService pointsPaymentService=new PointsPaymentService();
    private ShippingService shippingService=new ShippingService();

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvailable(pointGift)){
            // 资格校验通过
            if(pointsPaymentService.pay(pointGift)){
                //如果支付积分成功
                String shippingOrderNo=shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功，订单号是："+shippingOrderNo);
            }
        }
    }
}
