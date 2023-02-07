package com.cloud.a状态模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 15:32
 */

// 状态接口
public interface State {

    // 扣积分
    public abstract void deductMoney();

    // 是否中奖
    public abstract boolean raffle();

    // 发放奖品
    public abstract void dispensePrize();

}
