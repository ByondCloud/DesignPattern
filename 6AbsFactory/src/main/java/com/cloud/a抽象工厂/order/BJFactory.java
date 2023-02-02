package com.cloud.a抽象工厂.order;

import com.cloud.a抽象工厂.pizza.BJCheesePizza;
import com.cloud.a抽象工厂.pizza.BJPepperPizza;
import com.cloud.a抽象工厂.pizza.Pizza;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 9:23
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
