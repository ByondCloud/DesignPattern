package com.cloud.a工厂模式.披萨;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 7:30
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京口味的奶酪披萨");
        System.out.println("北京口味的奶酪披萨-备料");
    }
}
