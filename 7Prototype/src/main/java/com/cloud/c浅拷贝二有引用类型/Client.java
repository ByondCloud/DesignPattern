package com.cloud.c浅拷贝二有引用类型;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:59
 */

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1);
        sheep.friend = new Sheep(2);
        Sheep clone = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();

        System.out.println(clone + " | " + clone.friend);
        System.out.println(clone2 + " | " + clone.friend);
        System.out.println(clone3 + " | " + clone.friend);
        System.out.println(clone4 + " | " + clone.friend);

    }
}
