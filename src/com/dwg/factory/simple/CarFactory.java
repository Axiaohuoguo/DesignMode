package com.dwg.factory.simple;

/**
 * @author 小火锅
 * @Description: 静态工厂
 * @date 2020/8/30 17:32
 * @弊端 --没有满足开闭原则
 */

public class CarFactory {
    public static Car getCar(String car)
    {
        if (car.equals("五菱"))
        {
            return new Wulin();
        }
        else if (car.equals("特斯拉"))
        {
            return new Tesla();
        }
        else return null;
    }
}
