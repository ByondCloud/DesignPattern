package com.cloud.b建造者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:41
 */
public class Client {
    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println(house);
    }
}
