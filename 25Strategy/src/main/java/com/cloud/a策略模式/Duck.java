package com.cloud.a策略模式;

import com.cloud.a策略模式.fly.FlyBehavior;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 18:50
 */
public abstract class Duck {

    // 属性， 策略接口
    FlyBehavior flyBehavior;

    public abstract void display(); // 显示鸭子信息

    public void quack() {
        System.out.println("鸭子叫");
    }

    public void swim() {
        System.out.println("鸭子游");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
