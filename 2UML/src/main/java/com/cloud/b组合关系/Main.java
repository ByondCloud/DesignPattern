package com.cloud.b组合关系;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 5:22
 */
public class Main {

}

class Person {
    private Life life = new Life();
}

class Life {
    private Person person = new Person();
}
