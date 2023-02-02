package com.cloud.b浅拷贝一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:59
 */

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1, "喜羊羊");
        Sheep clone = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();

        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);

    }
}
