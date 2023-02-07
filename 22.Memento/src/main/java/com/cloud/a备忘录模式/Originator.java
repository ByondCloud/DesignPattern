package com.cloud.a备忘录模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 9:34
 */
// 原始对象
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法，保存状态对象 Memento对象

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    // 通过备忘录对象恢复状态
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
