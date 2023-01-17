package com.cloud.g合成复用原则.a方案一依赖;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 3:56
 */
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.talk(new A());
    }
}

class A {
    public void say() {
        System.out.println("hello");
    }
}

class B {

    public void talk(A a) {
        a.say();
    }
}
