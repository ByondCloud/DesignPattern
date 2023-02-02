package com.cloud.a模板方法模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/30
 * @Time 0:53
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆");
    }
}
