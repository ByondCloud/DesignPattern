package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:59
 */

// 具体访问者
public class Success extends Action {

    @Override
    public void getResult(Person person) {
        System.out.println(person.name + "成功");
    }
}
