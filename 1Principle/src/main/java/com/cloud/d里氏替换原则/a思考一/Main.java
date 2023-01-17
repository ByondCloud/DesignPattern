package com.cloud.d里氏替换原则.a思考一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/15
 * @Time 16:28
 */
public class Main {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.func1(20, 10));
    }

}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

}
