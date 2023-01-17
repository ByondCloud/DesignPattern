package com.cloud.b接口隔离原则.方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/11
 * @Time 18:34
 */
public class B implements Interface{
    @Override
    public void operation1() {
        System.out.println("实现了方法1");
    }

    @Override
    public void operation2() {
        System.out.println("实现了方法2");
    }

    @Override
    public void operation3() {
        System.out.println("实现了方法3");
    }

    @Override
    public void operation4() {
        System.out.println("实现了方法4");
    }

    @Override
    public void operation5() {
        System.out.println("实现了方法5");
    }
}
