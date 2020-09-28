package com.dwg.factory.method;

/**
 * @author 小火锅
 * @Description:
 * @date 2020/8/30 17:56
 */
public class MobaidancFactory implements CarFactory{
    @Override
    public Car GetCar() {
        return new Mobaidanc();
    }
}
