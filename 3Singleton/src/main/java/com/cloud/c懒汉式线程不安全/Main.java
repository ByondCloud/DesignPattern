package com.cloud.c懒汉式线程不安全;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {

    }
}

// 懒汉式（线程不安全）
class Singleton {

    // 1.私有化构造器
    private Singleton() { }

    // 2. 定义
    private static Singleton singleton;

    // 3. 当调用get方法时才创建实例
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
