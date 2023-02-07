package com.cloud.a状态模式;

import java.util.Random;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 15:50
 */
// 可以抽奖的状态
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍后");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("没抽中");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
