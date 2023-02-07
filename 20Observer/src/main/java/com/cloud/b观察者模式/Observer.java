package com.cloud.b观察者模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/5
 * @Time 3:17
 */

// 观察者接口
public interface Observer {

    public void update(float temperature, float pressure, float humidity);

}
