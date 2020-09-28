package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description: 华为工厂
 * @date 2020/8/30 18:33
 */
public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterqProduct routerqProduct() {
        return new HuaweiRouter();
    }
}
