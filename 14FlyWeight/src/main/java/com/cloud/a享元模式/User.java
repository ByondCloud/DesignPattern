package com.cloud.a享元模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 11:53
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
