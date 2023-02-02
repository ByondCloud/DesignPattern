package com.cloud.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 12:25
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Mi());
        foldedPhone.open();
    }
}
