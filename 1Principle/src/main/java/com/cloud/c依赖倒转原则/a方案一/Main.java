package com.cloud.c依赖倒转原则.a方案一;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/13
 * @Time 16:09
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息";
    }
}


class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

