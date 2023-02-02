package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:28
 */
public class Projector {

    private static Projector projector = new Projector();

    public static Projector getProjector() {
        return projector;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector is focus");
    }

}
