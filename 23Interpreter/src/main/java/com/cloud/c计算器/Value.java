package com.cloud.c计算器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 7:37
 */
public class Value extends Expression {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    int interpreter() {
        return value;
    }
}
