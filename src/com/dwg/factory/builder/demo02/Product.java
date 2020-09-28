package com.dwg.factory.builder.demo02;

/**
 * @ Description: 具体的产品 --套餐
 * @ Author: 小火锅
 * @ Date: 2020/9/13 22:14
 */
public class Product {

    private String BuilderA = "汉堡";
    private String BuilderB = "可乐";
    private String BuilderC = "薯条";
    private String BuilderD = "甜品";

    public String getBuilderA() {
        return BuilderA;
    }

    public void setBuilderA(String builderA) {
        BuilderA = builderA;
    }

    public String getBuilderB() {
        return BuilderB;
    }

    public void setBuilderB(String builderB) {
        BuilderB = builderB;
    }

    public String getBuilderC() {
        return BuilderC;
    }

    public void setBuilderC(String builderC) {
        BuilderC = builderC;
    }

    public String getBuilderD() {
        return BuilderD;
    }

    public void setBuilderD(String builderD) {
        BuilderD = builderD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuilderA='" + BuilderA + '\'' +
                ", BuilderB='" + BuilderB + '\'' +
                ", BuilderC='" + BuilderC + '\'' +
                ", BuilderD='" + BuilderD + '\'' +
                '}';
    }
}
