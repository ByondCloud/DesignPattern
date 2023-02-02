package com.cloud.e深拷贝方式二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 3:59
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        SheepPen sheepPen = new SheepPen("青青草原");
        sheepPen.sheep = new Sheep("喜羊羊", 1, "白色");

        // 方式一
        SheepPen clone = (SheepPen) sheepPen.clone();
        System.out.println(clone.hashCode());
        System.out.println(sheepPen.hashCode());

    }
}
