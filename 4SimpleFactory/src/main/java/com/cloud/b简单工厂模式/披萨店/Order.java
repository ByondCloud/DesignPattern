package com.cloud.b简单工厂模式.披萨店;

import com.cloud.b简单工厂模式.披萨.CheesePizza;
import com.cloud.b简单工厂模式.披萨.GreekPizza;
import com.cloud.b简单工厂模式.披萨.Pizza;
import com.sun.org.apache.xpath.internal.operations.Or;

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


    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出披萨的信息
            if (pizza != null) {
                System.out.println("订购成功");
                pizza.prepare();
            }
        }while (true);
    }

    // 构造器
    public Order(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
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
