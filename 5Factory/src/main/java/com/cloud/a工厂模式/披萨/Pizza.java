package com.cloud.a工厂模式.披萨;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/18
 * @Time 1:04
 */
// 抽象类Pizza
public abstract class Pizza {
    protected String name;

    // 准备原材料
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }

}
