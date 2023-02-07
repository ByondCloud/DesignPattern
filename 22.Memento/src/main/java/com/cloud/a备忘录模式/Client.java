package com.cloud.a备忘录模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 10:12
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1");

        // 保存状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2");

        // 恢复状态
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());



    }
}
