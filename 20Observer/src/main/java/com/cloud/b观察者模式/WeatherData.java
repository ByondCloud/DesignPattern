package com.cloud.b观察者模式;

import com.cloud.a普通的写法.CurrentConditions;

import java.util.ArrayList;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 7:11
 */
// 核心类 包含了最新的天气情况
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    // 观察者集合
    private ArrayList<Observer> observers = new ArrayList<>();;


    // 添加天气数据
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 并通知所有的观察者
        notifyObservers();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    // 通知所有观察者
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);

        }
    }
}
