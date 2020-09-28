package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description: 小米路由
 * @date 2020/8/30 18:25
 */
public class XiaomiRouter implements RouterqProduct {
    @Override
    public void rOpenWifi() {
        System.out.println("小米路由打开wifi");
    }

    @Override
    public void rCloseWifi() {
        System.out.println("小米路由关闭wifi");
    }
}
