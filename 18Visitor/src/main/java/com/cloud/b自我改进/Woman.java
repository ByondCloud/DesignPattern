package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:56
 */

// 用了双分派，首先在客户端程序中，将具体的状态作为参数传递到Woman中
// 然后在Woman中，调用了作为参数的具体方法中的方法，同时将自己this作为参数传入方法

public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
