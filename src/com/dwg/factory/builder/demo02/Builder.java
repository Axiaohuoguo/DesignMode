package com.dwg.factory.builder.demo02;

/**
 * @ Description: 抽象的建造者
 * @ Author: 小火锅
 * @ Date: 2020/9/13 22:12
 */
public abstract class Builder {
    abstract Builder builderA(String msg); //汉堡
    abstract Builder builderB(String msg); //可乐
    abstract Builder builderC(String msg); //薯条
    abstract Builder builderD(String msg); //甜品

    //套餐
    abstract Product getProduct();
}
