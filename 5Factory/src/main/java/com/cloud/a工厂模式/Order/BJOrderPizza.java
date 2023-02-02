package com.cloud.a工厂模式.Order;

import com.cloud.a工厂模式.披萨.BJCheesePizza;
import com.cloud.a工厂模式.披萨.BJPepperPizza;
import com.cloud.a工厂模式.披萨.Pizza;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 7:39
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
