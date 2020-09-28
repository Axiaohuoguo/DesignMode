package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description: 手机接口
 * @date 2020/8/30 18:16
 */
public interface PhoneProduct {
    void pStart(); //开机
    void pShutdown(); //关机
    void pCall();//打电话
    void pSendSMS();//发短信
}
