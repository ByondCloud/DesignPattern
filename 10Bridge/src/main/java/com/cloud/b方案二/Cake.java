package com.cloud.b方案二;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 13:08
 */
public class Cake extends Food{

    public Cake(Fruit fruit) {
        super(fruit);
    }

    @Override
    public void FoodName() {
        fruit.FruitName();
        System.out.println("蛋糕");
    }
}
