package com.cloud.a状态模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 17:09
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("第" + i + "次抽奖");
            raffleActivity.debuctMoney();
            raffleActivity.raffle();
        }
    }
}
