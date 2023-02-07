package com.cloud.b观察者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 3:15
 */

// 被观察者
public interface Subject {

    // 如果哪个观察者需要订阅，就注册进去
    public void registerObserver(Observer o);

    // 移除观察者
    public void removeObserver(Observer o);

    // 通知所有观察者
    public void notifyObservers();

}
