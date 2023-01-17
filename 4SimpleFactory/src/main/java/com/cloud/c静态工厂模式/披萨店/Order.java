package com.cloud.c静态工厂模式.披萨店;

import com.cloud.c静态工厂模式.披萨.Pizza;

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


    Pizza pizza = null;

    public void setSimpleFactory() {
        String orderType = "";

        do {
            orderType = gettype();
            pizza = SimpleFactory.createPizza(orderType);

            // 输出披萨的信息
            if (pizza != null) {
                System.out.println("订购成功");
                pizza.prepare();
            }
        }while (true);
    }

    // 构造器
    public Order() {
        this.setSimpleFactory();
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
