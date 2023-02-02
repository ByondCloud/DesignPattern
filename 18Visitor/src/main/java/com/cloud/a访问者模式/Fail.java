package com.cloud.a访问者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:59
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人-Fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人-Fail");
    }
}
