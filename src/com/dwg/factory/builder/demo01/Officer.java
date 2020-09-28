package com.dwg.factory.builder.demo01;

/**
 * @ Description: 指挥者 -- 负责创建一个工程工程如何创建由他决定
 * @ Author: 小火锅
 * @ Date: 2020/9/13 20:00
 */
public class Officer {
    //指挥工人按照顺序造房子
    public Product build(Builder builder)
    {
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
