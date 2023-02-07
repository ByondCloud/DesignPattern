package com.cloud.a策略模式;

import com.cloud.a策略模式.fly.NoFlyBehavior;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 19:09
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}
