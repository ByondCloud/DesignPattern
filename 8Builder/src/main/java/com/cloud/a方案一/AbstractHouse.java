package com.cloud.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:00
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
