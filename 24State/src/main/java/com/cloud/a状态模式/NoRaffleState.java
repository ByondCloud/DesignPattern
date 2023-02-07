package com.cloud.a状态模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 15:43
 */
// 不能抽奖的状态
public class NoRaffleState implements State{

    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    // 当前状态可以扣积分，扣除后，将状态改为可抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣积分");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才能抽奖");
        return false;
    }

    // 当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没抽奖不能发奖品");
    }
}
