package com.cloud.b自我改进;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 5:10
 */
public class ObjectStructure {

    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    // 增加到List
    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    // 显示测评情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }

}
