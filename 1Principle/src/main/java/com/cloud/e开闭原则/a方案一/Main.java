package com.cloud.e开闭原则.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/15
 * @Time 22:21
 */



/*
违反了开闭原则
我们给这个模块添加新的功能的时候，也需要动原本的代码
*/



public class Main {
    public static void main(String[] args) {
        HuiTu huiTu = new HuiTu();
        huiTu.draw(new Circle());
    }
}

class HuiTu {
    public void draw(Shape r) {
        if (r.type == 1) {
            drawRectangle(r);
        }
        else if (r.type == 2) {
            drawCircle(r);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }

}

class Shape {
    int type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
}

