package com.dwg.factory.method;

/**
 * @author 小火锅
 * @Description: 特斯拉
 * @date 2020/8/30 17:27
 */
public class Tesla implements Car {
    @Override
    public void PrintName() {
        System.out.println("特斯拉!");
    }
}
