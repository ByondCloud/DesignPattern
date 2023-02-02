package com.cloud.b建造者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:30
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
    }
}
