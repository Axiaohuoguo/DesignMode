package com.dwg.factory.builder.demo01;

/**
 * @ Description: 抽象的建造者类
 * @ Author: 小火锅
 * @ Date: 2020/9/13 19:38
 */
public abstract class Builder {
    abstract void builderA();//步骤1 - 地基
    abstract void builderB();//步骤2 - 钢筋
    abstract void builderC();//步骤3 - 铺电线
    abstract void builderD();//步骤4 - 粉刷

    //得到具体的产品
    abstract Product getProduct();

}
