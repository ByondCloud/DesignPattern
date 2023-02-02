package com.cloud.c建造者模式2;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:32
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 方式一：构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 方式二：set方法
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造流程，交给指挥者去处理
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
