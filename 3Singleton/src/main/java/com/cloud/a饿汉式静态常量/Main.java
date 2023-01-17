package com.cloud.a饿汉式静态常量;

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

// 饿汉式（静态常量）

class Singleton {

    // 1.私有化构造器
    private Singleton() { }

    // 2. 内部创建实例对象
    private static final Singleton singleton = new Singleton();

    // 3. 公共的get方法
    public static Singleton getSingleton() {
        return singleton;
    }

}
