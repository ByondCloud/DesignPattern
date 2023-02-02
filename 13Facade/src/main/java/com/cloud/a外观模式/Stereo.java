package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:37
 */
public class Stereo {
    private static Stereo stereo = new Stereo();

    public static Stereo getStereo() {
        return stereo;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void up() {
        System.out.println("stereo up");
    }

    public void down() {
        System.out.println("stereo down");
    }


}
