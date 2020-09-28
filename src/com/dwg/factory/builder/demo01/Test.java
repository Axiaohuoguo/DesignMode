package com.dwg.factory.builder.demo01;

/**
 * @ Description:
 * @ Author: 小火锅
 * @ Date: 2020/9/13 20:08
 */
public class Test {
    public static void main(String[] args) {
        //指挥
        Officer officer = new Officer();
        //具体的工人完成产品
        Product build = officer.build(new Worker());
        System.out.println(build.toString());
    }
}
