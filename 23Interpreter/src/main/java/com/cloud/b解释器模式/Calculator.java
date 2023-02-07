package com.cloud.b解释器模式;


import java.util.*;



/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 4:56
 */
public class Calculator {
    private Expression expression;

    public Calculator() {
    }

    public Calculator(String expStr) {
        setExpression(expStr);
    }

    public void setExpression(String expStr) {
        final List<String> operatorHigher = Arrays.asList("*", "/");
        final List<String> operatorLower = Arrays.asList("-", "+");
        //表达式拆分
        String[] charArray = expStr.split("");
        //将数据压入栈
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            Expression expression;
            String element = charArray[i];
            if (operatorHigher.contains(element)) {
                expression = stack.pop();
                switch (element) {
                    case "*":
                        if (!(expression instanceof VarExpression)) {
                            ((SymbolExpression) expression).setRight(new MultiplyExpression(((SymbolExpression) expression).getRight(), new VarExpression(charArray[++i])));
                        } else {
                            expression = new MultiplyExpression(expression, new VarExpression(charArray[++i]));
                        }
                        break;
                    case "/":
                        if (!(expression instanceof VarExpression)) {
                            ((SymbolExpression) expression).setRight(new DivideExpression(((SymbolExpression) expression).getRight(), new VarExpression(charArray[++i])));
                        } else {
                            expression = new DivideExpression(expression, new VarExpression(charArray[++i]));
                        }
                        break;
                }
            } else if (operatorLower.contains(element)) {
                expression = stack.pop();
                switch (element) {
                    case "-":
                        expression = new SubtractExpression(expression, new VarExpression(String.valueOf(charArray[++i])));
                        break;
                    case "+":
                        expression = new AddExpression(expression, new VarExpression(String.valueOf(charArray[++i])));
                        break;
                }
            } else {
                expression = new VarExpression(element);
            }
            stack.push(expression);
        }
        this.expression = stack.pop();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("a+b*c*b*a+a");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(calculator.expression.interpreter(map));
    }

}

abstract class Expression {
    abstract int interpreter(Map<String, Integer> var);
}

class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}

abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public Expression getRight() {
        return this.right;
    }

    public void setRight(Expression expression) {
        this.right = expression;
    }

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}

class SubtractExpression extends SymbolExpression {

    public SubtractExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}

class MultiplyExpression extends SymbolExpression {

    public MultiplyExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) * right.interpreter(var);
    }
}

class DivideExpression extends SymbolExpression {

    public DivideExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) / right.interpreter(var);
    }
}

