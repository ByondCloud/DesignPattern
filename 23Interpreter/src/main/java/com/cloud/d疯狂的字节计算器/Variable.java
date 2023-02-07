package com.cloud.d疯狂的字节计算器;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 8:33
 */
public class Variable extends AbstractExpression {

    private String name;
    Variable(String name) {
        this.name = name;
    }


    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Variable) {
            return this.name.equals(
                    ((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
