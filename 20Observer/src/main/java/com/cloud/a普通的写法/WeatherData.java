package com.cloud.a普通的写法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/3
 * @Time 7:11
 */
// 核心类 包含了最新的天气情况
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;

    // 当数据更新的时候，就主动调用currentConditions对象的update方法，这样他们就能看到最新的信息
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    // 当数据有更新，就调用这个方法
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

}
