package com.cloud.a访问者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:55
 */
public abstract class Person {
    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
