package com.cloud.b方案二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 12:46
 */

public abstract class Food {
    //水果
    Fruit fruit;

    public Food(Fruit fruit) {
        this.fruit = fruit;
    }

    public abstract void FoodName();

}
