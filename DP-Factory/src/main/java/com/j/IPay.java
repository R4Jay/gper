package com.j;

/**
 * by sunjx,基础接口
 *
 */
public interface IPay {

    //初始化
    void init();

    //同步支付接口
    boolean pay(String url);

    //异步回调接口
    void PayComplete(String sheet_no,String jsonResult);
}
