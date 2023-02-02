package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:26
 */
public class Popcorn {
    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getPopcorn() {
        return popcorn;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn is poping");
    }

}
