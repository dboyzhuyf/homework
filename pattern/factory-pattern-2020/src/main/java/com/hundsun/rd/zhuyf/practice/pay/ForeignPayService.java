package com.hundsun.rd.zhuyf.practice.pay;

public class ForeignPayService implements IPayService {
    @Override
    public void pay() {
        System.out.println("你选择了跨境支付！");
    }
}
