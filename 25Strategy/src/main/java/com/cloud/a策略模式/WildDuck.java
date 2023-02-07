package com.cloud.a策略模式;

import com.cloud.a策略模式.fly.GoodFlyBehavior;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 19:04
 */
public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println("野鸭");
    }

    // 初始化的时候告诉类，野鸭飞行技术高超
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }
}
