package com.cloud.b接口隔离原则.方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:53
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        c.depend1(b);
    }
}
