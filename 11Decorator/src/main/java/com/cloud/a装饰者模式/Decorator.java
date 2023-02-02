package com.cloud.a装饰者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 14:21
 */
// 装饰者类
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return obj.getDes() + " " + super.getDes();
    }
}
