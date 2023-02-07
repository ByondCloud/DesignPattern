package com.cloud.c计算器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 7:37
 */
public class Add extends Expression {

    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
