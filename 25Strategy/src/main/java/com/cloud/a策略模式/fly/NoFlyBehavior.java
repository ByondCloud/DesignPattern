package com.cloud.a策略模式.fly;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 19:00
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
