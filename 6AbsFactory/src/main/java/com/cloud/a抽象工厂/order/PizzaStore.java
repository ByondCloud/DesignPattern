package com.cloud.a抽象工厂.order;

import java.util.Calendar;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 9:31
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());


        Calendar.getInstance();
    }
}
