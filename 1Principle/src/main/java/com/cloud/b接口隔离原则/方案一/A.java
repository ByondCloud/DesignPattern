package com.cloud.b接口隔离原则.方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:49
 */
public class A {
    public void depend(Interface i) {
        i.operation1();
    }

    public void depend2(Interface i) {
        i.operation2();
    }

    public void depend3(Interface i) {
        i.operation3();
    }

}
