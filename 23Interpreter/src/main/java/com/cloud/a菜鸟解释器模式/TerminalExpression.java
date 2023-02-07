package com.cloud.a菜鸟解释器模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 4:41
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
