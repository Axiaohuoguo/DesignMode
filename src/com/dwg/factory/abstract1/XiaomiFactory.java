package com.dwg.factory.abstract1;

/**
 * @author 小火锅
 * @Description:
 * @date 2020/8/30 18:31
 */
public class XiaomiFactory implements ProductFactory {

    @Override
    public PhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterqProduct routerqProduct() {
        return new XiaomiRouter();
    }
}
