package com.cloud.c建造者模式2;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:25
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract House buildBasic();
    public abstract House buildWalls();
    public abstract House roofed();

    // 建造房子
    public House buildHouse() {
        return house;
    }

}
