package com.cloud.a类适配器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 10:28
 */
public class Phone {

    // 充电
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压5v，可以充电");
        } else {
            System.out.println("无法充电");
        }
    }
}
