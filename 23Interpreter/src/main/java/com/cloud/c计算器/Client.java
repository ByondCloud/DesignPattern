package com.cloud.c计算器;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 7:33
 */
public class Client {
    public static void main(String[] args) {
        Value value1 = new Value(10);
        Value value2 = new Value(5);
        Value value3 = new Value(2);
        Add add = new Add(new Sub(value2, value3), value1);
        System.out.println(add.interpreter());
    }
}
