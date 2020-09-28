package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description: 华为路由
 * @date 2020/8/30 18:26
 */
public class HuaweiRouter implements RouterqProduct {
    @Override
    public void rOpenWifi() {
        System.out.println("华为路由打开wifi");

    }

    @Override
    public void rCloseWifi() {
        System.out.println("华为路由关闭wifi");

    }
}
