package com.dwg.factory.simple;

/**
 * @author 小火锅
 * @Description: 消费者
 * @date 2020/8/30 17:29
 */
public class consumer {
    public static void main(String[] args) {
//        // 1初始操作 接口实现
//        Car car = new Wulin();
//        Car car1 = new Tesla();
//        car.PrintName();
//        car1.PrintName();

        // 2使用工厂
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("O");
        if (car!=null)
        {
            car.PrintName();
        }

    }
}
