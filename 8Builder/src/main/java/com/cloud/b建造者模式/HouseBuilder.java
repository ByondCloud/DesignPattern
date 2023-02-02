package com.cloud.b建造者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:25
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 建造房子
    public House buildHouse() {
        return house;
    }



}
