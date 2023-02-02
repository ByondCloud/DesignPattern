package com.cloud.a抽象工厂.order;

import com.cloud.a抽象工厂.pizza.Pizza;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 9:22
 */

// 抽象工厂模式的抽象层
public interface AbsFactory {

    // 让子类具体实现
    public Pizza createPizza(String orderType);
}
