package com.cloud.a模板方法模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/30
 * @Time 1:44
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        // 这句话不会执行的
        System.out.println("啥也不加");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
