package com.cloud.c静态工厂模式.披萨;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 1:31
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨 准备材料");
    }
}
