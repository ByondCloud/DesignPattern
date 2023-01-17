package com.cloud.Test;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new MyThead().start();
        }

    }
}

// 懒汉式（线程安全，同步方法）
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

class MyThead extends Thread {
    @Override
    public void run() {
        System.out.println(Singleton.getSingleton().hashCode());
    }
}
