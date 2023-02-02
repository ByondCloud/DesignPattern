package com.cloud.a工厂模式.Order;

import com.cloud.a工厂模式.披萨.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 7:44
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
