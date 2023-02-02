package com.cloud.d深拷贝方式一;

import lombok.Data;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:57
 */
@Data

public class Sheep implements Cloneable{

    private String name;
    private int age;
    private String color;


    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
