package com.cloud.a单一职责原则.c方案三;

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
        vehicle.AirRun("飞机");
        vehicle.RoadRun("摩托");
        vehicle.SwimRun("船");
    }
}




