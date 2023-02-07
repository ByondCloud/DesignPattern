package com.cloud.a备忘录模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 9:38
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
