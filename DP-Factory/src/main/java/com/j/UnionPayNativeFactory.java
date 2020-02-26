package com.j;

public class UnionPayNativeFactory implements PayFactory {
    public void init() {
        System.out.println("初始化银联国内支付接口");
    }

    public IPay Create() {
        return null;
    }
}
