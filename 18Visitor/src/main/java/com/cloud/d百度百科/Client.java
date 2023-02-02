package com.cloud.d百度百科;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/1
 * @Time 9:47
 */
abstract class Element {
    public abstract void accept(IVisitor visitor);

    public abstract void doSomething();
}

class ConcreteElement1 extends Element {
    public void doSomething() {
        System.out.println("这是元素1");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

class ConcreteElement2 extends Element {
    public void doSomething() {
        System.out.println("这是元素2");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

interface IVisitor {
    public void visit(ConcreteElement1 el1);

    public void visit(ConcreteElement2 el2);
}

class Visitor implements IVisitor {
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}

class ObjectStructure {
    public static List<Element> getList() {
        List<Element> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int a = ran.nextInt(100);
            if (a > 50) {
                list.add(new ConcreteElement1());
            } else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}

public class Client {
    public static void main(String[] args) {
        List<Element> list = ObjectStructure.getList();
        for (Element e : list) {
            e.accept(new Visitor());
        }
    }
}
