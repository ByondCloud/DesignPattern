package com.cloud.c共享单车;

import org.omg.CORBA.TypeCodePackage.BadKind;

import java.util.HashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 12:22
 */
public class FlyweightFactory {

    // 先创建池
    private static HashMap<String, Bike> map = new HashMap<>();

    public static Bike getBike(String brand) {
        if (!map.containsKey(brand)) {
            Bike bike = new FlyweightBike(brand);
            map.put(brand, bike);
        }
        return map.get(brand);
    }
}
