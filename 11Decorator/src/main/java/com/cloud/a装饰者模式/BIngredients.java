package com.cloud.a装饰者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 14:33
 */
public class BIngredients extends Decorator {

    public BIngredients(Drink obj) {
        super(obj);
        setDes("食材2");
        setPrice(1);
    }
}
