package com.cloud.d疯狂的字节计算器;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 8:34
 */
public class Client {

    public static AbstractExpression getAST(String sInput) {
        //接收字符串参数形如 "1+2-3"
        //将字符串解析到List valueAndSymbolList中存放
        List<String> valueAndSymbolList = new ArrayList<>();
        //先按照 加法符号 + 拆分为数组,以每个元素为单位使用 +连接起来存入List
        //如果以+ 分割内部还有减法符号 - 内部以减法符号- 分割
        //最终的元素的形式为 1,+,2,-,3
        String[] splitByPlus = sInput.split("\\+");
        for (int i = 0; i < splitByPlus.length; i++) {
            if (splitByPlus[i].indexOf("-") < 0) {
                valueAndSymbolList.add(splitByPlus[i]);
            } else {
                String[] splitByMinus = splitByPlus[i].split("\\-");
                for (int j = 0; j < splitByMinus.length; j++) {
                    valueAndSymbolList.add(splitByMinus[j]);
                    if (j != splitByMinus.length - 1) {
                        valueAndSymbolList.add("-");
                    }
                }
            }
            if (i != splitByPlus.length - 1) {
                valueAndSymbolList.add("+");
            }
        }
        //经过前面处理元素的形式为 1,+,2,-,3
        //转换为抽象语法树的形式
        AbstractExpression leftExpression = null;
        AbstractExpression rightExpression = null;
        int k = 0;
        while (k < valueAndSymbolList.size()) {
            if (!valueAndSymbolList.get(k).equals("+") && !valueAndSymbolList.get(k).equals("-")) {
                rightExpression = new Value(Integer.parseInt(valueAndSymbolList.get(k)));
                if (leftExpression == null) {
                    leftExpression = rightExpression;
                }
            }
            k++;
            if (k < valueAndSymbolList.size()) {
                rightExpression = new Value(Integer.parseInt(valueAndSymbolList.get(k + 1)));
                if (valueAndSymbolList.get(k).equals("+")) {
                    leftExpression = new Plus(leftExpression, rightExpression);
                } else if (valueAndSymbolList.get(k).equals("-")) {
                    leftExpression = new Minus(leftExpression, rightExpression);
                }
                k++;
            }
        }
        return leftExpression;
    }


    public static void main(String[] args) {

        Context ctx = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        Value v = new Value(1);

        ctx.assign(a, 1);
        ctx.assign(b, 2);
        ctx.assign(c, 3);
        ctx.assign(d, 4);
        ctx.assign(e, 5);
//
//        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);
//
//        System.out.println(expression + "= " + expression.interpret(ctx));

        AbstractExpression ast = getAST("14-2+4");
        System.out.println(ast.interpret(ctx));

    }
}
