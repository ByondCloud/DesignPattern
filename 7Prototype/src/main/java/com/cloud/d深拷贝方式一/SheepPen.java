package com.cloud.d深拷贝方式一;

import java.io.Serializable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/19
 * @Time 10:30
 */
public class SheepPen implements Cloneable {

    public String name;
    public Sheep sheep;

    public SheepPen(String name) {
        this.name = name;
    }

    // 深拷贝实现
    // 方式一 使用clone方法
    // 思路就是 让引用类型自己也用一次clone
    // 羊圈先自己clone，因为name是String型，有池所以怎么样都是一样的
    // 然后是 羊圈里的羊 = 属性里的羊.自己的clone，他自己去clone一份过来

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SheepPen sheepPen = null;
        sheepPen = (SheepPen) super.clone();
        sheepPen.sheep = (Sheep) sheep.clone();
        return sheepPen;


    }
}
