package com.cloud.b案例二;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/21
 * @Time 12:08
 */
// 享元工厂
public class FlyweightFactory {
    private static Map<String, IFlyweight> pool = new HashMap<String, IFlyweight>();

    // 因为内部状态具备不变性，因此作为缓存的键
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
