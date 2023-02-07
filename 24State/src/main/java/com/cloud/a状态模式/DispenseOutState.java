package com.cloud.a状态模式;


import java.util.Random;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 16:53
 */
// 奖品发放完毕
public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发完了");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发完了");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了");
    }
}
