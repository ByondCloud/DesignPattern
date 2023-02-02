package com.cloud.b对象适配器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 10:16
 */
// 需要适配的类
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压" + src + "伏");
        return src;
    }
}
