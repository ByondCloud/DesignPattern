package com.cloud.f双重检查;

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

// 懒汉式（线程安全，双重检查）
class Singleton {

    // 1.私有化构造器
    private Singleton() {
    }

    // 2. 定义    volatile可以理解为轻量级的synchronized
    private static volatile Singleton singleton;

    // 3. 当调用get方法时才创建实例
    public static Singleton getSingleton() {
        // 双重检查，第一遍就算多线程进来也没有关系，下面的代码还是会单线程执行
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
