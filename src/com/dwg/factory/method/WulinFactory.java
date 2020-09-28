package com.dwg.factory.method;

/**
 * @author 小火锅
 * @Description: wulin
 * @date 2020/8/30 17:49
 */
public class WulinFactory implements CarFactory {
    @Override
    public Car GetCar() {
        return new  Wulin();
    }
}
