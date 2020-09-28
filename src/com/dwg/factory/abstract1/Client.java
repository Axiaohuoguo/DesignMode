package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description: 客户端
 * @date 2020/8/30 18:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====小米系列=====");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct xiaomphoneProduct1 = xiaomiFactory.phoneProduct();
        RouterqProduct xiaomirouterqProduct1 = xiaomiFactory.routerqProduct();
        xiaomphoneProduct1.pCall();
        xiaomphoneProduct1.pSendSMS();
        xiaomirouterqProduct1.rOpenWifi();
        xiaomirouterqProduct1.rCloseWifi();

        System.out.println("=====华为系列=====");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        PhoneProduct huaweiphoneProduct1 = huaweiFactory.phoneProduct();
        RouterqProduct huaweirouterqProduct1 = huaweiFactory.routerqProduct();
        huaweiphoneProduct1.pStart();
        huaweiphoneProduct1.pSendSMS();
        huaweirouterqProduct1.rOpenWifi();
        huaweirouterqProduct1.rCloseWifi();

    }
}
