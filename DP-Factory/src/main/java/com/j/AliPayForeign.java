package com.j;

public class AliPayForeign implements IPay {
    public void init() {

    }

    public boolean pay(String url) {

        System.out.println("Ali国内支付网管支付处理:"+ url );
        return false;
    }

    public void PayComplete(String sheet_no, String jsonResult) {

    }
}
