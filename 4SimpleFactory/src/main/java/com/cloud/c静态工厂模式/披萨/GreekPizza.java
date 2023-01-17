package com.cloud.c静态工厂模式.披萨;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 2:21
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨 准备原材料");
    }
}
