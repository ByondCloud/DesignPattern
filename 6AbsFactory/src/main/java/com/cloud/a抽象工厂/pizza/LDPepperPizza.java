package com.cloud.a抽象工厂.pizza;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 7:30
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦口味的胡椒披萨");
        System.out.println("伦敦口味的胡椒披萨-备料");
    }
}
