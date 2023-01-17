package com.cloud.a原有代码.披萨店;

import com.cloud.a原有代码.披萨.CheesePizza;
import com.cloud.a原有代码.披萨.GreekPizza;
import com.cloud.a原有代码.披萨.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 2:23
 */
public class Order {

    public Order() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    // 动态获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza");
            String s = strin.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
