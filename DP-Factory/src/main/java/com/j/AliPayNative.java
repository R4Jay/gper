package com.j;

import javax.swing.plaf.synth.SynthToggleButtonUI;

/**
 *
 * 支付宝
 */
public class AliPayNative implements IPay {
    public void init() {

    }

    //同步接口
    public boolean pay(String url) {
        System.out.println("调用支付处理");
        return false;
    }


    public void PayComplete(String sheet_no, String jsonResult) {
        System.out.println("回调处理");
    }
}
