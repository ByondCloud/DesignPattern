package com.cloud.a策略模式;

import com.cloud.a策略模式.fly.BadFlayBehavior;
import com.cloud.a策略模式.fly.NoFlyBehavior;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 19:06
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭子");
    }

    public PekingDuck() {
        flyBehavior = new BadFlayBehavior();
    }
}
