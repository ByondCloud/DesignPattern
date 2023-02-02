package com.cloud.a模板方法模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/30
 * @Time 0:56
 */
public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
