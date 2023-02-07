package com.cloud.a普通的写法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 7:18
 */
public class Client {
    public static void main(String[] args) {
        // 创建接入方
        CurrentConditions currentConditions = new CurrentConditions();

        WeatherData weatherData = new WeatherData(currentConditions);
        // 更新信息
        weatherData.setData(30, 150, 40);
    }
}
