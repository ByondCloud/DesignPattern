package com.cloud.a抽象工厂.order;

import com.cloud.a抽象工厂.pizza.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 9:23
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
