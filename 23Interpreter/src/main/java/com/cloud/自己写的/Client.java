package com.cloud.自己写的;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 9:05
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context("90+10-50");
        Add add = new Add();
        int interpret = add.interpret(context);
        System.out.println(interpret);
    }
}
