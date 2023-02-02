package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:31
 */
public class Screen {
    private static Screen screen = new Screen();
    public static Screen getScreen() {
        return screen;
    }

    public void up() {
        System.out.println("projector up");
    }

    public void down() {
        System.out.println("projector down");
    }


}
