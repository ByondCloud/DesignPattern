package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:41
 */
public class TheaterLight {

    private static TheaterLight theaterLight = new TheaterLight();
    public static TheaterLight getTheaterLight() {
        return theaterLight;
    }

    public void on() {
        System.out.println("theaterLight on");
    }

    public void off() {
        System.out.println("theaterLight off");
    }

    public void up() {
        System.out.println("theaterLight up");
    }

    public void down() {
        System.out.println("theaterLight down");
    }

}
