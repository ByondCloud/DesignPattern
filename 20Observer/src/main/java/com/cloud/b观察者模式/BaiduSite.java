package com.cloud.b观察者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 3:41
 */
public class BaiduSite implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气，是由WeatherData来调用 推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("百度 " + temperature);
        System.out.println("百度 " + pressure);
        System.out.println("百度 " + humidity);
    }
}
