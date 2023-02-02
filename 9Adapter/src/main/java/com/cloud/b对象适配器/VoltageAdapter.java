package com.cloud.b对象适配器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 10:18
 */
// 适配器类
public class VoltageAdapter implements Voltage5V {

    // 聚合关系
    private Voltage220V voltage220V;

    // 通过构造器传入需要适配的类
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
