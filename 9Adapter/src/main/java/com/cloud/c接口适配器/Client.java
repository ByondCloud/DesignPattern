package com.cloud.c接口适配器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 11:29
 */
public class Client {
    public static void main(String[] args) {
        new AbsAdapter() {
            // 我们只需要去覆盖需要使用的方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        }.m1();
    }
}
