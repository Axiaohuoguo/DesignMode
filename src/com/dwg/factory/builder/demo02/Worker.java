package com.dwg.factory.builder.demo02;

/**
 * @ Description: 具体建造者 - 实现抽象建造者
 * @ Author: 小火锅
 * @ Date: 2020/9/13 22:19
 */
public class Worker  extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuilderA(msg);
        System.out.println("-A-");
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuilderB(msg);
        System.out.println("-B-");
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuilderC(msg);
        System.out.println("-C-");
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuilderD(msg);
        System.out.println("-D-");
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
