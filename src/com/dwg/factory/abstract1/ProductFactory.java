package com.dwg.factory.abstract1;

/**
 * @ author 小火锅
 * @ Description: 抽象产品工厂
 * @ date 2020/8/30 18:28
 */
public interface ProductFactory  {
    //生产手机
    PhoneProduct phoneProduct();
    //生产路由器
    RouterqProduct routerqProduct();
}
