package com.cloud.c共享单车;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 12:29
 */
public class Test {
    public static void main(String[] args) {
        Bike orange = FlyweightFactory.getBike("青桔");
        orange.ride(new User("小明"));
    }
}

