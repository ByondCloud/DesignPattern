package com.cloud.b浅拷贝一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:57
 */

public class Sheep implements Cloneable{
    private int age;
    private String name;

    public Sheep(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
