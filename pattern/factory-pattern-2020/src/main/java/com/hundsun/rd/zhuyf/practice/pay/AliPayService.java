package com.hundsun.rd.zhuyf.practice.pay;

public class AliPayService implements IPayService {
    @Override
    public void pay() {
        System.out.println("你选择了支付宝支付！");
    }
}
