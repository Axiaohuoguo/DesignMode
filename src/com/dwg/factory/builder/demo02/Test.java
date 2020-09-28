package com.dwg.factory.builder.demo02;

/**
 * @ Description:
 * @ Author: 小火锅
 * @ Date: 2020/9/13 22:24
 */
public class Test {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        Product product =worker.builderA("全家桶").builderB("奶茶").getProduct();
        // 链式编程
        System.out.println(product.toString());
    }
}
