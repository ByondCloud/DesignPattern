package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:55
 */

// 这个就是Element
// 元素是不会经常变动的，而
public abstract class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
