package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 5:36
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("男人"));
        objectStructure.attach(new Woman("女人"));
        objectStructure.attach(new OldMan("老人"));


        // 成功
        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
