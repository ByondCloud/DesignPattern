package com.cloud.a普通的写法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 7:08
 */

// 这个可以理解为自己的网站
public class CurrentConditions {

    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气，是由WeatherData来调用 推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(temperature);
        System.out.println(pressure);
        System.out.println(humidity);
    }

}
