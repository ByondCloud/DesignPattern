package com.cloud.a聚合关系;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 5:11
 */
public class Main {
    public static void main(String[] args) {

    }
}
// 这个也是个聚合关系
class Person {
    private IDCard idCard;

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}

class IDCard {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }
}
