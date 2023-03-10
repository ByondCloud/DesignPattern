package com.cloud.a享元模式;

import java.util.HashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 11:26
 */
// 网站工厂类
public class WebSiteFactory {

    // 集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
    public WebSite getWebSite(String type) {
        // 判断池中是否存在
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    // 获取网站分类的总数（看池中有多少个网站类型）
    public int getWebSiteCount() {
        return pool.size();
    }


}
