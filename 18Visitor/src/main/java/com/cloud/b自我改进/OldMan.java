package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 9:25
 */
public class OldMan extends Person {

    public OldMan(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
