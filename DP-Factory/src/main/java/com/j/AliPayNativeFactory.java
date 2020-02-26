package com.j;

public class AliPayNativeFactory implements PayFactory {
    public void init() {
        System.out.println("初始化支付宝国内支付相关");
    }

    public IPay Create() {
        return new AliPayNative();
    }
}
