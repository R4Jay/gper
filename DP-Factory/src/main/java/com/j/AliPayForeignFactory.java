package com.j;

public class AliPayForeignFactory implements PayFactory {
    public void init() {
        System.out.println("初始化Ali支付国外相关参数");
    }

    public IPay Create() {
        return new AliPayForeign();
    }
}
