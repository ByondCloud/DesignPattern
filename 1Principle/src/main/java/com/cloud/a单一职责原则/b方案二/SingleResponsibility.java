package com.cloud.a单一职责原则.b方案二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 17:06
 */
// 单一职责
public class SingleResponsibility {
    public static void main(String[] args) {

        AirVehicle airVehicle = new AirVehicle();
        RoadVehicle roadVehicle = new RoadVehicle();
        SwimVehicle swimVehicle = new SwimVehicle();
        airVehicle.run("飞机");
        roadVehicle.run("摩托");
        swimVehicle.run("船");

    }
}


