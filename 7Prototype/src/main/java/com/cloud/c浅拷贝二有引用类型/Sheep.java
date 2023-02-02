package com.cloud.c浅拷贝二有引用类型;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:57
 */

public class Sheep implements Cloneable{
    private int age;
    public Sheep friend;

    public Sheep(int age) {
        this.age = age;
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
