package com.cloud.h枚举;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/17
 * @Time 3:44
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        instance.sayOk();
    }
}


enum Singleton {
    INSTANCE;
    public void sayOk() {
        System.out.println("ok");
    }
}
