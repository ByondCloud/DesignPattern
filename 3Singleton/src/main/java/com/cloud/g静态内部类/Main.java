package com.cloud.g静态内部类;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 9:44
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}

// 懒汉式（静态内部类）
class Singleton {

    // 1.私有化构造器
    private Singleton() {
    }

    // 2. 创建内部类
    // 当Singleton在类装载的时候，静态内部类是不会被装载的
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3. 只有调用了静态内部类中的属性，静态内部类才会被装载，类的装载是安全的，所以不用担心线程
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
