package com.cloud.d疯狂的字节计算器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 8:32
 */
public class Value extends AbstractExpression {

    private int value;

    Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context ctx) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}
