package com.dwg.factory.method;

import com.dwg.factory.simple.CarFactory;

/**
 * @author 小火锅
 * @Description: 消费者
 * @date 2020/8/30 17:29
 */
public class consumer {
    public static void main(String[] args) {
        Car car  = new WulinFactory().GetCar();
        Car car1 = new TeslaFactory().GetCar();
        Car car2  = new MobaidancFactory().GetCar();
        car1.PrintName();
        car.PrintName();
        car2.PrintName();
    }
}
