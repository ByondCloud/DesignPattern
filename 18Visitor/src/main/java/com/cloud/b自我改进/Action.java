package com.cloud.b自我改进;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:53
 */

// 这个就是访问者
public abstract class Action {

    // 得到测评结果
    // 每个访问者会做的事
    public abstract void getResult(Person person);

}
