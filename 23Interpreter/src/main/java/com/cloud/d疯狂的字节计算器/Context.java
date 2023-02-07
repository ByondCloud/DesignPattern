package com.cloud.d疯狂的字节计算器;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 8:33
 */

public class Context {

    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, new Integer(value));
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}
