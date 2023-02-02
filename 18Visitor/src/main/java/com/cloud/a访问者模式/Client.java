package com.cloud.a访问者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 5:36
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        // 成功
        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
