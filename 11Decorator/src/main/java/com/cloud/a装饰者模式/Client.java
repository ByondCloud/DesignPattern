package com.cloud.a装饰者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 14:35
 */
public class Client {
    public static void main(String[] args) {
        // 先点一份咖啡
        Drink coffee = new ACoffee();
        System.out.println(coffee.cost());
        System.out.println(coffee.getDes());
        System.out.println("----------------------");

        // 加入一份食材1【用材料来包裹住咖啡】
        coffee = new AIngredients(coffee);
        System.out.println(coffee.cost());
        System.out.println(coffee.getDes());
        System.out.println("----------------------");
        // 加入一份食材2
        coffee = new BIngredients(coffee);
        System.out.println(coffee.cost());
        System.out.println(coffee.getDes());
        System.out.println("----------------------");
        // 再加入一份食材1
        coffee = new AIngredients(coffee);
        System.out.println(coffee.cost());
        System.out.println(coffee.getDes());
        System.out.println("----------------------");
    }
}
