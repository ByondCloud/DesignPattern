package com.cloud.a工厂模式.Order;


import com.cloud.a工厂模式.披萨.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 2:23
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            pizza = createPizza(orderType);
            pizza.prepare();
        } while (true);
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
