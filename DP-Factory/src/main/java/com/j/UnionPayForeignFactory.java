package com.j;

public class UnionPayForeignFactory  implements PayFactory{
    public void init() {
        System.out.println("初始化银联国外支付接口");
    }

    public IPay Create() {
        return null;
    }
}
