package com.cloud.g合成复用原则.b方案二聚合;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 3:56
 */
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.setA(new A());
        b.talk();
    }
}

class A {
    public void say() {
        System.out.println("hello");
    }
}

class B {
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void talk() {
        a.say();
    }
}
