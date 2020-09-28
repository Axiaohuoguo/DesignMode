package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description:
 * @date 2020/8/30 18:23
 */
public class HuaweiPhone implements PhoneProduct {

    @Override
    public void pStart() {
        System.out.println("华为开机");
    }

    @Override
    public void pShutdown() {
        System.out.println("华为关机");
    }

    @Override
    public void pCall() {
        System.out.println("华为打电话");
    }

    @Override
    public void pSendSMS() {
        System.out.println("华为发短信");
    }
}
