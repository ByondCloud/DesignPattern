package com.cloud.a访问者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 3:53
 */
public abstract class Action {

    // 得到男性的测评结果
    public abstract void getManResult(Man man);

    // 得到女性的测评结果
    public abstract void getWomanResult(Woman woman);

}
