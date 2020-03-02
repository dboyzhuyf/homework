package com.hundsun.rd.zhuyf.practice.pay;

public class PayServiceFactoryTest {

    public static void main(String[] args) {
        PayServiceFactory factory = new PayServiceFactory();
        IPayService alipay = factory.getPayService(AliPayService.class);
        alipay.pay();

        IPayService wechatpay = factory.getPayService(WeChatPayService.class);
        wechatpay.pay();

        IPayService unionpay = factory.getPayService(UnionPayService.class);
        unionpay.pay();

        IPayService foreignpay = factory.getPayService(ForeignPayService.class);
        foreignpay.pay();
    }
}
