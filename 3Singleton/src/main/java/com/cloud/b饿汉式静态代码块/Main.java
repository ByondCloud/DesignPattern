package com.cloud.b饿汉式静态代码块;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

// 饿汉式（静态代码块）

class Singleton {

    // 1.私有化构造器
    private Singleton() { }

    // 静态代码块中创建实例
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    // 3. 公共的get方法
    public static Singleton getSingleton() {
        return singleton;
    }
}
