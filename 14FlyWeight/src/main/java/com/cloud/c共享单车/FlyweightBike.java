package com.cloud.c共享单车;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 12:18
 */
public class FlyweightBike implements Bike {

    // 不同单车的品牌，这个就是做为单车的内部状态
    private String brand;

    public FlyweightBike(String brand) {
        this.brand = brand;
    }

    @Override
    public void ride(User user) {
        System.out.println(user.getName() + "骑上了" + brand + "家的共享单车");
    }
}
