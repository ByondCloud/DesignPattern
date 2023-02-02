package com.cloud.a装饰者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 14:32
 */
// 具体的用料
public class AIngredients extends Decorator {

    public AIngredients(Drink obj) {
        super(obj);
        setDes("食材1");
        setPrice(3);
    }
}
