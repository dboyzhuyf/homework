package com.hundsun.rd.zhuyf.practice.pay;

public class WeChatPayService implements IPayService {
    @Override
    public void pay() {
        System.out.println("你选择了微信支付！");
    }
}
