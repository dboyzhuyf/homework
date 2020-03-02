package com.hundsun.rd.zhuyf.practice.pay;

public class PayServiceFactoryTest {

    public static void main(String[] args) {
        PayServiceFactory factory = new PayServiceFactory();
        IPayService zhifubbao = factory.getPayService(ZhifubaoPayService.class);
        zhifubbao.pay();

        IPayService weixin = factory.getPayService(WeixinPayService.class);
        weixin.pay();
    }
}
