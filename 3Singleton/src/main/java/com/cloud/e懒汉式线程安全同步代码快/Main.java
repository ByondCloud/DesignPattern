package com.cloud.e懒汉式线程安全同步代码快;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton.getSingleton().hashCode())).start();
        }
    }
}

// 懒汉式（线程安全？，同步代码块）
class Singleton {

    // 1.私有化构造器
    private Singleton() {
    }

    // 2. 定义
    private static Singleton singleton;

    // 3. 当调用get方法时才创建实例
    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
