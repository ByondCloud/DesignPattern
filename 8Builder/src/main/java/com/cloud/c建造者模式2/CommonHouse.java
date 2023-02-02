package com.cloud.c建造者模式2;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:30
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public House buildBasic() {
        house.setBasic("普通楼房打地基");
        return house;
    }

    @Override
    public House buildWalls() {
        house.setWall("普通楼房砌墙");
        return house;
    }

    @Override
    public House roofed() {
        house.setRoofed("普通楼房封顶");
        return house;
    }
}
