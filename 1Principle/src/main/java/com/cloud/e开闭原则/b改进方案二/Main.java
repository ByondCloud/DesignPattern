package com.cloud.e开闭原则.b改进方案二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/15
 * @Time 22:40
 */

public class Main {
    public static void main(String[] args) {
        HuiTu huiTu = new HuiTu();
        huiTu.draw(new Circle());
    }
}

class HuiTu {
    public void draw(Shape r) {
        r.draw();
    }

}

abstract class Shape {

    public abstract void draw();

}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {


    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}


