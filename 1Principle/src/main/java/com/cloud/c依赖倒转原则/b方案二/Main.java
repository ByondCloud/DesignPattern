package com.cloud.c依赖倒转原则.b方案二;

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

interface IReceive {
    public String receive();
}

class Email implements IReceive{

    @Override
    public String receive() {
        return "电子邮件信息";
    }
}

class Person {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.receive());
    }
}

