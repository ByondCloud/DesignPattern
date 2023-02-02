package com.cloud.a装饰者模式;

import lombok.Data;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 14:14
 */
@Data
public abstract class Drink {

    public String des; // 对咖啡的描述

    private float price = 0.0f;

    // 计算费用的抽象方法
    public abstract float cost();

}
