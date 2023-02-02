package com.cloud.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 12:16
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
