package com.cloud.a策略模式;


import com.cloud.a策略模式.fly.NoFlyBehavior;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 19:07
 */
public class ToyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }
}
