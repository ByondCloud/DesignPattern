package com.cloud.a单一职责原则.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 17:06
 */
// 单一职责
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("骑车");
        vehicle.run("飞机");
    }
}


