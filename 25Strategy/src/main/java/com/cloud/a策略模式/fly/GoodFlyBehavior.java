package com.cloud.a策略模式.fly;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 18:57
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
