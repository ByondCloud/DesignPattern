package com.cloud.a状态模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 16:21
 */
// 发放奖品
public class DispenseState implements State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜你中奖了");
            // 改变为不能抽奖的状态
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("奖品发完了");
            // 改变为不能抽奖的状态
            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }

    }
}
