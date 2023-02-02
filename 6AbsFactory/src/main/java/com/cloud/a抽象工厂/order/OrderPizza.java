package com.cloud.a抽象工厂.order;

import com.cloud.a抽象工厂.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 9:25
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType ="";
        this.absFactory = absFactory;
        do {
            orderType = gettype();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
            } else {
                System.out.println("失败");
                break;
            }
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
