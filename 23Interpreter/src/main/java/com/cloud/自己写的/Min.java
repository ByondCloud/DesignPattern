package com.cloud.自己写的;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 9:19
 */

public class Min extends Expression {
    @Override
    int interpret(Context context) {
        if (context.numSub == context.numList.size()) {
            return context.value;
        }
        context.value = context.value - context.numList.get(context.numSub);
        context.numSub += 1;

        if (context.signSub == context.signList.size()) {
            return context.value;
        }
        switch (context.signList.get(context.signSub)) {
            case "-":
                context.signSub += 1;
                return this.interpret(context);
            case "+":
                context.signSub += 1;
                return new Add().interpret(context);
            default:
                throw new RuntimeException("异常");
        }
    }
}
