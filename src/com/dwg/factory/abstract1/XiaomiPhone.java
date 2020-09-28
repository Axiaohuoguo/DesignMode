package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description:
 * @date 2020/8/30 18:22
 */
public class XiaomiPhone implements PhoneProduct{
    @Override
    public void pStart() {
        System.out.println("小米开机");
    }

    @Override
    public void pShutdown() {
        System.out.println("小米关机");
    }

    @Override
    public void pCall() {
        System.out.println("小米打电话");
    }

    @Override
    public void pSendSMS() {
        System.out.println("小米发短信");
    }

}
