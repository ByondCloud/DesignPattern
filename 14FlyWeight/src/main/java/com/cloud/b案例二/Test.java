package com.cloud.b案例二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 12:09
 */
public class Test {
    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
