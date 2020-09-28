package com.dwg.factory.builder.demo01;

/**
 * @ Description: 具体的建造者 ： eg工人
 * @ Author: 小火锅
 * @ Date: 2020/9/13 19:51
 */
public class Worker extends Builder {


    private Product product;

    //构造器- 工人创建产品
    public Worker() {
        product = new Product();
    }

    @Override
    void builderA() {
        product.setBuilderA("A - 地基");
        System.out.println("A - 地基");
    }

    @Override
    void builderB() {
        product.setBuilderA("B - 钢筋");
        System.out.println("B - 钢筋");
    }

    @Override
    void builderC() {
        product.setBuilderA("C - 铺电线");
        System.out.println("C - 铺电线");
    }

    @Override
    void builderD() {
        product.setBuilderA("D - 粉刷");
        System.out.println("D - 粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
