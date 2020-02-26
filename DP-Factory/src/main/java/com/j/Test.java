package com.j;

public class Test {
    public static void main(String[] args) {
        PayFactory payFactory = new AliPayForeignFactory();
        payFactory.Create().pay("https://alipay.com?XXdfsafds");
    }
}
