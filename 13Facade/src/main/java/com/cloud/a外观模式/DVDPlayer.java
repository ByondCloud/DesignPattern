package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:12
 */
public class DVDPlayer {

    // 使用单例模式，饿汉式
    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd is playing");
    }

    public void pause() {
        System.out.println("dvd pause");
    }

    // ...

}
