package com.cloud.b简单工厂模式.披萨店;


import com.cloud.b简单工厂模式.披萨.CheesePizza;
import com.cloud.b简单工厂模式.披萨.GreekPizza;
import com.cloud.b简单工厂模式.披萨.Pizza;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 3:52
 */
public class SimpleFactory {

    // 根据type，提供对应的披萨
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
