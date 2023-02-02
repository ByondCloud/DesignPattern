package com.cloud.a类适配器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 10:18
 */
// 适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        // 获取220v的电压
        int srcV = output220V();
        int dstV = srcV / 44;

        return dstV;
    }
}
