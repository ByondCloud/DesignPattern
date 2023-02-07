package com.cloud.a状态模式;

import lombok.Data;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 16:56
 */
@Data
public class RaffleActivity {

    State state = null;
    int count = 0;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    // 通过构造器设置有几个奖品，并且设置为初始状态
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    // 扣分
    public void debuctMoney() {
        state.deductMoney();
    }

    // 抽奖
    public void raffle() {
        // 如果当前的状态抽奖成功，那么就领取奖品
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

}
