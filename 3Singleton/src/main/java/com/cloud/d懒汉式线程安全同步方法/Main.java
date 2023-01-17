package com.cloud.d懒汉式线程安全同步方法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
    }
}

// 懒汉式（线程安全，同步方法）
class Singleton {

    // 1.私有化构造器
    private Singleton() { }

    // 2. 定义
    private static Singleton singleton;

    // 3. 当调用get方法时才创建实例
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
