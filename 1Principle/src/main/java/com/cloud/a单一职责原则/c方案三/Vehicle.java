package com.cloud.a单一职责原则.c方案三;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 17:07
 */
public class Vehicle {
    public void AirRun(String vehicle) {
        System.out.println("有一个交通工具 " + vehicle + " 在天上飞");
    }

    public void RoadRun(String vehicle) {
        System.out.println("有一个交通工具 " + vehicle + " 在地上跑");
    }

    public void SwimRun(String vehicle) {
        System.out.println("有一个交通工具 " + vehicle + " 在水里游");
    }

}
