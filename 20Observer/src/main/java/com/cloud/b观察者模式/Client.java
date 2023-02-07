package com.cloud.b观察者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 3:37
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        // 把观察者注册进weatherdata
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        // 测试
        weatherData.setData(10, 100, 30);
        currentConditions.update(20, 200, 50);
        baiduSite.display();

    }
}
