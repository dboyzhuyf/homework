package com.hundsun.rd.zhuyf.practice.pay;

public class UnionPayService implements IPayService {
    @Override
    public void pay() {
        System.out.println("你选择了银联支付！");
    }
}
